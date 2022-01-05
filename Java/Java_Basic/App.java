import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.print("Please enter your name : ");

        Scanner t = new Scanner(System.in);
        String test = t.nextLine();

        if (test.equals("test")) {
            System.out.println("Success");
        }

        t.close();

    }
}
