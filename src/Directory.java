import java.util.*;

public class Directory implements FSObject {
    /**
     * The constructor
     *
     * @param name   Name of the directory
     * @param parent Parent FSObject of the directory
     */
    public Directory(String name, FSObject parent) {
        throw new RuntimeException("TODO");
    }

    // name getter
    @Override
    public String getName() {
        throw new RuntimeException("TODO");
    }

    // name setter
    @Override
    public void setName(String name) {
        throw new RuntimeException("TODO");
    }

    // parent getter
    @Override
    public FSObject getParent() {
        throw new RuntimeException("TODO");
    }

    // parent setter
    @Override
    public void setParent(FSObject parent) {
        throw new RuntimeException("TODO");
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
        throw new RuntimeException("TODO");
    }

    /**
     * Removes the directory if it is empty.
     * If it has a parent directory, make sure to remove it from the directory's content list.
     *
     * @throws NotEmpty if the directory is not empty.
     */
    @Override
    public void remove() throws NotEmpty {
        throw new RuntimeException("TODO");
    }

    /**
     * Checks if the directory is empty.
     *
     * @return true if the directory is empty.
     */
    public boolean isEmpty() {
        throw new RuntimeException("TODO");
    }

    /**
     * Adds an FSObject to the list of directory's contents.
     * The parent attribute of the removed FSObject e is not modified here.
     *
     * @param e the element that should be added.
     * @throws AlreadyExists if the directory contains already an FSObject with the same name.
     */
    public void addEntry(FSObject e) throws AlreadyExists {
        throw new RuntimeException("TODO");
    }

    /**
     * Removes an element from the directory's contents.
     * The parent attribute of the removed FSObject e is not modified here.
     *
     * @param e the element that should be removed from the directory's content list.
     */
    public void removeEntry(FSObject e) {
        throw new RuntimeException("TODO");
    }

    /**
     * Check if the directory contains a file with a specific name
     *
     * @param name The name of the file
     * @return If the file is found, return an Optional with the File reference. Otherwise return an empty Optional instance.
     */
    public Optional<File> containsFile(String name) {
        throw new RuntimeException("TODO");
    }

    /**
     * Check if the directory contains a directory with a specific name
     *
     * @param name The name of the directory
     * @return If the directory is found, return an Optional with the Directory reference. Otherwise return an empty Optional instance.
     */
    public Optional<Directory> containsDirectory(String name) {
        throw new RuntimeException("TODO");
    }

    /**
     * Check if the directory contains an FSObject with a specific name
     *
     * @param name The name of the object
     * @return If the object is found, return an Optional with the FSObject reference. Otherwise return an empty Optional instance.
     */
    public Optional<FSObject> contains(String name) {
        throw new RuntimeException("TODO");
    }

    /**
     * List contents of the directory as String. Output one element per line. Output is not sorted.
     * For a directory containing a directory "d1" and a file "f1.txt" one would get for example "d1\nf1.txt"
     * ("\n" denotes a new line)
     *
     * @return Contents of the directory as multi-line String
     */
    public String list() {
        throw new RuntimeException("TODO");
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
        throw new RuntimeException("TODO");
    }

    /**
     * Find all files and directories within the current directory (and subsequent subdirectories).
     *
     * @return A multi-line String with the full path of found files and directories.
     */
    public String find() {
        throw new RuntimeException("TODO");
    }

    /**
     * Find all files and directories within the current directory (and subsequent subdirectories)
     * whose name contains a certain searchTerm.
     *
     * @param searchTerm Term to search for in file and directory names.
     * @return A multi-line String with the full path of found files and directories.
     */
    public String find(String searchTerm) {
        throw new RuntimeException("TODO");
    }
}