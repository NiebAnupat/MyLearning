import java.util.ArrayList;
class Programmer extends Employee implements Info // สามารถ extends ได้เพียงคลาสเดียว ส่วน implements สามารถใช้ได้หลาย interface
{

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

    private String FullName = "";
    private String Tel = "";
    private String Address = "";

    // implements method from Info
    // เมื่อ implements interface ต้องทำการเรียก Method มา Override ทุกครั้ง

    @Override
    public void FullName(String Fullname) {
        this.FullName = Fullname;
    }

    @Override
    public void Tel(String Tel) {
        this.Tel = Tel;
    }

    @Override
    public void Address(String Address) {
        this.Address = Address;
    }
}
