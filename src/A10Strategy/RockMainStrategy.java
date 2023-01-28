package A10Strategy;

public class RockMainStrategy {

    public static void main(String[] args) {
        int seed1 = Integer.parseInt("10");
        int seed2 = Integer.parseInt("20");

        Player player1 = new Player("KIM", new WinningStrategy(seed1));
        Player player2 = new Player("LEE", new ProbStrategy(seed2));

        for (int i = 0; i < 10; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("l~ Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("l~ Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("l~ Even....");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result: ");
        System.out.println(player1);
        System.out.println(player2);
    }
}