import java.util.Scanner;
public class Test22 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int Code = 0;
        String Object = "";
        System.out.print("Input Your Secret Code : ");
        String Number = sc.next();
        for (int i=0;i<Number.length();i++) {
            if ( Character.isDigit( Number.charAt( i ) ) ) {
                Object = Object + Number.charAt( i );
            } else if ( !Object.equals( "" ) ) {
                Code = Code + Integer.parseInt( Object );
                Object = "";
            }
            if ( i == Number.length() - 1 ) {
                if ( Character.isDigit( ( Number.charAt( i ) ) ) ) {
                    Code = Code + Integer.parseInt( Object );
                    Object = "";
                }
            }
        }
        Object = String.valueOf(Code);
            while(Object.length()<4){
                Object = "0"+Object;
        }
        System.out.println("Your Code Is : "+Object);
    }
}
