import java.util.Scanner;
import java.lang.Math;

public class Lab_Ice {
    public static void main (String[] args) {
        Scanner sc = new Scanner( System.in );
        int defu = 2;
        double input = 0, a = 0, total = 0;
        System.out.print( "Input number : " );
        input = sc.nextInt();
        a = input % 2;

        if ( a == 0 ) {
            while (defu <= input) {
                total += Math.pow( defu, 2 );
                defu *= 2;
                System.out.println( total );
            }//end while
        } else
            System.out.println( "Can not calculate!" );
    }//end main
}//end class
