package A02Adapter;

public class PrintBanner02 extends Print02 {

    private Banner banner;

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}