public class Compare_Orerator {
    public static void main(String[] args) {
        
        /*
                เป็นการเปรียบเทียบข้อมูลโดยจะมีผลเป็น True/False

                == คือเครื่องหมายเท่ากับ
                != คือเครื่องหมายไม่เท่ากับ
                > คือเครื่องหมายมากกว่า
                > คือเครื่องหมายน้อยกว่า
                >= คือเครื่องหมายมากกว่าเท่ากับ
                <= คือเครื่องหมายน้อยกว่าเท่ากับ

        */

        //EX01

        int num1 = 10, num2 = 5;

        // เปรียบเทียบค่า num1 เท่ากับ num 2 หรือไม่และแสดงผลทันที
        System.out.println(num1 == num2);

        //EX02

        int n1 = 10, n2 = 5;

        // ใช้ในกรณีต้องการเก็บผลการเปรียบเทียบไว้ใช้งานต่อ
        boolean resuit = (n1 == n2);

        System.out.println(n1 + " มีค่าเท่ากับ " + n2 + " หรือไม่\n" + "ผลการตรวจสอบคือ " + resuit);

        //EX03

        int n3 = 50, n4 = 45;

        System.out.println(n3 + " มีค่าเท่ากับ " + n4 + " หรือไม่\n" + "ผลการตรวจสอบคือ " + (n3 == n4));
        System.out.println(n3 + " มีค่าไม่เท่ากับ " + n4 + " หรือไม่\n" + "ผลการตรวจสอบคือ " + (n3 != n4));
        System.out.println(n3 + " มีค่ามากกว่า " + n4 + " หรือไม่\n" + "ผลการตรวจสอบคือ " + (n3 > n4));
        System.out.println(n3 + " มีค่าน้อยกว่า " + n4 + " หรือไม่\n" + "ผลการตรวจสอบคือ " + (n3 < 4));

        System.out.println(n3 + " มีค่ามากกว่า " + n4 + " หรือเท่ากับ " + n4 + " หรือไม่\n" + "ผลการตรวจสอบคือ " + (n3 >= 4));
        System.out.println(n3 + " มีค่าน้อยกว่า " + n4 + " หรือเท่ากับ " + n4 + " หรือไม่\n" + "ผลการตรวจสอบคือ " + (n3 <= 4));

    }
}