import java.util.*;

public class Throw_Method {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Integer : ");
        int num = sc.nextInt();
        TestThrowMethod(num);

    }


    static void TestThrowMethod(int a) throws Exception {
        try {
            if (a <= 0) {
                throw new Exception("Please more than 0");
            }
            System.out.println("Integer is : " + a);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        } finally {
            System.out.println("Your input value is : " + a);
        }
    }
}
