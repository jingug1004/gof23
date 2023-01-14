package A04Idcard;

import A04Framework.Factory;
import A04Framework.Product;

public class IDCardFactory extends Factory {
    private int serial = 100;

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println("l~ product: " + product + "을 등록했습니다.");
    }
}