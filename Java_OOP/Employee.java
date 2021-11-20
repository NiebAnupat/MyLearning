abstract class Employee {

    public Employee () {
        System.out.println("Welcome new employee!");
    }

    public Employee (String id,String name, Double salary){
        setEm_id(id);
        setEm_name(name);
        setEm_salary(salary);
        Display_Info();
    }

    private String Em_id = "";
    private String Em_name = "";
    private double Em_salary = 0.0;
    private double Em_bonus = 0.0;

    public  void setEm_id (String em_id){
        Em_id = em_id;
    }

    public void setEm_name (String em_name){
        Em_name = em_name;
    }

    public void setEm_salary (Double em_salary){
        Em_salary = em_salary;
    }

    public abstract void setEm_bonus();

    protected void setBonus(int bonus){ Em_bonus = Em_salary*bonus/100; }

    public double getEm_Bonus (){ return Em_bonus; }

    public String getEm_id (){
        return Em_id;
    }

    public String getEm_name () {
        return Em_name;
    }

    public double getEm_salary () {
        return Em_salary;
    }

    public void Display_Info (){
        System.out.println("Employee ID : " + Em_id);
        System.out.println("Employee Name : " + Em_name);
        System.out.println("Employee Salary : " + Em_salary);
    }
}
