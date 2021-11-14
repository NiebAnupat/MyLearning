public class Programmer extends Employee{

    public Programmer(){
        System.out.println("Welcome new programmer!");
    }

    private String Pm_skill = "";

    public void setPm_skil (String skill) {
        Pm_skill = skill;
    }

    public void Display_skill (){
        System.out.println("Programmer skill : "+Pm_skill);
    }

}
