import java.util.*;

public class ThrowException {
    public static void main(String[] args) {

        // Throw คือการบังคับให้เกิด Exception กับตัวโปรแกรม
        // ใช้ในกรณีที่ต้องการจำกัดการทำงานต่าง ๆ ของโปรแกรมหรือต้องการสร้างเงื่อนไขการทำงานต่าง ๆ ว่าสามารถทำอะไรได้บ้าง
        // โดยเราสามารถใช้ Throw สร้าง Exception อื่น ๆ ได้นอกเหนือจากที่ภาษา Java มีอยู่ได้

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input Integer : ");
            int num = sc.nextInt();

            if (num < 0)
                throw new Exception("Input must be more than 0"); // ถ้าค่าที่รับเข้ามาน้อยกว่า 0 จะให้เกิด Exception ที่เราได้ทำการสร้างขึ้นผ่าน throw

            System.out.println("Integer is : " + num);

        } catch (Exception e) {
            System.out.println(e); // จะแสดงผล Exception ที่เราได้ทำการสร้างขึ้นหากค่าที่รับเข้ามาน้อยกว่า 0 // java.lang.Exception: Input must be more than 0
        }

    }
}
