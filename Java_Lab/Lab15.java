import javax.swing.*;
import java.util.Scanner;

public class Lab15 {
    public static void main(String[] args) {

//        อลิสต้องการส่งรหัสบัตรATM ไปให้บ๊อบแต่เพื่อความปลอดภัยจึงได้นำตัวเลขเหล่านั้นมาซ่อนไว้ในประโยคเช่น
//        HE45L32LO458T6H359ISIS1BO589RNT34ODEVN80AJA
//        ซึ่งตัวเลขที่ถูกซ่อนอยู่จะถูกนำมาบวกกันเป็น
//        45+32+458+6+359+1+589+34+80 = 1604
//        นั้นคือบ๊อบจะสามารถใช้รหัส 1604 ในการกดรหัสบัตร ATM ได้นั้นเอง
//        โดยถ้าหากผลรวมที่ได้น้อยกว่า 4 หลักให้ทำการเติมเลข 0 ไปด้านหน้า

        Scanner sc = new Scanner(System.in);
        String ms = JOptionPane.showInputDialog("Enter password : ");
        //String ms = sc.nextLine();
        String temp = "";
        int password = 0;

        for (int i = 0; i < ms.length(); i++) {

            if (Character.isDigit(ms.charAt(i))) {
                temp += ms.charAt(i);
            }else if(!temp.equalsIgnoreCase("")){
                password+=Integer.parseInt(temp);
                temp="";
            }

            if( i == ms.length()-1){
                if(Character.isDigit(ms.charAt(i))){
                    password+=Integer.parseInt(temp);
                    temp="";
                }
            }

        }
        String password_st = String.valueOf(password);

        while(password_st.length()<4){
            password_st = "0"+password_st;
        }

        //System.out.println(password_st);
        JOptionPane.showMessageDialog(null,"Pass : "+password_st);


    }
}
