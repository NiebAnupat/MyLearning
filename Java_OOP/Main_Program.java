public class Main_Program {
    public static void main(String[] args) {

        Employee em1 = new Employee();
        em1.setEm_id("0001");
        em1.setEm_name("Anupat Kaewmee");
        em1.setEm_salary(25000.0);
        em1.Display_Info();

        System.out.println("*******************************************");

        Programmer pm1 = new Programmer();
        pm1.setEm_id("0002");
        pm1.setEm_name("Nieb");
        pm1.setEm_salary(50000.0);
        pm1.setPm_skil("Java");
        pm1.Display_Info();
        pm1.Display_skill();

        System.out.println("*******************************************");

        Accounting ac1 = new Accounting("0003","Anupat",34000.0);

        System.out.println("*******************************************");

    }
}
