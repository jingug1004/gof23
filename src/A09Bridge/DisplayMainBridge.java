package A09Bridge;

public class DisplayMainBridge {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(3);

        RandomCountDisplay d = new RandomCountDisplay(new StringDisplayImpl("Hello, Japan"));
        d.randomDisplay(5);

        CountDisplay cd = new CountDisplay(new FileDisplayImpl("C:\\Users\\A\\IdeaProjects\\untitled\\src\\A09Bridge\\star.txt"));
        cd.multiDisplay(3);

        IncreaseDisplay id1 = new IncreaseDisplay(new CahrDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay id2 = new IncreaseDisplay(new CahrDisplayImpl('|', '#', '-'), 2);
        id1.increaseDisplay(4);
        id2.increaseDisplay(6);


    }
}