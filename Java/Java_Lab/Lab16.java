import java.util.Random;
import java.util.Scanner;

public class Lab16 {
    public static void main (String[] args) {

        //จงเขียนโปรแกรมรับเมทริกซ์ขนาด m x n และให้ Scale ค่าภายในเมทริกซ์นั้นให้มีค่าอยู่ระหว่าง 0-1
        // โดยขนาดของเมทริกซ์จะต้องไม่เป็น 1x1 เช่น
        //        2
        //        2
        //        a
        //        b
        //        c
        //        d
        //        a b
        //        c d

        Scanner sc = new Scanner( System.in );
        Random rd = new Random();
        int col = sc.nextInt();
        int row = sc.nextInt();

        if ( ( col > 0 && col < 100 ) && ( row > 0 && row < 100 ) ) {

            double[][] matrix = new double[row][col];

            //            for (int i = 0; i < matrix.length; i++) {
            //                for (int j = 0; j < matrix[i].length; j++) {
            //                    matrix[i][j] = sc.nextDouble();
            //                }
            //            }

            for (int i = 0 ; i < matrix.length ; i++) {
                for (int j = 0 ; j < matrix[i].length ; j++) {
                    matrix[i][j] = rd.nextDouble( 10000 + 1 );
                }
            }

            for (int i = 0 ; i < matrix.length ; i++) {
                for (int j = 0 ; j < matrix[i].length ; j++) {
                    System.out.print( String.format( "%.4f\t", rescaling( matrix[i][j], min_value( matrix ), max_value( matrix ) ) ) );
                }

                System.out.println();
            }
        }
    }

    static double max_value (double[][] matrix) {
        double maxValue = matrix[0][0];
        for (int j = 0 ; j < matrix.length ; j++) {
            for (int i = 0 ; i < matrix[j].length ; i++) {
                if ( matrix[j][i] > maxValue ) {
                    maxValue = matrix[j][i];
                }
            }
        }
        return maxValue;
    }

    static double min_value (double[][] matrix) {
        double minValue = matrix[0][0];
        for (int j = 0 ; j < matrix.length ; j++) {
            for (int i = 0 ; i < matrix[j].length ; i++) {
                if ( matrix[j][i] < minValue ) {
                    minValue = matrix[j][i];
                }
            }
        }
        return minValue;
    }

    static double rescaling (double value, double min, double max) {
        return ( value - min ) / ( max - min );
    }
}
