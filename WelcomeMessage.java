
import javax.swing.*;

/*
JOptionPan class is used to dialog box like
 msg, confirm , input dialog box
 */

public class WelcomeMessage {
    JFrame f;

    WelcomeMessage(){
     JOptionPane.showMessageDialog(f,"Welcome to my code");

    }

    public static void main(String[] args) {
        new WelcomeMessage();
    }

}
