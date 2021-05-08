import java.util.*;

public class HackerFS {
    private final Directory root;
    private Directory wd; // working directory

    /**
     * The constructor.
     *
     * Create a root folder with an empty String as name "" and null as parent.
     * Set the working directory to the root folder.
     */
    public HackerFS() {
        throw new RuntimeException("TODO");
    }

    // ----------------------------------------------------
    // Directory Functions

    public void enterDirectory() {
        throw new RuntimeException("TODO");
    }

    /**
     * Changes the current working directory to a subdirectory.
     *
     * @param name of the directory that we want to enter
     * @throws NoSuchFileOrDirectory if the directory name does not exist in the current working directory
     */
    public void enterDirectory(String name) throws NoSuchFileOrDirectory {
        throw new RuntimeException("TODO");
    }

    /**
     * Leave directory, i.e. change working directory to parent directory.
     * If the current working directory is root, do nothing.
     */
    public void leaveDirectory() {
        throw new RuntimeException("TODO");
    }

    /**
     * Return the name of the current working directory.
     *
     * @return name of the working directory.
     */
    public String getWorkingDirectory() {
        throw new RuntimeException("TODO");
    }

    /**
     * Creates a new directory inside the current working directory.
     *
     * @param name of the new directory
     * @throws AlreadyExists if a file or directory with the same name already exists in the current working directory.
     */
    public void createDirectory(String name) throws AlreadyExists {
        throw new RuntimeException("TODO");
    }

    // ----------------------------------------------------
    // File Functions

    /**
     * Create a new empty File inside the current working directory.
     *
     * @param name of the new file
     * @throws AlreadyExists if a file or directory with the same name already exists in the current working directory.
     */
    public void createEmptyFile(String name) throws AlreadyExists {
        throw new RuntimeException("TODO");
    }

    /**
     * Writes to a file inside the current working directory.
     *
     * @param name    of the file data should be written to.
     * @param content that should be written to the file. Existing content is overwritten.
     * @throws NoSuchFileOrDirectory if no file with name exists in the current working directory.
     */
    public void writeFile(String name, String content) throws NoSuchFileOrDirectory {
        throw new RuntimeException("TODO");
    }

    /**
     * Read content from a file inside the current working directory.
     *
     * @param name of the file which should be read.
     * @return content of the file
     * @throws NoSuchFileOrDirectory if no file with name exists in the current working directory.
     */
    public String readFile(String name) throws NoSuchFileOrDirectory {
        throw new RuntimeException("TODO");
    }

    // ----------------------------------------------------
    // Functions involving both Files and Directories

    /**
     * Remove a file or an empty directory inside the current working directory.
     *
     * @param name of the file or directory
     * @throws NoSuchFileOrDirectory if no file or directory exists
     * @throws NotEmpty in an attempt to remove a non-empty directory
     */
    public void remove(String name) throws NoSuchFileOrDirectory, NotEmpty {
        throw new RuntimeException("TODO");
    }

    // calls corresponding function of Directory class
    public String list() {
        throw new RuntimeException("TODO");
    }

    // calls corresponding function of Directory class
    public String listLong() {
        throw new RuntimeException("TODO");
    }

    // calls corresponding function of Directory class
    public String find() {
        throw new RuntimeException("TODO");
    }

    // calls corresponding function of Directory class
    public String find(String name) {
        throw new RuntimeException("TODO");
    }
}
