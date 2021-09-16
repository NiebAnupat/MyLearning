public class CharacterMethod {
    public static void main(String[] args) {

        // การจัดการตัวอักษรต่าง ๆ
        char alphabet = 'A';
        char[] group = {'A', 'B', 'C', 'D'};
        System.out.println(alphabet);
        System.out.println(group[1]);

        // การใช้ Method พื้นฐานของ Character
        Character alphabet1 = new Character('A');
        System.out.println(alphabet1);

        // ตรวจสอบว่าเป็นตัวอักษรหรือไม่
        System.out.println(Character.isLetter(alphabet1)); // True

        // ตรวจสอบว่าเป็นตัวเลขหรือไม่
        System.out.println(Character.isDigit(alphabet1)); // False

        // ตรวจสอบพิมพ์ใหญ่พิมพ์เล็ก
        if (Character.isUpperCase(alphabet1)) {
            System.out.println(alphabet1 + " is upper");
        } else System.out.println(alphabet1 + "Char is lowwer");

        // การเปลียนจากพิมพ์ใหญ๋ไปสู่พิมพ์เล็ก ใช้คำสั่ง Character.toLowerCase(ข้อมูลที่ต้องการแปลง)
        // การเปลียนจากพิมพ์เล็กไปสู่พิมพ์ใหญ่ ใช้คำสั่ง Character.toUpperCase(ข้อมูลที่ต้องการแปลง)
        System.out.println(Character.toLowerCase(alphabet1));

    }
}
