class Accounting extends Employee{

    public Accounting (String id,String name, Double salary){
        super(id, name, salary);
        System.out.println("Welcome new Accouter!");
    }

    public void setEm_bonus(){
        setBonus(15);
    }
}
