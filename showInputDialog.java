import  javax.swing.*;


public class showInputDialog {
    JOptionPane f;

    showInputDialog(){
        f=new JOptionPane();
        String name= JOptionPane.showInputDialog(f,"Enter your Name");
        JOptionPane.showMessageDialog(f,"your Name is "+name);

    }
    public static void main(String[] args) {
        new showInputDialog();
    }
}
