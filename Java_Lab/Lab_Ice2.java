import javax.swing.*;
public class Lab_Ice2 {
    public static void main(String[] args) {
        int money=0,price=0,result=0;
        money = Integer.parseInt(JOptionPane.showInputDialog("Input money to return"));
        price = Integer.parseInt(JOptionPane.showInputDialog("Input product price"));

        result = money - price;

        if (result < price) {
            JOptionPane.showMessageDialog(null, "Your money is not enough!", "Warning", JOptionPane.ERROR_MESSAGE);
        }else
            JOptionPane.showMessageDialog(null, "Your change : "+result+" Baht");

        JOptionPane.showMessageDialog(null, "Thank You ;)");
        /*String name="",lastn="";
        int id=0;
        id = Integer.parseInt(JOptionPane.showInputDialog(frame, "Input ID"));
        name = JOptionPane.showInputDialog(frame, "Input Name");
        lastn = JOptionPane.showInputDialog(frame, "Input Lastname");

        JOptionPane.showMessageDialog(frame, "Information"+"\nID : "+id+"\nName : "+name+" "+lastn);

        int grade=0;
        grade = Integer.parseInt(JOptionPane.showInputDialog(frame, "Input Grade"));

        for (int i = 0 ; i < grade ; i++) {
            if (grade>4) {

            }
        }
        JOptionPane.showMessageDialog(frame, grade);*/
    }//end main
}//end class