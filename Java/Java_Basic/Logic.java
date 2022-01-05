public class Logic {
    public static void main(String[] args) {

        /*
          เครื่องหมายทางตรรกะศาสตร์
           AND = && คือและ
           OR  = || คือหรือ
           NOT = ! คือไม่ (ทำให้กลายเป็นเงื่อนไขตรงข้าม)
         */

        int num1 = 10, num2 = 25;

        boolean result1 = (num1 == num2); //false
        boolean result2 = (num1 < num2); //true

        //แสดงผลว่า result1 เป็นจริงหรือไม่
        System.out.println(result1); // คำตอบคือ false

        //แสดงผลว่า result2 เป็นจริงหรือไม่
        System.out.println(result2); // คำตอบคือ true

        //ตรวจสอบว่า resule1 และ resule2 เป็นจริงหรือไม่
        System.out.println(result1 && result2); // คำตอบคือ false เพราะ result1 ไม่เป็นจริง

        //ตรวจสอบว่า resule1 หรือ resule2 เป็นจริงหรือไม่
        System.out.println(result1 || result2); // คำตอบคือ true เพราะ result2 เป็นจริง
        System.out.println((num1 == num2) || (num1 < num2));

        // //ตรวจสอบว่า num1 และ num2 ไม่เท่ากันใช่หรือไม่ (เพราะใส่เครื่องหมาย ! ข้างหน้าทำให้จากกานตรวจสอบว่าเท่ากันกลายเป็นตรงข้าม ก็คือไม่เท่ากัน)
        System.out.println(!(num1 == num2)); // คำตอบคือ true เพราะ num1 ไม่เท่ากับ num2
    }
}
