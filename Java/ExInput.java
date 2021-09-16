import java.util.Scanner;

public class ExInput {
    public static void main(String[] args) {

        System.out.print("Please enter your name : ");

        // การรับค่าข้อมูลชนิดต่าง ๆ
        Scanner sc = new Scanner(System.in);

        // รับค่าจากคีย์บอร์ดบันทึกเป็น String เก็บไว้ในตัวแปร name
        String name = sc.nextLine();

        // แสดงผลข้อมูลที่รับมา
        System.out.print("Welcome  ");
        System.out.println(name);

        System.out.print("Please enter your birth year : ");
        // รับข้อมูลตัวเลขมาคำนวน
        Scanner y = new Scanner(System.in);

        // รับค่าจากคีย์บอร์ดบันทึกเป็น int เก็บไว้ในตัวแปร year
        int year = y.nextInt();

        int age = 2021 - year;
        System.out.print("You are " + age + " year old");

        sc.close();
        y.close();
    }
}
