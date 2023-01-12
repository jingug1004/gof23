package A03TemplateMethod;

public class PrintMainTemplateMethod {

    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        d1.display();
        d2.display();

        System.out.println("l~ ========================================================================");

        AbstractDisplay e1 = new CharDisplay('K');
        AbstractDisplay e2 = new StringDisplay("Hello, world      .");

        e1.display();
        e2.display();
    }
}
