import javax.swing.*;
public class Lab_Ice2 {
    public static void main(String[] args) {
        // โปรแกรมคำนวณเงินทอน โดยรับค่าจำนวนสินค้า ราคา และเงินที่เราจ่าย
        // แสดงค่าออกมาเป็นราคาของสินค้าทั้งหมด เงินที่จ่ายและเงินทอน หน้าต่างไหนเป็นเจ้าของ null เป็นค่าว่าง

        Integer[] amount = {1,2,3,4,5};
        int num = (Integer) JOptionPane.showInputDialog(null, "Select amount of Product",
                "Welcome to Store", JOptionPane.PLAIN_MESSAGE, null, amount, amount[0]);

        int money=0,price=0,change=0;
                price = Integer.parseInt(JOptionPane.showInputDialog(null, "Input product price", "Welcome to Store", JOptionPane.PLAIN_MESSAGE));
                price = num*price;
                money = Integer.parseInt(JOptionPane.showInputDialog(null, "Input money to return", "Welcome to Store", JOptionPane.PLAIN_MESSAGE));

        change = money - price;

        if (change >= price) {
            JOptionPane.showMessageDialog(null, "Total : "+price+"\nYour money : "+money+
                    "\nChange : "+change+" Baht", "Receipt", JOptionPane.INFORMATION_MESSAGE);
        }else if (change < price) {
            JOptionPane.showMessageDialog( null, "Your money is not enough!", "Warning", JOptionPane.ERROR_MESSAGE );
        }//end if

        JOptionPane.showMessageDialog(null, "Thank You ;)", "Bye Bye", JOptionPane.PLAIN_MESSAGE);
    }//end main
}//end class