import javax.swing.text.html.Option;
import java.util.*;

public class Directory implements FSObject {
    private String name;
    private FSObject parent;
    private List<FSObject> content = new ArrayList<>();

    /**
     * The constructor
     *
     * @param name   Name of the directory
     * @param parent Parent FSObject of the directory
     */
    public Directory(String name, FSObject parent) {
        setName(name);
        setParent(parent);
    }

    // name getter
    @Override
    public String getName() {
        return this.name;
    }

    // name setter
    @Override
    public void setName(String name) {
        this.name = name;
    }

    // parent getter
    @Override
    public FSObject getParent() {
        return this.parent;
    }

    // parent setter
    @Override
    public void setParent(FSObject parent) {
        this.parent = parent;
    }

    /**
     * Determine the full path of the directory.
     * E.g. for a directory "d2" inside a directory "d1" which in turn is contained in the root folder,
     * one would get "/d1/d2/"
     *
     * @return full path of the directory.
     */
    @Override
    public String getPath() {
        String path = getName() + "/";
        if (getParent() != null) {
            path = getParent().getPath() + path;
        }
        return path;
    }

    /**
     * Removes the directory if it is empty.
     * If it has a parent directory, make sure to remove it from the directory's content list.
     *
     * @throws NotEmpty if the directory is not empty.
     */
    @Override
    public void remove() throws NotEmpty {
        if (isEmpty()) {
            ((Directory) getParent()).removeEntry(this);
            setName(null);
            setParent(null);
            this.content = null;
        } else {
            throw new NotEmpty("NotEmpty");
        }
    }

    /**
     * Checks if the directory is empty.
     *
     * @return true if the directory is empty.
     */
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    /**
     * Adds an FSObject to the list of directory's contents.
     * The parent attribute of the removed FSObject e is not modified here.
     *
     * @param e the element that should be added.
     * @throws AlreadyExists if the directory contains already an FSObject with the same name.
     */
    public void addEntry(FSObject e) throws AlreadyExists {
        for (FSObject o : this.content) {
            if (o.getName().equals(e.getName())) {
                throw new AlreadyExists("Already Exists");
            }
        }
        this.content.add(e);
    }

    /**
     * Removes an element from the directory's contents.
     * The parent attribute of the removed FSObject e is not modified here.
     *
     * @param e the element that should be removed from the directory's content list.
     */
    public void removeEntry(FSObject e) {
        this.content.remove(e);
    }

    /**
     * Check if the directory contains a file with a specific name
     *
     * @param name The name of the file
     * @return If the file is found, return an Optional with the File reference. Otherwise return an empty Optional instance.
     */
    public Optional<File> containsFile(String name) {
        for (FSObject o : this.content) {
            if (o.getName().equals(name) && o instanceof File) {
                return Optional.of((File) o);
            }
        }
        return Optional.empty();
    }

    /**
     * Check if the directory contains a directory with a specific name
     *
     * @param name The name of the directory
     * @return If the directory is found, return an Optional with the Directory reference. Otherwise return an empty Optional instance.
     */
    public Optional<Directory> containsDirectory(String name) {
        for (FSObject o : this.content) {
            if (o.getName().equals(name) && o instanceof Directory) {
                return Optional.of((Directory) o);
            }
        }
        return Optional.empty();
    }

    /**
     * Check if the directory contains an FSObject with a specific name
     *
     * @param name The name of the object
     * @return If the object is found, return an Optional with the FSObject reference. Otherwise return an empty Optional instance.
     */
    public Optional<FSObject> contains(String name) {
        for (FSObject o : this.content) {
            if (o.getName().equals(name)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }

    /**
     * List contents of the directory as String. Output one element per line. Output is not sorted.
     * For a directory containing a directory "d1" and a file "f1.txt" one would get for example "d1\nf1.txt"
     * ("\n" denotes a new line)
     *
     * @return Contents of the directory as multi-line String
     */
    public String list() {
        String list = "";
        for (FSObject o : this.content) {
            list += o.getName() + "\n";
        }
        return list;
    }

    /**
     * List contents of the directory as String. Output one element per line. Output is not sorted.
     * Provides additional information about files and directories:
     * - for a non empty directory "d1" one would get "d d1 (not empty)"
     * - for an empty directory "d2" one would get "d d2 (empty)"
     * - for a file "f1.txt" containing "Hello World" one would get "f f1.txt (size 11)"
     *
     * @return Contents of the directory with additional information as multi-line String
     */
    public String listLong() {
        String list = "";
        for (FSObject o : this.content) {
            if (o instanceof File) {
                list += "f " + o.getName() + " (size " + ((File) o).getSize() + ")\n";
            } else if (((Directory) o).isEmpty()){
                list += "d " + o.getName() + " (empty)\n";
            } else {
                list += "d " + o.getName() + " (not empty)\n";
            }
        }
        return list;
    }

    /**
     * Find all files and directories within the current directory (and subsequent subdirectories).
     *
     * @return A multi-line String with the full path of found files and directories.
     */
    public String find() {
        String list = "";
        for (FSObject o : this.content) {
            list += o.getPath() + "\n";
            if (o instanceof Directory) {
                list += ((Directory) o).find();
            }
        }
        return list;
    }

    /**
     * Find all files and directories within the current directory (and subsequent subdirectories)
     * whose name contains a certain searchTerm.
     *
     * @param searchTerm Term to search for in file and directory names.
     * @return A multi-line String with the full path of found files and directories.
     */
    public String find(String searchTerm) {
        String list = "";
        for (FSObject o : this.content) {
            if (o.getName().contains(searchTerm)) {
                list += o.getPath() + "\n";
            }
            if (o instanceof Directory) {
                list += ((Directory) o).find(searchTerm);
            }
        }
        return list;
    }
}