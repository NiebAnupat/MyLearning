import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

        // การเรียกใช้งาน Method ที่สร้างไว้
        System.out.println("Test Method 1");
        TestDisplay();

        System.out.println("___________________________");

        System.out.println("Test Method 2");
        Plus();

        System.out.println("___________________________");

        System.out.println("Test Method 3");
        // การใช้งาน Method ที่มีการรับส่งค่าข้อมูลจะต้องกำหนดข้อมูลที่จะใช้งานเสมอ
        // ข้อมูลที่เราส่งเข้าไป จะเรียกว่า Argument
        // สามารถนำไปประยุกต์ใช้ได้เช่น การรับค่าข้อมูลมาใช้งานใน Method
        TestMethod2("Anupat", 18); // message ที่ส่งเข้าไปคือ Anupat num ที่ส่งเข้าไปคือ 18

        System.out.println("___________________________");

        System.out.println("Test Method 4");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your fristname : ");
        String name1 = sc.nextLine();
        System.out.print("Enter your surname : ");
        String name2 = sc.nextLine();
        FullName(name1, name2);

        System.out.println("___________________________");

        System.out.println("Test Method 5");
        String MyName = getName();
        System.out.println(MyName);

        System.out.println("___________________________");

        System.out.println("Test Method 6");
        System.out.println(getName());
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your Salary : ");
        Double Salary = kb.nextDouble();
        Double Bonus = getBonus();
        System.out.println("Your Income is : " + (Salary + Bonus));

        System.out.println("___________________________");

        System.out.println("Test Method 7");
        int result = MaxNumber(10, 5); // รับตัวเลข 2 ค่า และนำไปหาค่าที่มากที่สุด แล้วจึงส่งค่านั้นกลับมา
        System.out.println("Maxnumber is : " + result); // แสดงผลค่าที่ส่งกลับมาที่ถูกเก็บไว้ในตัวแปร result

        System.out.println("___________________________");

        System.out.println("Test Method 8");
        int[] numberA = {10, 20, 30, 40, 50};
        DisplayArrayInt(numberA);

        String[] Student_Name = {"Anupat", "Sudarat", "Aiyara"};
        DisplayArrayString(Student_Name);

        System.out.println("___________________________");

        System.out.println("Test Method 9");
        int[] numberB = {100, 120, 330, 440, 50};
        System.out.println("Max Value is : " + MaxInArray(numberB));
        System.out.println("Min Value is : " + MinInArray(numberB));

        System.out.println("___________________________");

        System.out.println("Test Method 10");
        int[] numberC = {100, 120, 3030, 440, 50};
        System.out.println("Max Index is : " + MaxIndexInArrar(numberC));

        System.out.println("___________________________");

        System.out.println("Test Method 11");
        System.out.println("CompareArray");
        int[] valueA = {10, 20, 30, 40, 50};
        int[] valueB = {10, 20, 30, 40, 50};
        System.out.println("Result : " + CompareArray(valueA, valueB));

        System.out.println("___________________________");

        System.out.println("Test Method 11");
        int[] numA = {10, 20, 30};
        System.out.println("Before");
        DisplayArrayInt(numA);
        System.out.println("After");
        ShuffleElement(numA, 0, 2);
        DisplayArrayInt(numA);

        System.out.println("___________________________");

        System.out.println("Test Method 12");
        int[] numB = {10, 20, 30, 40, 50, 60};
        int[] numC = CopyArray(numB);
        System.out.println("Original : ");
        DisplayArrayInt(numB);
        System.out.println("Copy : ");
        DisplayArrayInt(numC);

        System.out.println("___________________________");

        System.out.println("Test Method 13");
        int[] search = {11, 23, 46, 400};
        System.out.println("Array Index : " + SearchElement(search, 46));

        System.out.println("___________________________");

        sc.close();
        kb.close();

    }
    // _________________________________________________________________________________________________________________________

    // Method คือชุดคำสั่งที่เขียนรวมกันเป็นกลุ่มเปรียบเสมือน Function
    // สามารถเรียกใช้ตอนไหนก็ได้ ทำให้โค๊ดได้สะดวก และเป็นระเบียบเรียบร้อยขึ้น
    // ใช้เพื่อลดความซับซ้อนของคำสั่งที่ต้องใช้บ่อย ๆ

    // Method มี 2 ประเภทคือ ที่มีการรับและส่งค่า และไม่มีการรับและส่งค่า

    // การสร้าง Method
    // ขึ้นต้นด้วย ตัวบอกประเภทการเข้าถึง(Modifier) เช่น private, public, static
    // ตามด้วย Datatype แต่ถ้าไม่ต้องการ return ค่าข้อมูลสามารถใช้ void ได้เลย
    // ตามด้วยชื่อ Method และวงเล็บ () ตามด้วยปีกกา {...}
    static void TestDisplay() {
        // กลุ่มทำสั่งที่ต้องการให้ทำงาน
        System.out.println("Test Method1");
        System.out.println("Test Method2");
    }

    // EX1
    static void Plus() {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a + b + c);
    }

    // _________________________________________________________________________________________________________________________

    // ต่อไปเป็นการสร้าง Method ที่มีการ รับ-ส่ง ค่าข้อมูล
    // โดยต้องสร้างตัวรับข้อมูล (parameter)
    // โดยการกำหนดประเภทของข้อมูลที่จะรับเข้ามาภายในวงเล็บหลังชื่อ Method

    // EX2
    static void TestMethod2(String message, int num) {
        // parameter คือ message และ num
        System.out.println("Message is : " + message);
        System.out.println("Number is : " + num);
    }

    // EX3
    static void FullName(String firstname, String surname) {

        System.out.println("Your Full Name is : " + firstname + " " + surname);

    }

    // _________________________________________________________________________________________________________________________

    // ต่อไปเป็น Method ที่มีการ return ค่าข้อมูล
    // โครงสร้างคือ Modifier + dataType ที่จะส่งออกมา + ชื่อ Method + () + {...}
    // สำหรับการทำงานภายใน Method ที่ต้องการส่งค่ามายังโปรแกรมหลัก

    // EX4
    static String getName() {
        return "Anupat Kaewmee";
    }

    // EX5
    static Double getBonus() {
        return 1000.0;
    }
    // *****เมื่อระบุ DataType ต้องทำการ return ข้อมูลชนิดนั้นเสมอ*****
    // *****เมื่อใส่ Void แทน Datatype จะไม่มีการ return ค่าข้อมูลออกไป
    // จะเป็นเพียงการทำงานเพียงอย่างเดียว

    // _________________________________________________________________________________________________________________________

    // Method ที่มีการรับค่าและ return ค่าข้อมูลออกไป
    // ใช้เพื่อรับค่าข้อมูลเข้ามาประมวลผลและส่งกลับไปยังโปรแกรม

    // EX6
    static int MaxNumber(int A, int B) {
        if (A > B) {
            return A;
        } else {
            return B;
        }
    }

    // _________________________________________________________________________________________________________________________

    // Method ที่รับค่า Array
    // เคิม [] หลัง Datatype ใน parameter ตามด้วยชื่อ

    // EX7
    static void DisplayArrayInt(int[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println("Number " + i + " is : " + number[i]);
        }
    }

    // EX8
    static void DisplayArrayString(String[] name) {
        for (int i = 0; i < name.length; i++) {
            System.out.println("Student " + i + " is : " + name[i]);
        }
    }

    // _________________________________________________________________________________________________________________________

    // Method รับค่า Array ที่มีการ return ค่าข้อมูลออกไป
    // modifier Datatype MethodName (Datatype[] ParameterName);

    // EX9
    static int MaxInArray(int[] number) {
        int MaxValue = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > MaxValue) {
                MaxValue = number[i];
            }
        }
        return MaxValue;
    }

    // EX10
    static int MinInArray(int[] number) {
        int MinValue = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < MinValue) {
                MinValue = number[i];
            }
        }
        return MinValue;
    }

    // _________________________________________________________________________________________________________________________

    // Method ที่ใช้ค้นหาตำแหน่ง(Index)ใน Array
    // ใช้ค่า i ใน loop แทนตำเหน่งของ Index
    // EX11
    static int MaxIndexInArrar(int[] arr) {
        int MaxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[MaxIndex]) {
                MaxIndex = i;
            }
        }
        return MaxIndex;
    }

    // _________________________________________________________________________________________________________________________

    // Method ที่ใช้เปรียบเทียบ Element ใน Array ว่ามีค่าเหมือนกันหรือไม่
    // EX12
    static boolean CompareArray(int[] a, int[] b) {

        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                return true;
            }
        }
        return false;
    }

    // _________________________________________________________________________________________________________________________

    // Method สลับค่าใน Array
    // EX13

    // x คือตำแหน่งที่เริ่มต้น
    // y คือตำแหน่งที่จะสลับ
    // 10 20 30 => 0,1,2
    // ต้องการให้เป็น
    // 30 20 10 => คือสลับตำแหน่งที่ 0 และ 2
    static void ShuffleElement(int[] a, int x, int y) {
        // สร้างตัวเก็บค่าชั่วคราว
        int temp = a[x];
        // เสร็จแล้วทำการแทนค่าในตำแหน่งที่ต้องการ
        a[x] = a[y];
        // จากนั้นให้นำค่าที่เก็บไว้มาแทนค่าที่สลับ
        a[y] = temp;

        // ผลลัพธ์คือ a[x] จะกลายเป็น a[y]
        // และ a[y] จะกลายเป็น a[x] โดยที่ตำแหน่งจะยังเหมือนเดิมแต่ข้อมูลใน Element
        // จะถูกสลับกัน

    }

    // _________________________________________________________________________________________________________________________

    // Method คัดลอกข้อมูลใน Array
    // คือการรับข้อมูลจาก Array และทำการเก็บค่านั้นไว้ แแล้วจึงออกไปยังโปรแกรม

    // EX14
    static int[] CopyArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    // _________________________________________________________________________________________________________________________

    // Method ค้นหาสมาชิกใน Array
    // และทำการ return คำแหน่ง(Index)ที่เจอออกไป ถ้าไม่เจอจะ return -1
    // EX15
    static int SearchElement(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number)
                return i;
        }
        return -1;
    }

}
