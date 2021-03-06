import java.util.Scanner;

public class Lab09 {

//    คำอธิบาย
//    เรียนรู้ผ่านโจทย์ :
//    เครื่องหมาย % (Modulus) เครื่องหมาย % เป็นการหารเอาเศษ เป็นเครื่องหมายที่ใช้งานปกติเหมือนกับการ บวก ลบ คูณ และ หาร โดยใช้เครื่องหมาย % แทน เช่น 6 % 2, 7 % 2 และ 9 % 3 โดยจะได้ผลลัพธ์เป็น 0, 1 และ 0 ตามลำดับ โดยมีวิธีการคิดดังนี้
//    ตัวอย่างที่ 1 6 % 2 จะได้คำตอบว่า 0 เนื่องจาก 6 นำไปหารด้วย 2 จะเท่ากับ 3 และ เศษคือ 0
//    ตัวอย่างที่ 2 7 % 2 จะได้คำตอบว่า 1 เนื่องจาก 7 เมื่อหารด้วย 2 จะเท่ากับ 3 และเหลือเศษคือ 1
//    โดยเราจะสังเกตได้ง่าย ๆ ว่าถ้าหากหารแล้วลงตัวจะเหลือเศษ 0 เช่น 6%2 16%8 แต่กรณีที่หารไม่ลงตัวเช่น 7 % 2 ถ้าให้คิดง่าย ๆ ให้ลองนำตัวเลขด้านหลังคูณไปเรื่อยๆจนถึง หรือ ใกล้กับตัวเลขด้านหน้ามากที่สุด
//    เช่น กรณี 7 % 2 ให้นำ 2 x 2 x 2 (ใกล้ที่สุดคือนำมาคูณสามครั้ง ถ้าสี่ครั้งจะมีค่าเกิน 7) ซึ่ง ผลลัพธ์จะได้ = 6 แล้วให้เราดูว่าขาดจากตัวหน้าเท่าไหร่ กรณีนี้ 7 - 6 เหลือ 1 ก็จะเหลือเศษ 1 นั่นเอง
//    แล้วเวลาใช้งานหละ ? ก็อย่างที่ได้บอกไว้แล้ว เครื่องหมายดังกล่าวสามารถใช้ได้ในรูปแบบเดียวกับเครื่องหมาย บวก ลบ คูณ หาร เลยนั่นเอง เราสามารถใช้งานแทนลงในข้อมูล ตัวแปร หรือ การแสดงผลต่าง ๆ ได้เลยดังนี้

//    เรื่องเล่าจากโจทย์
//    ทุก ๆ การเรียนรู้เรามักจะได้รับสิ่งที่มีค่าที่สุดที่เรียกว่า "ประสบการณ์" นั่นเอง ดังนั้นแล้ว เด็กชาย เอ จึงมีความอยากรู้ว่าเครื่องหมาย % ว่ามันคืออะไร คำนวณยังไง
//    ซึ่งเขาอยากได้โปรแกรม สำหรับหัดเรียนรู้การคำนวณในรูปแบบดังกล่าวนั่นเอง ว่าเอาเลขนี้กับเลขนี้ไปหารเอาเศษกันแล้วได้ค่าเท่ากับเท่าไหร่นั่นเอง
//    ให้เราพัฒนาโปรแกรมดังกล่าว โดยดูจากกรณีทดสอบจากตัวอย่างด้านล่าง

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println( num1 % num2 );

    }

}
