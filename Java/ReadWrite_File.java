import java.io.*;
public class ReadWrite_File {

    public static void main(String[] args) {

        // การอ่านและผ่านไฟล์ผ่าน Java
        // ต้องทำการ import java.io.*
        // ควรใช้ try catch เพื่อดักข้อผิดพลาดที่เกิดขึ้นเสมอ

        // สร้าง object Flie ขึ้นมาและบอกตำแหน่งที่อยู่ไฟล์ เพื่อใช้ในการอ่าน-เขียนไฟล์
        File TestReadFile = new File("TestReadWrite_File.txt"); // สร้าง object เพื่อใช้ทดลองอ่านไฟล์
        File TestWriteFile = new File("TestWrite_Flie.txt"); // สร้าง object เพื่อใช้ทดลองเขียนไฟล์


        // การเขียนไฟล์  ****************************************************************************************************************
        try{
            FileWriter Writer = new FileWriter(TestWriteFile); // ทำการเขียนไฟล์โดยใช้ FileWriter และอ่างอิงตำแหน่งไฟล์จาก object TestWriteFile
            FileWriter Writer2 = new FileWriter(new File("TestWrite_Flie2.txt")); // ทำการเขียนไฟล์โดยใช้ FileWriter และอ้างอิงตำแหน่งไฟล์โดยการ สร้าง object File ขึ้นโดยตรง
            Writer.write("Hello Test Write File 1"); // เปิดไฟล์ TestWrite_Flie.txt และเขียนข้อความลงไป
            Writer2.write("Hello Test Write File 2"); // เปิดไฟล์ TestWrite_Flie2.txt และเขียนข้อความลงไป
            System.out.println("Write File Done");
            System.out.println("Closing File.....");

            // ***เมื่อใช้งานไฟล์เสร็จแล้วต้องทำการปิดไฟล์ทุกครั้ง***
            Writer.close();
            Writer2.close();
            System.out.println("Close File Done");

        }catch(Exception e){
            System.out.println("Error : "+e);
        }
        // ****************************************************************************************************************************


        // การอ่านไฟล์  ****************************************************************************************************************
        try{

            FileReader Reader = new FileReader(TestReadFile);  // ทำการอ่านไฟล์โดยใช้ FileReader และอ่างอิงตำแหน่งไฟล์จาก object TestReadFile
            FileReader Reader2 = new FileReader(new File("TestWrite_Flie2.txt")); // ทำการอ่านไฟล์โดยใช้ FileReader และอ้างอิงตำแหน่งไฟล์โดยการ สร้าง object File ที่ชี้ตำแหน่งไปที่ไฟล์ TestWrite_Flie2.txt

            int data; // สร้างตัวแปร int เพื่อเก็บข้อมูล Unicode ที่อยู่ในไฟล์
            while ((data= Reader.read())!=-1){ // ใช้ while loop ในการเข้าถึงข้อมูลในไฟล์ โดยเงื่อนไขคือถ้าค่าที่เก็บไว้ในตัวแปร data ไม่เท่ากับ -1 ให้ทำลูปต่อต่อ ***จะมีค่าเป็น -1 เมื่อในไฟล์ไม่เหลือข้อมูลให้อ่านแล้ว
                //System.out.println(data); // ข้อมูลที่แสดงผลจะเป็นตัวเลข Unicode

                System.out.printf("%c",data); // ทำการแปลงเลข Unicode เป็นตัวอักษรโดยใช้ %c(ดึงข้อมูลมาในรูปแบบตัวอักษร) และอ้างอิงไปที่ data (ต้องใช้ printf คือคำสั่งแสดงผลข้อความแบบสามารถจัด Format ได้) *** printf เหมือนภาษา C
            }

        }catch(Exception e){
            System.out.println("Error : "+e);
        }
        // ****************************************************************************************************************************
    }

}
