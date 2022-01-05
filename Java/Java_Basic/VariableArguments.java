public class VariableArguments {
    public static void main(String[] args) {

        // ใช้เพื่อทำให้ Method สามารถสร้าง Paramether เพื่อรองรับ Aruments ที่รับเข้าไปเองได้โดยไม่จำกัดจำนวน
        Summation(10, 20, 30, 100);
    }

    // โดยการใส่ ... หลังตัวแปรในช่อง Parameter ตามด้วยชื่อตามปกติ
    // โดยข้อมูลที่ส่งเข้าไปนั้นจะถูกเก็บอยู่ในรูป Array
    static void Summation(int... number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.println("Total = " + sum);
    }

}
