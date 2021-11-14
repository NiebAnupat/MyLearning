import java.util.Scanner;

public class BMI_Ver1 {
    public static void main(String[] args) {

        // โปรแกรมคำนวนค่าดัชณีมวลกาย
        System.out.print("How much do you weigh? (kg): ");
        Scanner sc1 = new Scanner(System.in);
        double weight = sc1.nextDouble();

        System.out.print("How tall are you? (cm): ");
        Scanner sc2 = new Scanner(System.in);
        double height = sc1.nextDouble();
        height /= 100;

        double BMI;
        BMI = weight / (height * height);

        System.out.println("Your weight is " + weight);
        System.out.println("Your height is " + height);
        System.out.println("Your BMI is " + BMI);

        sc1.close();
        sc2.close();

    }


}
