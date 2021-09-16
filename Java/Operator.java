import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        
        /*
            Orerator = ตัวดำเนินการทางคณิตศาสตร์

                 + = เครื่องหมายบวก
                 - = เครื่องหมายลบ
                 * = เครื่องหมายคูณ
                 / = เครื่องหมายหารแบบจำนวนเต็ม
                 % = เครื่องหมายหารแบบแสดงเศษ
            
            ต้องสร้างตัวแปรมาเก็บข้อมูลในการใช้งาน
        */

        //EX01

        int num1, num2, num3;

        num2 = 10;
        num3 = 20;

        num1 = num2 + num3;

        System.out.println(num1);

        //EX02

        int A1, A2;

        A1 = 25;
        A2 = 13;

        System.out.println(A1 + A2);

        //EX03

        System.out.print("Enter  number 1 : ");
        Scanner n1 = new Scanner(System.in);

        int number1 = n1.nextInt();

        System.out.print("Enter  number 2 : ");
        Scanner n2 = new Scanner(System.in);

        int number2 = n2.nextInt();

        System.out.println("ผลบวกคือ " + (number1 + number2));
        System.out.println("ผลลบคือ " + (number1 - number2));
        System.out.println("ผลคูณคือ " + (number1 * number2));
        System.out.println("ผลหารคือ " + (number1 / number2));
        System.out.println("ผลหารได้เศษคือ " + (number1 % number2));

        n1.close();
        n2.close();

    }

}
