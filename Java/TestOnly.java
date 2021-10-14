import java.util.*;
import java.io.*;

public class TestOnly {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length;i++){
            System.out.print("Input Value of Index "+i+" : ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length;i++){
            System.out.println("Index "+i+" is : "+arr[i]);
        }

        for (int data : arr) {
            System.out.println("Value is : " + data);
        }

    }
}
