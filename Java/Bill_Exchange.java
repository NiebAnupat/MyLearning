import java.util.Scanner;

public class Bill_Exchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your money : ");
        int money = sc.nextInt();
        System.out.println("Your money have : " + money);

        if (money >= 1000) {
            System.out.println("You received 1000 bill " + (money / 1000) + " bill");
            money %= 1000;
        }
        if (money >= 500) {
            System.out.println("You received 500 bill " + (money / 500) + " bill");
            money %= 500;
        }
        if (money >= 100) {
            System.out.println("You received 100 bill " + (money / 100) + " bill");
            money %= 100;
        }
        if (money >= 50) {
            System.out.println("You received 50 bill " + (money / 50) + " bill");
            money %= 50;
        }
        if (money >= 20) {
            System.out.println("You received 20 bill " + (money / 20) + " bill");
            money %= 20;
        }
        sc.close();
    }
}
