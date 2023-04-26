package WelcomeWindow.GridWindow;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class TextLabel extends JLabel {
    public TextLabel() {
        this.setText("Choose your grid size");
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setFont(new Font("Didot", Font.BOLD, 45));
        this.setForeground(Color.ORANGE);
        this.setBounds(50,25,500,100);
    }
}
