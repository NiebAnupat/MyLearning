import java.util.*;
public class Throw_Method {

    // การจัดการ Exception ผ่าน Method ด้วย throws Exception
    public static void main(String[] args) throws Exception { // จุดนี้ใช้ throws Exception เพราะเรามี Exception หลายกรณีที่สามาถผ่านได้ โดยในการเขียน class หรือ Method ให้ใช้ thorws เท่านั้น
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Integer : ");
        int num = sc.nextInt();

        TestThrowMethod(num); // รับค่าเข้าไปใน Method ที่มีการ thorws Exception

    }


    // thorw คือคำสั่งที่ใช้ในการโยน Exception ที่เกิดขึ้นในโปรแกรม
    // กล่าวคือเป็นการเปิดช่องให้ Exception สามารถผ่านไปมาภายใน class หรือ Method ได้
    // จึงสามารถใช้ Method ในการหา Exception และแสดงผลที่คลาส Main ที่เปิดการ thorw Exception แล้ว

    // thorw และ thorws ต่างกันที่จำนวน Exception ที่จะผ่านเข้าไป
    // โดย thorws คือการผ่าน Exception หลาย ๆ ตัว แต่ thorw จะผ่านเพียงตัวเดียว

    static void TestThrowMethod(int a) throws Exception { // จุดนี้ใช้ throws Exception เพราะเรามี Exception หลายกรณีที่สามาถผ่านได้ โดยในการเขียน class หรือ Method ให้ใช้ thorws เท่านั้น
        try {
            if (a <= 0) {
                throw new Exception("Please more than 0"); // คำสั่ง throw new Exception คือการสร้าง Exception ขึ้นมาใหม่ตามที่เรากำหนดได้ ***จุดนี้ใช้ thorw เพราะเราทำการผ่าน Exception เข้าไปทำงานเพียงตัวเดียว
            }
            System.out.println("Integer is : " + a);
        } catch (Exception e) { // (e) Exception ที่เราทำการสร้างจะถูกเก็บถ้าจุดนี้ แต่หากเกิด Exception แบบอื่นก็จะถูกเก็บไว้ที่จุดนี้เช่นกัน
            System.out.println("Error : " + e); // ดึง Exception ที่เกิดขึ้นมาแสดงผล
        } finally {
            System.out.println("Your input value is : " + a); // แสดงผลค่าที่รับเข้ามาเมื่อทำทุกอย่างเสร็จแล้ว
        }
    }
}
