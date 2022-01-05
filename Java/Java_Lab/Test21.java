import java.util.Scanner;
public class Test21 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = 0, Name = 0, Sell = 0;
        String Product = "",List = "";
        System.out.println("-----Product List-----");
        String [][]Subject = {{"Candy","5"},{"Jelly","10"},{"Snack","20"}};
        for (int i=0;i<Subject.length;i++){
            System.out.print(Subject[i][0]+ " : ");
            for (int j=1;j<Subject[i].length;j++){
                System.out.println(Subject[i][j]+" Baht");
            }
        }
        System.out.println("---------Buy---------");
        while(true){
            System.out.print("Enter Product : ");
            Product = sc.next();
            for (int i=0;i<3;i++) {
                if ( Product.equals( Subject[i][0] ) ) {
                    Name = Integer.parseInt( Subject[i][1] );
                }
            }
            if (Product.equals("-1")) break;
            System.out.print("Enter Number To Buy : ");
            Number = sc.nextInt();
            System.out.println("----------------------");
            List = List+Product+"\t"+(Name*Number)+" Baht"+"\n";
            Sell = Sell+(Name*Number);
        }
        System.out.println("-------Receipt--------");
        System.out.println(List);
        System.out.println("----------------------");
        System.out.print("Total Price : "+Sell+" Baht");
    }
}