package A03TemplateMethod;

public class A02StringDisplay implements A02AbstractDisplay {

    private String string;
    private int width;

    public A02StringDisplay(String string) {
        this.string = string;
        this.width = string.length();
    }


    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("l" + string + "l");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}