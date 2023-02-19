package A17Observer;

public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("l~ DigitObserver: " + generator.getNumber());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}
