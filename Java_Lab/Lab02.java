import java.util.Scanner;
public class Lab02 {

//    คำอธิบาย
//    รับ input เป็นตัวเลขจำนวนเต็ม a และ b จากนั้นให้ output ผลรวมของตัวเลขทั้ง 2 จำนวนออกทางจอภาพ บรรทัดแรก จำนวนเต็ม a โดยที่ 0 <= a <= 10^9 บรรทัดที่สอง จำนวนเต็ม b โดยที่ 0 <= b <= 10^9

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a >= 0 && a <= Math.pow(10,9)) && (b >= 0 && b <= Math.pow(10,9))) System.out.println(a+b);

    }

}
