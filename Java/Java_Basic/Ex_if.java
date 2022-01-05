import java.util.Scanner;

public class Ex_if {
    public static void main(String[] args) {

        // if คำสั่งที่ใช้สร้างเงื่อนไขในการทำงาน
        // else เมื่อตรวจเงื่อนไขเป็นเท็จ จะทำงานคำสั่งในวงเล็บ
        // else if เมื่อตรวจสอบเงื่อนไขเป็นเท็จ จะทำการตรวจสอบเงื่อนไขถัดไป

        //Ex01 if

        int num1 = 5, num2 = 10;
        boolean result = num1 < num2;

        // เมื่อเงื่อนไขในวงเล็บเป็นจริงจึงจะทำงานคำสั่งในวงเล็บต่อไป
        if (num1 < num2) {
            System.out.println("num2 มีค่ามากว่า num1");
        }

        if (result) {
            System.out.println("num2 มีค่ามากว่า num1");
        }

        // Ex02 if else
        System.out.print("Enter your age : ");
        Scanner a = new Scanner(System.in);
        int age = a.nextInt();

        if (age >= 18) {
            System.out.println("ยินดีด้วย! คุณโตแล้ว");
        } else {
            System.out.println("เสียใจด้วยนะ คุณยังเด็ก");
        }

        // Ex03 if else if
        System.out.print("Enter you score : ");
        Scanner s = new Scanner(System.in);
        double score = s.nextDouble();

        // เริ่มตรวจสอบคะแนนที่รับเข้ามาและแสดงผลการเรียนที่ได้
        if (score > 100 || score < 0) {
            System.out.println("Error!!!");
        } else if (score >= 80) {
            System.out.println("คุณเรียนเก่งมาก!!!");
        } else if (score >= 60) {
            System.out.println("ตุณเรียนดีปานกลาง");
        } else {
            System.out.println("กลับไปตั้งใจเรียน!!!");
        }

        // เมื่อคำสั่ง if ตรวจสอบและทำคำสั่งเรียบร้อยแล้ว จะออกมาทำคำต่อนอกปีกกาต่อไป
        System.out.println("End Ex03");

        // Ex04 if ซ้อน if
        System.out.print("How old are you? : ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();

        System.out.print("Are you Male or Female? : ");
        Scanner g = new Scanner(System.in);
        String sex = g.nextLine();

        System.out.print("Are you married? y/n : ");
        Scanner m = new Scanner(System.in);
        String status = m.nextLine();

        if (num >= 16) {
            {
                // ***การตรวจสอบว่าข้อความตรงกับที่ต้องการหรือใม่ใช้คำสั่ง .eauals ไม่สามารถใช้เครื่องหมาย == ได้
                if (sex.equals("Male")) {
                    System.out.println("คำนำหน้าของคุณคือ นาย");
                } else if (status.equals("y")) {
                    System.out.println("คำนำหน้าของคุณคือ นาง");
                } else {
                    System.out.println("คำนำหน้าของคุณคือ นางสาว");
                }
            }

        } else {
            if (sex.equals("Male")) {
                System.out.println("คำนำหน้าของคุณคือ เด็กชาย");
            } else {
                System.out.println("คำนำหน้าของคุณคือ เด็กหญิง");
            }
        }

        System.out.println("End Ex04");

        a.close();
        s.close();
        n.close();
        g.close();
        m.close();
    }
}

