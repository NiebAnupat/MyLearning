import java.util.Scanner;

public class Lab06 {

//    คำอธิบาย
//    เรื่องเล่าจากโจทย์
//    จากคราวที่แล้วที่พัฒนาโปรแกรมแสดงข้อความต้อนรับได้สำเร็จจนทำให้ลุงสมหมายประทับใจมาก !
//    แต่ความต้องการในการพัฒนาร้านของเขานั้นไม่ได้จบเพียงเท่านี้
//    ลุงสมหมายอยากจะให้โปรแกรมต้อนรับของเขาสามารถใส่ชื่อลูกค้าได้ด้วย !
//    ให้เราลองพัฒนาโปรแกรมดังกล่าวโดยดูจากผลลัพธ์ดังตัวอย่างของกรณีทดสอบ

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Welcome " + name + " !");
        System.out.println("Sommai 108 Eleven Shop");

    }

}
