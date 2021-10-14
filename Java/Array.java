public class Array {
    public static void main(String[] args) {

        //การสร้าง Array

        //การสร้าง Array ข้อมูลที่เก็บต้องมีชนิดเดียวกัน
        //การสร้าง Array แบบระบุจำนวนข้อมูลที่อยู่ใน Array
        //ในการสร้าง Array ต้องระบุจำนวนข้อมูลที่จะเก็บไว้อย่างชัดเจนและไม่สามารถเปลี่ยนได้

        int[] TestArray1 = new int[3]; //ระบุว่า Array ที่สร้างสามารถเก็บข้อมูลได้ 3 ตำแหน่ง หรือ 4 ค่า
        String[] TestArray2 = new String[3]; //ระบุว่า Array ที่สร้างสามารถเก็บข้อมูลได้ 3 ตำแหน่ง หรือ 4 ค่า

        //การสร้าง Arrat แบบระบุข้อมูลที่อยู่ใน Array
        int[] TestArray3 = {1, 2, 3, 4};
        String[] TestArray4 = {"Test1", "Test2", "Test3", "Test4"};

        //การเปลี่ยนค่าข้อมูลที่อยู่ใน Array
        //สามารถเข้าถึงเข้ามูลใน Array โดยการใช้ Index ระบุตำแหน่งของข้อมูลที่เก็บไว้
        //โดยที่ Index จะเริ่มนับจาก 0 ในตำแหน่งแรก

        TestArray1[0] = 10; //กำหนดค่าของตำแหน่งที่ 0 เป็น 10
        TestArray2[0] = "TestArray"; //กำหนดค่าของตำแหน่งที่ 0 เป็น TestArray

        TestArray3[3] = 5; //จะเปลี่ยนค่าในตำแหน่งที่ 3 จาก 4 เป็น 5
        TestArray4[3] = "Test5"; //จะเปลี่ยนค่าในตำแหน่งที่ 3 จาก Test4 เป็น Test5

        //แสดงผลข้อมูลใน Array โดยต้องกำหนดตำแหน่งที่จะแสดงผล
        System.out.println("Index 0 :" + TestArray1[0]);
        System.out.println("Index 0 :" + TestArray2[0]);
        System.out.println("Index 3 :" + TestArray3[3]);
        System.out.println("Index 3 :" + TestArray4[3]);
        System.out.println();

        //ข้อมูลใน Array จะเรียกว่า Element
        //การนับจำนวน Element ที่อยู่ใน Array
        int count = TestArray1.length;
        System.out.println("Element in TestArray1 is : " + count);
        System.out.println("Element in TestArray2 is : " + TestArray2.length);
        System.out.println();

        //การใช้ Array ร่วมกับ ForLoop

        //Loop เพื่อแสดงผลข้อมูลที่อยู่ใน Array
        System.out.println("Using ForLoop");
        for (int i = 0; i < TestArray4.length; i++) {
            System.out.println("Index " + i + " is : " + TestArray4[i]);
        }
        System.out.println();

        //การเข้าถึง Element ใน Array ด้วย ForEech
        //สามารถเข้าถึง Element ใน Array ได้โดยตรง
        //ใช้ในกรณีต้องการค่าข้อมูลอย่างเดียว ไม่ต้องการ Index เช่น การหาผลรวมของข้อมูล
        System.out.println("Using ForEach");
        for (int data : TestArray3) {
            System.out.println(data);
        }
        System.out.println();

        for (String data : TestArray4) {
            System.out.println(data);
        }
        System.out.println();


        //Array 2 มิติ
        //คือ Array ที่มี Element ภายในเป็น Array
        //เปรียบเสมือนตารางที่ใช้เก็บข้อมูล


        System.out.println("Array 2D");
        String[][] TestArray2D = {
                {
                        "Element 1.1", "Element 1.2", "Element 1.3", "Element 1.4"
                },
                {
                        "Element 2.1", "Element 2.2", "Element 2.3", "Element 2.4"
                },
                {
                        "Element 3.1", "Element 3.2", "Element 3.3", "Element 3.4"
                },
                {
                        "Element 4.1", "Element 4.2", "Element 4.3", "Element 4.4"
                }
        };

        //ให้เปรียบเทียบว่า Array ตัวแรกคือแถว(Row) และ Array ที่อยู่ภายในเป็นคอลัมน์(Column) จะเข้าใจได้ง่าย
        System.out.println("\n" +
                "\"Element 1.1\",\"Element 1.2\",\"Element 1.3\",\"Element 1.4\"\n" +
                "         \n" +
                "         \n" +
                "\"Element 2.1\",\"Element 2.2\",\"Element 2.3\",\"Element 2.4\"\n" +
                "         \n" +
                "         \n" +
                "\"Element 3.1\",\"Element 3.2\",\"Element 3.3\",\"Element 3.4\"\n" +
                "         \n" +
                "         \n" +
                "\"Element 4.1\",\"Element 4.2\",\"Element 4.3\",\"Element 4.4\"\n");
        //แสดงผลค่าข้อมูลที่อยู่ใน Index ตำแหน่งที่ 2 ของ Array ที่อยู่ในตำแหน่งที่ 3 ก็คือ Element 4.3
        System.out.println("Value of row 3 column 2 is : " + TestArray2D[3][2]);
        System.out.println();

        //ForLoop Array 2D
        //ต้องใช้ Loop ซ้อนกันเพื่อเข้าถึงข้อมูลของ Element แต่ละตัว
        System.out.println("ForLoop Array 2D");
        for (int row = 0; row < TestArray2D.length; row++) {
            for (int column = 0; column < TestArray2D[row].length; column++) {
                System.out.println("Row : " + row + " Column : " + column + " value is " + TestArray2D[row][column]);
            }
            System.out.println("_____________________________________________");
        }

    }
}
