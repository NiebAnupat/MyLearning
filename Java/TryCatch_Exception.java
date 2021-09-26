import java.util.*;

public class TryCatch_Exception {
    public static void main(String[] args) {

        // Exception คือข้อผิดพลาดที่เกิดขึ้นและส่งผลให้โปรแกรมหยุดทำงาน
        // โดยสามารถจัดการ Exception ต่าง ๆ ได้ผ่านคำสั่ง try - catch

        // try - catch
        // try คือการทำคำสั่งนั้น ๆ แต่หากเกิด Exception ขึ้นโปรแกรมจะย้ายไปทำคำสั่งของ catch แทน
        // แต่หากทำคำสั่งของ try แล้วไม่เกิดข้อผิดพลาดใด ๆ คำสั่งของ catch จะไม่ถูกเรียกใช้งาน

        // EX01
        try {
            System.out.println(10 / 0);
        } catch (Exception e) { // โปรแกรมจะทำการเก็บข้อผิดพลาดที่เกิดขึ้นไว้ใน e
            System.out.println("Error : " + e); // ดึงข้อผิดพลาดที่เกิดขึ้นออกมาแสดง
        }

        // EX02
        try {
            int[] a = {1, 2, 3};
            System.out.println(a[4]);
        } catch (Exception e) {
            System.out.println("Error : " + e); // Output : จะแสดงข้อผิดพลาดว่า Index เกินจากที่มีอยู่ภายใน Array a **(ArrayIndexOutOfBoundsException)** <- ประเภท Exception ที่เกิดขึ้น
        }

        // EX03
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input Integer : ");
            int number = sc.nextInt();
            System.out.println("Integer is : " + number);
        } catch (Exception e) { // หากข้อมูลที่ป้อนเข้ามาไม่ใช่ตัวเลขจำนวนเต็มจึงจะมาทำคำสั่งของ catch
            System.out.println("Please Input Only Integer!!!");
        }

        // EX04
        // catch แบบหลายเหตุการ์ณ คือการกำหนดประเภทของ Exception ต่าง ๆ ที่จะเข้ามากำหนดให้ทำงานในส่วนของ catch ในกรณีที่ต่างกันไป
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
        }
        // ทั้งนี้ Exception ยังมีอีกมากมาย สามารถดูประเภท Exception ได้ผ่านอินเทอร์เน็ตหรือหน้าต่างผลรันเมื่อเกิด Exception

        // EX05

    }
}
