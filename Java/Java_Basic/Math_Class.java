import java.lang.Math;
public class Math_Class {
    public static void main(String[] args) {

        // คลาส Math จะรวม Method ที่ใช้ในที่ใช้ในทางคณิตศาสตร์เอาไว้
        // เช่น ค่าคงที่ คำนวนค่าสัมบูรณ์ การปัดเศษตัวเลข การคำนวนหารากที่ 2 การคำนวนหาค่าเลขยกกำลัง การหาค่าต่ำสุด-สูงสุดของชุดตัวเลข
        // โดยดู Method ทั้งหมดได้ที่ https://www.w3schools.com/java/java_ref_math.asp

        // การเรียกใช้ค่าคงที่ต่าง ๆ
        System.out.println(Math.PI); // สามารถใช้ Math.PI เพื่อเรียกใช้ค่า π มาใช้ในโปรแกรมได้ เช่น การใช้หาพื้นที่วงกลม
        System.out.println(Math.E); // สามารถใช้ Math.E เพื่อเรียกใช้ค่า log ฐาน E มาใช้ในโปรแกรมได้

        // EX01
        int radius = 3;
        Double area = Math.PI * radius *radius; // สูตรหาพื้นที่วงกลม πr²
        System.out.println("Area = "+area); // แสดงผลพื้นที่วงกลม

        // ค่าสัมบูรณ์
        // คือจำนวนที่ไม่มีเครื่องหมายติดลบ
        int num = -10;
        System.out.println(Math.abs(num)); // Output เป็น 10 เพราะตัวแปร num จะกลายเป็นค่าสัมบูรณ์

        // การปัดเศษ
        Double num1 = 41.52;
        System.out.println(Math.ceil(num1)); // เรียกใช้ Method Math.ceil เพื่อปัดเศษขึ้น ***จะ retrun ค่าออกมาเป็น Double สามารถใช้ในการกำหนดค่าตัวแปรได้
        System.out.println(Math.floor(num1)); // เรียกใช้ Method Math.floor เพื่อปัดเศษลง ***จะ retrun ค่าออกมาเป็น Double สามารถใช้ในการกำหนดค่าตัวแปรได้

        // การปัดเศษแบบอิงทศนิยม
        // Math.rint()
        // >= .5 จะปัดขึ้น
        // < .5 จะปัดลง
        System.out.println(Math.rint(num1)); // Output เป็น 42.0 เพราะ 41.52 จุดทศนิยม >= .5

        // Math.round()
        // เหมือนกับ Math.rint() แต่จะ retrun ค่าออกมาเป็น Integer แทน
        // >= .5 จะปัดขึ้น
        // < .5 จะปัดลง
        System.out.println(Math.round(num1)); // Output เป็น 42 เพราะ 41.52 จุดทศนิยม >= .5

        // การหารากที่ 2 (square root)
        // Math.sqrt()
        System.out.println(Math.sqrt(10)); // หารากที่ 2 ของ 10 จะได้ Output เป็น 3.1622776601683795

        // การหาเลขยกกำลัง
        // Math.pow(ตัวเลข,เลขชี้กำลัง)
        System.out.println(Math.pow(4,6)); // จะหาค่าของ 4⁶ Output จะออกมาเป็น 4096.0

    }
}
