import java.util.Scanner;
public class Lab01 {

//    คำอธิบาย
//    ครอบครัวหนึ่งมีสมาชิกอยู่ 4 คน ได้แก่ พ่อ แม่ พี่ชาย และน้องสาว
//    มีอาหารอยู่ 2 อย่างคือ ข้าวมันไก่ และก๋วยเตี๋ยว
//    ครอบครัวนี้ได้ทำการโหวตว่าจะเลือกกินอย่างไหน
//    โดยที่อาหารชนิดไหนได้รับการโหวตมากสุดจะได้รับเลือกเป็นเมนูที่ครอบครัวจะกิน
//    แต่ถ้าผลโหวตเท่ากันให้เมนูที่น้องสาวเลือกเป็นเมนูที่ครอบครัวนี้จะกิน
//    # ข้าวมันไก่ = Chicken rice, ก๋วยเตี๋ยว = Noodle

//    รูปเเบบ Input
//    บรรทัดแรกเป็นชนิดอาหารที่พ่อเลือก
//    บรรทัดที่สองเป็นชนิดอาหารที่แม่เลือก
//    บรรทัดที่สามเป็นชนิดอาหารที่พี่ชายเลือก
//    บรรทัดที่สี่เป็นชนิดอาหารที่น้องสาวเลือก
//    หมายเหตุ: Input เป็นตัวอักษรพิมพ์เล็กหรือพิมพ์ใหญ่สลับกันก็ได้

//    รูปเเบบ Output
//    ตัวอักษรตัวแรกเป็นตัวพิมพ์ใหญ่ ที่เหลือเป็นตัวพิมพ์เล็ก

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cr = 0, nd = 0;
        String food = "", ans = "";

        for (int i = 1; i <= 4; i++) {
            food = sc.nextLine();
            if (food.equalsIgnoreCase("Chicken rice")) cr++;
            if (food.equalsIgnoreCase("Noodle")) nd++;
        }

        ans = food.substring(0,1).toUpperCase() + food.substring(1).toLowerCase();

        for (int i = 1; i <= 4; i++) {
            if (cr == nd) {System.out.println(ans); break;}
            else if (cr > nd) {System.out.println("Chicken rice"); break;}
            else {System.out.println("Noodle"); break;}
        }

    }

}
