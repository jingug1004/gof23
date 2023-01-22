package A06Singleton;

public class OneMainSingleton {

    public static void main(String[] args) {
        System.out.println("l~ Start.");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("l~ obj1과 obj2는 같은 인스턴스입니다.");
        } else {
            System.out.println("l~ obj1과 obj2는 같은 인스턴스가 아닙니다.");
        }

        System.out.println("l~ ======================================================");

        for (int i = 0; i < 10; i++) {
            System.out.println("l~ " + i + " : " + TicketMaker.getInstance().getNextTicketNumber());
        }

        System.out.println("l~ ======================================================");

        Triple a1 = Triple.getInstance("ALPHA");
        Triple b1 = Triple.getInstance("BETA");
        Triple c1 = Triple.getInstance("GAMMA");
        Triple a2 = Triple.getInstance("ALPHA");
        Triple b2 = Triple.getInstance("BETA");
        Triple c2 = Triple.getInstance("GAMMA");

        if (a1 == a2) {
            System.out.println("l~ a1 == a2 (" + a1 + ")");
        } else {
            System.out.println("l~ a1 != a2 (" + a2 + ")");
        }

        if (b1 == b2) {
            System.out.println("l~ b1 == b2 (" + b1 + ")");
        } else {
            System.out.println("l~ b1 != b2 (" + b2 + ")");
        }

        if (c1 == c2) {
            System.out.println("l~ c1 == c2 (" + c1 + ")");
        } else {
            System.out.println("l~ c1 != c2 (" + c2 + ")");
        }


        System.out.println("l~ End.");
    }
}
