import javax.swing.*;
import java.util.Scanner;

public class Lab14 {
    public static void main (String[] args) {
        //        หาราคาค่าเช่าห้องพักโดยคิดวันละ 500 บาทต่อจากราคาห้องพัก
        //        โดยมีเงื่อนไขต่อไปนี้ ถ้าพักไม่เกิน 5 วัน จะไม่มีส่วนลด
        //        ถ้าพัก 5-8 วัน จะมีส่วนลด 5% แต่ถ้าพักมากกว่า 8 วันขึ้นไปจะมีส่วนลด 10%
        //        Note : นักศึกษากาหนดรูปแบบการรับค่าหน่วยที่ใช้และแสดงผลเองนะคะ

        Scanner sc = new Scanner( System.in );
        System.out.print( "Enter day : " );
        int day = sc.nextInt();

        double price = 0;

        if ( day > 8 ) price = ( 500 * day ) - ( ( 500 * day ) * 0.1 );
        else if ( day >= 5 ) price = ( 500 * day ) - ( ( 500 * day ) * 0.05 );
        else price = 500 * day;

        System.out.println( "Total price : " + price );
        //JOptionPane.showMessageDialog(null,"Total price : "+price);
    }
}
