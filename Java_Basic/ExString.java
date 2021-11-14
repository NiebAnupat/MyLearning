public class ExString {
    public static void main(String[] args) {

        // ประเภทข้อมูลที่ใช้เก็บข้อความ
        String s = "Hello";
        System.out.println(s);

        String numString1 = "100", numString2 = "200";
        System.out.println(numString1);
        System.out.println(numString2);

        // String => int
        int num1, num2;
        num1 = Integer.parseInt(numString1);
        num2 = Integer.parseInt(numString2);

        num1 = num1 + num2;
        System.out.println(num1);

        // String => Double
        Double Double1, Double2;
        Double1 = Double.parseDouble(numString1);
        Double2 = Double.parseDouble(numString2);

        Double1 = Double1 + Double2;
        System.out.println(Double1);

        // Integer => String
        int num3 = 100;
        String age = String.valueOf(num3);

        System.out.println(age);

        // เช็กชนิดข้อมูลโดยใช้คำสั่ง instanceof

        Integer a = 20;
        double b;
        String c = "Hello";
        boolean d;
        char e;
        float f;

        // เป็น (true) / ไม่เป็น (false)
        boolean result = c instanceof String;
        System.out.println(result);


    }
}
