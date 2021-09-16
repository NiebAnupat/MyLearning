import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        //เงื่อนไขแบบย่อ
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();


        //ตัวแปร = เงื่อนไข ? คำสั่งเมื่อเงื่อนไขเป็นจริง : คำสั่งเมื่อเงื่อนไขเป็นเท็จ;

        String result;
        result = num % 2 == 0 ? num + " = เลขคู่" : num + " = เลขคี่";
        System.out.println(result);

        sc.close();
    }
}
