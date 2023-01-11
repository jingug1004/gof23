package A02Adapter;

public class BannerMainAdapter {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();


        Print print02 = new PrintBanner("Hello02");
        print02.printWeak();
        print02.printStrong();
    }
}
