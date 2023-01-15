package A05Singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    public Singleton() {
        System.out.println("l~ 인스턴스를 생성했습니다.");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}