import java.util.*;
public class Finally {
    public static void main(String[] args) {

        // finally คือคำสั่งที่ต่อเนื่องมาจาก try-catch
        // ใช้หลังจบการทำงานในส่วนของ try-catch แล้ว
        // โดยที่คำสั่งใน finally คือคำสั่งที่จะทำเสมอไม่ว่าจะเกิด Exception หรือไม่ก็ตาม
        // โดยส่วนมากใช้กับคำสั่งสำคัญ ๆ เช่น Disconnect กับ Server หรือ Database
        // เมื่อทำงานเสร็จแล้วจะทำงานส่วนอื่นของโปรแกรมต่อไป

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input Integer 1 : ");
            int num1 = sc.nextInt();
            System.out.print("Input Integer 2 : ");
            int num2 = sc.nextInt();
            System.out.println("Divide Result : " + (num1 / num2));
        } catch (ArithmeticException e) { // จะเข้ามาทำงานตรงส่วนนี้เมื่อเกิดข้อผิดพลาดทางคณิตศาสตร์
            System.out.println("Please do not input 0");
        } catch (InputMismatchException e) { // จะเข้ามาทำงานตรงส่วนนี้เมื่อเกิดข้อผิดพลาดของข้อมูลที่รับเข้ามา
            System.out.println("Please Input Only Integer!!!");
        } finally {
            System.out.println("***Process done***"); // จะแสดงผลข้อความนี้แสดงแม้ว่าจะมีหรือไม่มี Exception ก็ตาม
        }
        // เมื่อทำงานเสร็จแล้วจะทำงานส่วนอื่นของโปรแกรมต่อไป......
    }
}
