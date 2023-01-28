package A11Composite;

public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void printList() {
        super.printList();
    }

    @Override
    protected void printList(String prefix) {
        System.out.println("l~ prefix : " + prefix + " / " + this);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}