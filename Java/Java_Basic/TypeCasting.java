public class TypeCasting {
    public static void main(String[] args) {

        //การแปลงชนิดข้อมูล

        //แปลงจากจำนวนเต็มเป็นทศนิยม
        int numInt = 10;

        double numDouble = numInt;
        System.out.println(numInt);
        System.out.println(numDouble);

        //แปลงจากทศนิยมเป็นจำนวนเต็ม
        double numDouble2 = 20.0;

        int numInt2 = (int) numDouble2;
        System.out.println(numDouble2);
        System.out.println(numInt2);
    }
}
