import java.util.Scanner;

public class Lab13 {

//    คำอธิบาย
//    เด็กชายเอ เป็นคนชอบดูโทรทัศน์ทั้งแต่เด็กเล็ก แม้ตอนนี้เขายังเด็กอยู่ เขาก็ยังชอบดูเจ้าสิ่งนี้อยู่ตลอด โดยรายการโปรดของเขาคือ "มวยปล้ำ" เขาต้องการที่จะเป็นนักกีฬามวยปล้ำเป็นงานอดิเรกของเขาในอนาคต
//    คุณพ่อเขาเลยได้แนะนำให้เขาไปยกน้ำหนัก เพื่อออกกำลังกายดู เขาชอบการออกกำลังกายประเภทนี้มาก ๆ จนเขาได้เรียนจนถึงระดับมัธยมศึกษาปีที่ 2
//    เขาได้เรียนรู้จัก "เลขยกกำลัง" จากวิชาคณิตศาสตร์ เขาประทับใจมาก และ สนใจกับเรื่องดังกล่าว เพราะมันออกเสียงคล้าย ๆ กับการ "ยกน้ำหนัก ออกกำลังกาย"
//    ที่พ่อเขาสอนมาตั้งแต่เด็ก จึงมีแนวคิดว่า ถ้าหากเขาได้พัฒนาโปรแกรมเกี่ยวกับสิ่งดังกล่าวหละก็ คงเป็นอะไรที่เท่มากแน่ ๆ เขาจึงพัฒนาโปรแกรมรับเลขไปจำนวนหนึ่งไปยกกำลังกับตัวเลขอีกตัวหนึ่ง
//    และแสดงผลออกมาบนหน้าจอให้เราพัฒนาโปรแกรมดังกล่าว โดยดูตัวอย่างได้จากกรณีทดสอบด้านล่าง

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println( (int) Math.pow(a,b));

    }

}
