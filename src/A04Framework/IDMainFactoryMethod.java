package A04Framework;

import A04Idcard.IDCardFactory;

public class IDMainFactoryMethod {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");

        System.out.println("l~ --------------------------------------------------------------------------------------");

        card1.use();
        card2.use();
        card3.use();
    }
}
