import java.util.Locale;
import java.util.StringTokenizer;
public class StringMethod {
    public static void main(String[] args) {

        // ข้อมูลแบบตัวแปร
        String name = "Anupat";
        String surname = "Kaewmee";

        // ข้อมูลแบบ Object
        String FullName = new String("Anupat Kaewmee");
        String City = new String("Ayutthaya");

        // Concatenation คือ การ String มาต่อกัน
        // ใช้ .concat
        String result = FullName + City;
        System.out.println(result.concat(" 13170"));

        // หาความยาว String ว่ามีกี่ตัวอักษร (รวมพื้นที่ว่าง)
        // ใช้ .length(
        // จะ return ค่าออกมาเป็น Integer (จำนวนเต็ม)
        System.out.println(FullName.length());
        System.out.println(result.length());

        // การใช้ตัวอักษรในตำแหน่งต่าง ๆ
        // ใช้ .charAt
        // ต้องระบุตำแหน่ง (Index) ที่ต้องการ
        System.out.println(FullName.charAt(2)); // Output คือ u เพราะอยู่ในตำแหน่งที่ 2

        // การเปรียบเทียบ String
        // .equals(ข้อมูลที่ต้องการเปรียบเทียบ)
        // จะ return ออกมาเป็นค่าทางตรรกะศาสตร์ (Ture, False)
        if (name.equals(surname)) System.out.println("Same");
        else System.out.println("Not Same");
        // .equalsIgnoreCase(ข้อมูลที่ต้องการเปรียบเทียบ) จะไม่สนใจถ้ามีความต่างพิมพ์เล็ก - พิมพ์ใหญ่
        if (name.equalsIgnoreCase(surname)) System.out.println("Same");
        else System.out.println("Not Same");

        // ตรวจสอบจุดหน้าสุดและหลังสุดว่าตรงตามที่กำหนดหรือไม่
        // จะ return ออกมาเป็นค่าทางตรรกะศาสตร์ (Ture, False)
        // หน้าสุดใช้คำสั่ง .startsWith(ข้อมูลที่ต้องการเปรียบเทียบ)
        System.out.println(FullName.startsWith("Anu"));
        // หลังสุดใช้คำสั่ง .endsWith(ข้อมูลที่ต้องการเปรียบเทียบ)
        System.out.println(FullName.endsWith("ABC"));

        // หาตำแหน่งคำในข้อความ
        // .indexOf("ข้อมูลที่ต้องการค้นหา")
        // จะ return ตำแหน่ง Index ที่เจอออกมา
        // ถ้าหาไม่เจอจะ return -1
        // ข้อมูลที่ return จะเป็น Integer เสมอ
        System.out.println(FullName.indexOf("Kaewmee"));

        // การตัดคำใน String
        // StringTokennizer คือคลาสที่ใช้ในการตัดคำ
        // ใช้งานได้ผ่านตัว Object
        StringTokenizer FN = new StringTokenizer(FullName); // สร้าง Object โดยเก็บข้อมูล String FullName
        System.out.println("Number of token : " + FN.countTokens()); // นับตัวแปร String FullName ว่ามีคำอยู่กี่คำ
        System.out.println("Frist name is : " + FN.nextToken()); // สั่งเรียกคำแรกจาก String FullName มาแสดง ก็คือ Anupat
        System.out.println("Surname name is : " + FN.nextToken()); // สั่งเรียกคำต่อไป String FullName มาแสดง ก็คือ Kaewmee

        // การแทนที่ข้อความ
        // .replace("ข้อความต้นทาง (target)","ข้อความที่ต้องการนำมาแทนที่ (replacement)")
        // .replaceFirst ใช้ในกรณีที่มีข้อความซ้ำกันหลายที่แต่ต้องการแทนที่เพียงจุดแรกทำนั้น รูปแบบการใช้เหมือน .replace ปกติ
        FullName = FullName.replace("Anupat", "Name"); // แทนที่ข้อความในส่วนของคำว่า Anupat ให้กลายเป็น Name
        System.out.println(FullName); // Output : คือ Name Kaewme จากตอนแรกที่เป็น Anupat Kaewmee

        // การหั่น String
        // .split("เครื่องหมายในการแบ่งส่วนข้อความ (regex)")
        // จะทำการหั่น String ออกเป็น Array โดยการกำหนดเครื่องหมายในการแบ่งข้อความแต่ละส่วน (regex)
        String StSplit = ("Table,Pencil,Ruler");
        String[] Data = StSplit.split(","); // สร้าง Array ที่ดึงข้อมูลในตัวแปร StSplit ออกมาโดยใช้เครื่องหมาย , เป็นตัวแบ่งแต่ละ Element ใน Array
        System.out.println(Data[0]); // Output : Table

        // การหาข้อความย่อย
        // .subString(จุดเริ่มต้น , จุดสุดท้าย+1)
        // เป็นการแบ่งบางส่วนของ String ออกมาเท่านั้น โดยต้องใส่ตำแหน่งเป็น Index ในการกำหนดตำแหน่งที่ต้องการแบ่งออกมา
        System.out.println(result.substring(0, 6)); // Output : คือ Anupat เพราะ Index ที่ใส่ไปคือ 0-6 เพราะคำสั่ง substring จะตัดตัวอักษรตัวสุดท้ายออกจึงต้องนำ Index ตัวสุดท้ายที่ต้องการนำไป +1
        System.out.println(result.substring(7)); // ในกรณีที่ไม่สุดจุดสิ้นสุด ก็จะดึงข้อมูลตั้งแต่ Index ที่ใส่เข้าไปจนถึงจุดจบของ String

        // การแปลง String => Character
        // .toCharArray();
        // โดยจะเก็บข้อมูล String ไว้ใน Char ในรูปแบบของ Array
        char[] StToChar = FullName.toCharArray();
        System.out.println(StToChar[0]); // Output : คือ A เพราะอยู่ในตำแหน่ง (Index) ที่ 0

        // การแปลง Array Character => String
        // String.copyValueOf(Char Array)
        // แปลงข้อมูล Char ที่เก็บไว้ในรูปแบบของ Array ไว้ในรูปแบบของ String
        String CharToSt = String.copyValueOf(StToChar);
        System.out.println(CharToSt);

        // การแปลง Int => String
        // String.valueOf(ข้อมูลที่ต้องการแปลงเป็น String)
        // โดยจะเก็บข้อมูลต่าง ๆ ไว้ในรูปแบบของ String
        int a = 152;
        String IntToSt = String.valueOf(a);
        System.out.println(IntToSt); // Output : 152

        // การตัดช่องว่างภายใน String
        // .trim()
        // โดยจะลบช่องว่างภายในข้อความออกไป
        String N = "     Anupat     ";
        System.out.println(N); // Output :      Anupat
        System.out.println(N.trim()); // Output : Anupat

        // การแปลงพิมพ์เล็กพิมพ์ใหญ่
        // .toUpperCase & .toLowerCase
        System.out.println(FullName.toUpperCase()); // Output : NAME KAEWMEE
        System.out.println(FullName.toLowerCase()); // Output : name kawmee
    }
}
