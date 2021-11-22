import java.util.Scanner;

public class Lab04 {

//    คำอธิบาย
//    เรื่องเล่าจากโจทย์
//    แม้ว่าโปรแกรมในการบวก ลบ คูณ และ หารเลขจะเป็นเรื่องธรรมดา แต่ถ้าลองรับค่าตัวเลขมา 2 ตัวแล้วทำการ บวกลบคูณหารทั้งหมดในโปรแกรมเดียวหละ ? ให้ลองพัฒนาโปรแกรมดังกล่าวดูเพื่อทดสอบความสามารถกันเลย !

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = "+(num1+num2));
        System.out.println(num1 + " - " + num2 + " = "+(num1-num2));
        System.out.println(num1 + " * " + num2 + " = "+(num1*num2));
        System.out.println(num1 + " / " + num2 + " = "+(num1/num2));

    }

}
