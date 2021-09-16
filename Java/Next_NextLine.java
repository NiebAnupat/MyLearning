import java.util.Scanner;

public class Next_NextLine {
    public static void main(String[] args) {

        System.out.print("Plese enter your name : ");

        // การรับค่าข้อมูลชนิดต่าง ๆ
        Scanner sc = new Scanner(System.in);

        // รับค่าจากคีย์บอร์ดบันทึกเป็น String เก็บไว้ในตัวแปร name

        // next จะอ่านค่าที่รับมาแต่จะไม่อ่านค่าว่าง
        String name1 = sc.next();

        // nextLine จะอ่านค่าที่รับมาทั้งหมด
        String name = sc.nextLine();


        // แสดงผลข้อมูลที่รับมา
        System.out.print("Welcome  ");
        System.out.println(name);

        sc.close();

    }

}
