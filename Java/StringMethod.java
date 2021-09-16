public class StringMethod {
    public static void main(String[] args) {

        // ข้อมูลแบบตัวแปร
        String name = "Anupat";
        String name2 = "Anupat";

        // ข้อมูลแบบ Object
        String FullName = new String("Anupat Kaewmee");
        String City = new String("Ayutthaya");

        // Concatenation คือ การ String มาต่อกัน
        // ใช้ .concat
        String result = FullName + City;
        System.out.println(result.concat(" 13170"));

        // หาความยาว String ว่ามีกี่ตัวอักษร (รวมพื้นที่ว่าง)
        // ใช้ .length()
        // จะ return ค่าออกมาเป็น Integer (จำนวนเต็ม)
        System.out.println(FullName.length());
        System.out.println(result.length());

        // หาตำแหน่งตัวอักษร (Index)
        // ใช้ .charAt
        // ต้องระบุตำแหน่ง (Index) ที่ต้องการ
        System.out.println(FullName.charAt(2));

        // การเปรียบเทียบ String
        // .equals(ข้อมูลที่ต้องการเปรียบเทียบ)
        // จะ return ออกมาเป็นค่าทางตรรกะศาสตร์ (Ture, False)
        if (name.equals(name2)) System.out.println("Same");
        else System.out.println("Not Same");
        // .equalsIgnoreCase(ข้อมูลที่ต้องการเปรียบเทียบ) จะไม่สนใจถ้ามีความต่างพิมพ์เล็ก - พิมพ์ใหญ่
        if (name.equalsIgnoreCase(name2)) System.out.println("Same");
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

    }
}
