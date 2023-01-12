package A03TemplateMethod;

public class A02CharDisplay implements A02AbstractDisplay {

    private char ch;

    public A02CharDisplay(char ch) {
        this.ch = ch;
    }


    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}