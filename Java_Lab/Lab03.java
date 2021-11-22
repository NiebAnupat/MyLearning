import java.util.Scanner;

public class Lab03 {

//    คำอธิบาย
//    จงรับเลขจำนวนเต็ม มาทั้งหมดสองจำนวนเพื่อหาว่าจำนวนไหนมากกว่ากัน และ แสดงเป็นชื่อตัวแปรนั้นๆ ถ้ามีค่าเท่ากันให้แสดงเป็น "AB" บรรทัดแรกที่รับค่าคือตัวแปร A บรรทัดที่สองที่รับค่าคือตัวแปร B

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A == B) System.out.println("AB");
        else if (A > B) System.out.println("A");
        else System.out.println("B");

    }

}
