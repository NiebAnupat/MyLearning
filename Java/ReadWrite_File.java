import java.io.*;
import java.util.Scanner;

public class ReadWrite_File {

    public static void main(String[] args) {

        // การอ่านและผ่านไฟล์ผ่าน Java
        // ต้องทำการ import java.io.*
        // ***ต้องใช้ try-catch เพื่อดักข้อผิดพลาดที่เกิดขึ้นเสมอ***

        // สร้าง object Flie ขึ้นมาและบอกตำแหน่งที่อยู่ไฟล์ เพื่อใช้ในการอ่าน-เขียนไฟล์
        File TestReadFile = new File("TestReadWriteFile//TestRead_File.txt"); // สร้าง object เพื่อใช้ทดลองอ่านไฟล์
        File TestWriteFile = new File("TestReadWriteFile//TestWrite_Flie.txt"); // สร้าง object เพื่อใช้ทดลองเขียนไฟล์


        // การเขียนไฟล์  ****************************************************************************************************************
        try{
            FileWriter Writer = new FileWriter(TestWriteFile); // ทำการเขียนไฟล์โดยใช้ FileWriter และอ่้งอิงตำแหน่งไฟล์จาก object TestWriteFile
            FileWriter Writer2 = new FileWriter(new File("TestReadWriteFile//TestWrite_Flie2.txt")); // ทำการเขียนไฟล์โดยใช้ FileWriter และอ้างอิงตำแหน่งไฟล์โดยการ สร้าง object File ขึ้นโดยตรง
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

            FileReader Reader = new FileReader(TestReadFile);  // ทำการอ่านไฟล์โดยใช้ FileReader และอ้างอิงตำแหน่งไฟล์จาก object TestReadFile
            FileReader Reader2 = new FileReader(new File("TestReadWriteFile//TestWrite_Flie2.txt")); // ทำการอ่านไฟล์โดยใช้ FileReader และอ้างอิงตำแหน่งไฟล์โดยการ สร้าง object File ที่ชี้ตำแหน่งไปที่ไฟล์ TestWrite_Flie2.txt

            // โดยข้อมูลที่ได้จากการอ่านจะเก็บค่า Unicode ที่เป็น Integer ไว้จึงต้องใช้ตัวแปรประเภท int ในการเก็บค่าข้อมูลที่ทำการอ่านได้เสมอ
            int data; // สร้างตัวแปร int เพื่อเก็บข้อมูล Unicode ที่ได้จากการอ่านไฟล์
            while ((data = Reader2.read())!=-1){ // ใช้ while loop ในการเข้าถึงข้อมูลในไฟล์ โดยเงื่อนไขคือถ้าค่าที่เก็บไว้ในตัวแปร data ไม่เท่ากับ -1 ให้ทำลูปต่อ ***จะมีค่าเป็น -1 เมื่อในไฟล์ไม่เหลือข้อมูลให้อ่านแล้ว

                System.out.printf("%c",data); // ทำการแปลงเลข Unicode เป็นตัวอักษรโดยใช้ %c(ดึงข้อมูลมาในรูปแบบตัวอักษร) และอ้างอิงไปที่ data (ต้องใช้ printf คือคำสั่งแสดงผลข้อความแบบสามารถจัด Format ได้) *** printf เหมือนภาษา C
               // System.out.print(Character.toChars(data)); // แปลง Unicode มาเป็นตัวอักษรโดยใช้ Method toChars()

               // System.out.println("\tUnicode is : "+data); // ข้อมูลที่แสดงผลจะเป็นตัวเลข Unicode
            }

            System.out.println("\n");

        }catch(Exception e){
            System.out.println("Error : "+e);
        }
        // ****************************************************************************************************************************


        // BufferedWriter - BufferedReader ***********************************************************************************************************
        // เป็นการอ่านและเขียนไฟล์ที่ใช้สำหรับไฟล์ขนาดใหญ่ และมีความเร็วมากกว่า FileWriter-FileReader แบบปกติ
        // ในการใช้งานจะมีจุดที่ไว้พักข้อมูล ไม่เหมือน FileWriter-FileReader แบบปกติที่เป็นการเข้าถึงไฟล์ทีละส่วน จึงทำให้มีความเร็วมากกว่า
        // ในการใช้งานจะใช้กับ FileWriter-FileReader แต่จะใช้ object ฺBufferedWriter-BufferedReader เพื่อใช้ในการพักข้อมูล

        // BufferedWriter ************************************************
        try {

            System.out.println("Test BuggeredWriter Begin!!!!");

            System.out.println("Create Object.....");
            File f = new File("TestReadWriteFile//TestBufferedWriter1.txt"); // สร้าง object File เพื่อชี้ตำแหน่งไฟล์
            FileWriter fw = new FileWriter(f); // สร้าง object FileWriter ที่ชี้ตำแหน่งไฟล์จาก object File ที่ชื่อว่า f
            BufferedWriter bw = new BufferedWriter(fw); // ใช้ object BufferedWriter เป็นตัวพักข้อมูลจาก object FileWriter ที่ชื่อว่า fw

            BufferedWriter bw2 = new BufferedWriter(new FileWriter(new File("TestReadWriteFile//TestBufferedWriter2.txt"))); // เหมือนกับอันก่อนหน้าแต่ว่าย่อให้อยู่ในบรรเดียว เพราะจุดประสงค์หลักคือต้องการชี้ตำแหน่งของไฟล์

            System.out.println("Writting.....");
            // ทำการเขียนข้อมูลต่าง ๆ ลงในไฟล์
            bw.write("Hello");
            bw.write(" I'm Nieb\n"); // ใช้ \n เพื่อขึ้นบรรทัดใหม่
            bw.write("Test BufferedWriter 1");

            bw2.write("Hello");
            bw2.write(" I'm Nieb\n"); // ใช้ \n เพื่อขึ้นบรรทัดใหม่
            bw2.write("Test BufferedWriter 2");

            System.out.println("Closing File.....");
            bw.close();
            bw2.close(); // ปิดไฟล์

            System.out.println("Test BuggeredWriter Done!!!");

            System.out.println("\n");


        }catch(Exception e){
            System.out.println("Error : "+e);
        }

        // BufferedReader ************************************************
        try {

            System.out.println("Test BufferedReader Begin!!!!");

            System.out.println("Create Object.....");
            BufferedReader br = new BufferedReader(new FileReader(new File("TestReadWriteFile//TestBufferedWriter1.txt"))); // สร้าง object BufferedReader และทำการชี้ตำแหน่งไฟล์ที่ต้องการจะอ่าน

            System.out.println("Reading.....");
           // การใช้ BufferedReader ในการอ่านไฟล์จะมีความแตกต่างจาก FlieReader เพราะ BufferedReader สามารถอ่านไฟล์ทีละบรรทัดและจะ return ข้อมูลออกมาเป็น String เสมอ

            String temp = ""; // สร้างตัวแปร String เพื่อใช้ในการเก็บข้อมูลที่ได้จากการอ่าน

            while ((temp = br.readLine()) != null){ // การอ่านไฟล์และเก็บข้อมูลลงในตัวแปร String และตรวจสอบว่าถ้าข้อมูลในตัวแปรไม่เป็น null(ค่าว่างหรือไม่มีค่า) ให้ทำคำสั่งในลูป

                System.out.println(temp);

            }

            System.out.println("Test BufferedReader Done!!!");

            System.out.println("\n");

        }catch(Exception e){
            System.out.println("Error : "+e);
        }

        // ****************************************************************************************************************************

        // การใช้ Scanner ในการอ่านไฟล์

        try {

            System.out.println("Test Scanner!!!");

            System.out.println("Create Object.....");
            Scanner sc = new Scanner(new File("TestReadWriteFile//TestBufferedWriter2.txt"));

            System.out.println("Reading.....");
            String temp = "";
            while (sc.hasNext()){ // .hasNext คือ Method ที่ใช้เช็กว่ามีข้อมูลใน Scanner หรือไม่ ถ้ามีจะ return ค่าเป็น True
                temp = sc.nextLine();
                System.out.println(temp);
            }

            System.out.println("Test Scanner Done!!!");

            System.out.println("\n");

        }catch (Exception e){
            System.out.println("Error : "+e);
        }

        // ****************************************************************************************************************************

        // PrintWriter

        try {

            System.out.println("Test PrintWriter!!!");

            PrintWriter pw = new PrintWriter(new File("TestReadWriteFile//TestPrintWriter.txt"));

            int i=2;
            while (i<=5){
                for (int j=1; j <= 12; j++) {
                    int temp = i*j;
                    pw.println(i+" x "+j+" = "+temp);

                }
                pw.println("**********************************************");
                i++;
            }

            pw.close();
            System.out.println("Test Scanner Done!!!");

        }catch (Exception e){
            System.out.println("Error : "+e);
        }


    }

}
