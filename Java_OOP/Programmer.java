import java.util.ArrayList;
class Programmer extends Employee{

    ArrayList Pm_skill = new ArrayList();

    public Programmer(){ System.out.println("Welcome new programmer!"); }
    public Programmer(String id,String name, Double salary){
        super(id, name, salary);
        System.out.println("Welcome new programmer!");
    }

    public void setEm_bonus(){
        setBonus(20);
    }

    public void setPm_skill (String...language) {
        for (int i = 0; i < language.length; i++) {
            Pm_skill.add(language[i]);
        }

    }

    public void Display_skill (){
        for (int i = 0; i < Pm_skill.size(); i++) {
            System.out.println("Programmer skill " + (i+1) + " : " + Pm_skill.get(i));
        }

    }
    

}
