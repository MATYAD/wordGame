package WelcomeWindow.GridWindow;

import javax.swing.*;
import java.awt.*;

public class XLabel extends JLabel {
    public XLabel() {
        this.setText("X size");
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setFont(new Font("Didot", Font.BOLD, 30));
        this.setForeground(Color.ORANGE);
        this.setBounds(150,150,100,50);
    }
}
