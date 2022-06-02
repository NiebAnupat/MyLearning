import java.util.Random;
import java.util.Scanner;

public class Lab_Nieb {

    // นายอนุภัทร แก้วมี 6400922
    // จงเขียนโปรแกรมรับเมทริกซ์ขนาด m x n และให้ Scale ค่าภายในเมทริกซ์นั้นให้มีค่าอยู่ระหว่าง 0-1
    // โดยขนาดของเมทริกซ์จะต้องไม่เป็น 1x1 เช่น
    //        2
    //        2
    //        a
    //        b
    //        c
    //        d
    //        a b
    //        c d

    public static void main (String[] args) {

        Scanner sc = new Scanner( System.in );
        Random rd = new Random();

        System.out.print( "Enter Matrix Size m : " );
        int m = sc.nextInt();
        System.out.print( "Enter Matrix Size n : " );
        int n = sc.nextInt();

        if ( ( m != 1 && n != 1 ) && ( m > 0 && n > 0 ) ) {

            double[][] Matrix = new double[m][n];
            //            for (int i = 0 ; i < Matrix.length ; i++) {
            //                for (int j = 0 ; j < Matrix[i].length ; j++) {
            //                    System.out.print("Enter Value to Matrix : ");
            //                    Matrix[i][j] = sc.nextDouble();
            //                }
            //            }

            for (int i = 0 ; i < Matrix.length ; i++) {
                for (int j = 0 ; j < Matrix[i].length ; j++) {
                    Matrix[i][j] = rd.nextDouble( 1000 + 1 );
                }
            }

            for (int i = 0 ; i < Matrix.length ; i++) {
                for (int j = 0 ; j < Matrix[i].length ; j++) {
                    System.out.print( String.format( "%.4f\t", rescaling( Matrix[i][j], min( Matrix ), max( Matrix ) ) ) );
                }
                System.out.println();
            }
        }
    }

    private static double max (double[][] matrix) {
        double max = matrix[0][0];
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[i].length ; j++) {
                if ( matrix[i][j] > max ) max = matrix[i][j];
            }
        }
        return max;
    }

    private static double min (double[][] matrix) {
        double min = matrix[0][0];
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[i].length ; j++) {
                if ( matrix[i][j] < min ) min = matrix[i][j];
            }
        }
        return min;
    }

    private static double rescaling (double value, double min, double max) {
        return ( value - min ) / ( max - min );
    }

}
