package A04Idcard;

import A04Framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;

    IDCard(String owner, int serial) {
        System.out.println("l~ owner " + owner + "의 카드를 " + serial + " 번호로 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println("l~ this " + this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard: " + owner + "]";
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}