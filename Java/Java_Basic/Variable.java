public class Variable {
    public static void main(String[] args) {

        // การสร้างตัวแปร
        int number1;
        boolean status;
        char alphabet;
        float number2;
        double number3;

        // การสร้างตัวแปรแบบระบุค่า
        int num1 = 10;
        float num2 = 20.5f;
        char alpha1 = 'A';
        boolean stat = true;

        // การสร้างตัวแปรหลายตัวในครั้งเดียว
        // ต้องเป็นตัวแปรประเภทเดียวกัน
        int a = 0, b = 1, c = 2;

        // การเปลี่ยนค่าของตัวแปร
        num1 = 25;
        num1 = num1 + 2;
        alpha1 = 'B';

        // การสร้างตัวแปรที่ค่าคงที่
        // ตัวแปรค่าคงที่จะไม่สามารถเปลี่ยนค่าได้ทุกกรณี
        final int ONE = 1;
        final float TWO = 2.00f;
        final int THREE;
        final float FOUR;

        THREE = 3;
        FOUR = 4.00f;

        // แสดงผลตัวแปรออกทางจอภาพ
        System.out.println(num1);

        // ใช้เครื่องหมาย + เพิ่มการแสดงผลตัวแปรต่อจากข้อความ
        System.out.println("ค่าของตัวแปรคือ " + num1);

    }
}