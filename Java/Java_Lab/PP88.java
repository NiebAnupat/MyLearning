import java.util.*;
public class PP88 {
    //โปรแกรมรับค่าโค้ดมาแปลงเป็นตัวเลข 4 หลัก
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Code = 0;
    String Object = "";
    System.out.print("Input Your Secret Code : ");
    String Number = sc.next();
    for (int i=0;i<Number.length();i++){
        if (Character.isDigit(Number.charAt(i))){ //ใช้คำสั่ง Character.isDigit เพื่อตรวจสอบข้อมูลที่เป็นตัวเลข
            Object = Object+Number.charAt(i);
        }
        else if (!Object.equals("")){
            Code = Code+Integer.parseInt(Object);
            Object = "";
        }
        if (i==Number.length()-1){
            if (Character.isDigit((Number.charAt(i)))) {
                Code = Code + Integer.parseInt(Object);
                Object = "";
            }
        }
    }
    Object = String.valueOf(Code); //คำสั่ง valueof คือ
    while(Object.length()<4){
        Object = "0"+Object;
    }
    System.out.println("Your Code Is : "+Object);
    }
}
