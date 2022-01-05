import java.util.ArrayList;
import java.util.Scanner;

public class Lab_Pee {
    public static void main(String[] args) {
//        จงเขียนโปรแกรมแสดงรายการสินค้า 3 ตัวพร้อมราคาจากนั้นรับตัวแปร 2 ตัว
//        1.ชนิดสินค้า 2.จานวนสินค้า 3.ราคาสินค้า
//        รับไปเรื่อยๆจนกระทั้งพิมพ์ -1
//        จากนั้นแสดงสินค้า จำนวน และเงินที่ต้องชำระ

        Scanner sc = new Scanner(System.in);

        String[][] product_list = {{"Book","250","฿"},{"Ruler","50","฿"},{"Pen","15","฿"}};
        System.out.println("-----Product List-----");
        for (int i = 0; i < product_list.length; i++) {
            for (int j = 0; j < product_list[i].length; j++) {
                System.out.print(product_list[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("---------BUY----------");

        ArrayList<ArrayList> arr = new ArrayList<ArrayList>();
        int x=0;
        while (true) {
            String temp = "";
            System.out.print("Enter product : ");
            temp = sc.nextLine();
            if (temp.equalsIgnoreCase("-1"))break;
            arr.add(new ArrayList());
            arr.get(x).add(0,temp);

            System.out.print("Enter number to buy : ");
            temp = sc.nextLine();
            arr.get(x).add(1,temp);
            System.out.println("-------------------------");
            x++;
        }

        System.out.println("----------Recipt---------");
        double total_price=0.0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j)+"\t");
            }
            for (int k = 0; k < product_list.length; k++) {
                Double temp1=0.0;
                if (arr.get(i).get(0).equals(product_list[k][0])){
                    temp1 = Double.parseDouble(String.valueOf(arr.get(i).get(1))) * Double.parseDouble(product_list[k][1]);
                    System.out.print(temp1+"\n");
                    total_price+=temp1;
                }
            }

        }
        System.out.println();
        System.out.println("Total Price : "+total_price);
        System.out.println("-----------------------------");




    }
}
