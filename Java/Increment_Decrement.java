public class Increment_Decrement {
    public static void main(String[] args) {

        /*
            Prefix
            ++
                การใช้งาน ++a
                    คือการเพิ่มค่าให้ตัวแปร a 1 ค่าแล้วจึงนำไปใช้งาน
            --
                การใช้งาน --b
                    คือการลดค่าให้ตัวแปร b 1 ค่าแล้วจึงนำไปใช้งาน

            Postfix
            ++
                การใช้งาน a++
                    คือการนำค่าในตัวแปร a ไปใช้งานก่อนแล้วจึงเพิ่มค่าทีหลัง
            --
                การใช้งาน b--
                    คือการนำค่าในตัวแปร b ไปใช้งานก่อนแล้วจึงลดค่าทีหลัง
         */

        int PrePlus = 5, PreMinus = 10;

        //EX Prefix
        System.out.println("EX Prefix ++");
        System.out.println(PrePlus); // แสดงผลค่าในตัวแปร PrePlus คือ 5
        System.out.println(++PrePlus); // เพิ่มค่าอีก 1 ในตัวแปร PrePlus ก่อนจะแสดงผล คือ 6

        System.out.println("EX Prefix --");
        System.out.println(PreMinus); // แสดงผลค่าในตัวแปร PreMinus คือ 10
        System.out.println(--PreMinus); // ลดค่าอีก 1 ในตัวแปร PreMinus ก่อนจะแสดงผล คือ 9

        int PostPlus = 15, PostMinus = 20;
        //EX Postfix
        System.out.println("EX PostFix ++");
        System.out.println(PostPlus); // แสดงผลค่าในตัวแปร PostPlus คือ 15
        System.out.println(PostPlus++); // แสดงผลค่าในตัวแปร PostPlus และบวกเพิ่มอีก 1
        System.out.println(PostPlus); // แสดงผลค่าในตัวแปร PostPlus คือ 16 เพราะโดนบวกเพิ่มอีก 1

        System.out.println("EX PostFix --");
        System.out.println(PostMinus); // แสดงผลค่าในตัวแปร PostMinus คือ 20
        System.out.println(PostMinus--); // แสดงผลค่าในตัวแปร PostMinus และลดลงอีก 1
        System.out.println(PostMinus); // แสดงผลค่าในตัวแปร PostMinus คือ 19 เพราะโดนลดลงอีก 1


    }
}
