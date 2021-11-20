public class Main_Program {
    public static void main(String[] args) {

        System.out.println("*******************************************\n");

        Programmer pm1 = new Programmer();
        pm1.setEm_id("0002");
        pm1.setEm_name("Nieb");
        pm1.setEm_salary(50000.0);
        pm1.setPm_skill("Java");
        pm1.Display_Info();
        pm1.Display_skill();

        System.out.println("*******************************************\n");

        Accounting ac1 = new Accounting("0003","Anupat",34000.0);

        System.out.println("*******************************************\n");

        Programmer pm2 = new Programmer("0004","Kaewmee",35000.0);
        pm2.setPm_skill("Java","C#","C++","PHP");
        pm2.setEm_bonus();
        pm2.Display_skill();
        System.out.println("Bonus is : "+ pm2.getEm_Bonus());

        System.out.println("*******************************************\n");

    }
}
