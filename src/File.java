public class File implements FSObject {
    /**
     * The constructor.
     *
     * @param name Name of the file.
     * @param parent Parent FSObject of the file.
     */
    public File(String name, FSObject parent) {
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
     * Read contents of the file.
     *
     * @return content of the file
     */
    public String getContent() {
        throw new RuntimeException("TODO");
    }

    /**
     * Write content to file.
     *
     * @param content gets written to the file. Any existing content is overwritten.
     */
    public void setContent(String content) {
        throw new RuntimeException("TODO");
    }

    /**
     * Calculate size of the file contents.
     *
     * @return length of the content String
     */
    public int getSize() {
        throw new RuntimeException("TODO");
    }

    /**
     * Determine the full path of the file.
     * E.g. for a file "f1.txt" inside a directory "d1" which in turn is contained in the root folder,
     * one would get "/d1/f1.txt"
     *
     * @return full path of the file.
     */
    @Override
    public String getPath() {
        throw new RuntimeException("TODO");
    }

    /**
     * Removes the file.
     * If it has a parent directory, make sure to remove it from the directory's content list.
     */
    @Override
    public void remove() {
        throw new RuntimeException("TODO");
    }
}
