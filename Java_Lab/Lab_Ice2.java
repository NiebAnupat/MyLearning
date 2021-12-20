import javax.swing.*;
public class Lab_Ice2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        String name="",lastn="";
        int id=0;
        id = Integer.parseInt(JOptionPane.showInputDialog(frame, "Input ID"));
        name = JOptionPane.showInputDialog(frame, "Input Name");
        lastn = JOptionPane.showInputDialog(frame, "Input Lastname");

        JOptionPane.showMessageDialog(frame, "Information"+"\nID : "+id+"\nName : "+name+" "+lastn);
        JOptionPane.showMessageDialog(frame, "Success!","Alert", JOptionPane.WARNING_MESSAGE);
    }//end main
}//end class