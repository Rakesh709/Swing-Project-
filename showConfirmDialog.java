
import javax.swing.*;
import java.awt.event.*;

public class showConfirmDialog extends WindowAdapter {
    JFrame f;

    showConfirmDialog() {
        f = new JFrame();
        f.addWindowListener(this);
        //f.setSize(300, 300);
//        f = new JOptionPane();
        String name = JOptionPane.showInputDialog(f, "Enter your Name");
        JOptionPane.showMessageDialog(f, "your Name is " + name);
        f.setBounds(300, 300,200,200);


        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);


    }


    public void windowClosing(WindowEvent e) {
        int a = JOptionPane.showConfirmDialog(f, "Are you sure want to close!");
        if (a == JOptionPane.YES_OPTION) {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }


    public static void main(String[] args) {
        new showConfirmDialog();

    }
}
