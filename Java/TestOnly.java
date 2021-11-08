import java.util.*;
import java.io.*;

public class TestOnly {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Price : ");
        double price = sc.nextDouble();
        System.out.print("ค่าเสื่อมราคา (%) : ");
        double s = sc.nextInt();

        double temp1 = 0;
       for (int i =1; i <= 5;i++){

           temp1 = price*(s/100);
           price = price-temp1;
           System.out.println("ในปีที่ "+i+" ค่าเสื่อมราคาคือ : "+temp1);
           System.out.println("ราครสุทธิจะเหลือ : "+price);

           System.out.println("_______________________________________________");
       }

    }
}
