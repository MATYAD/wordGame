package WelcomeWindow.GridWindow;

import javax.swing.*;
import java.awt.*;

public class YLabel extends JLabel {
    public YLabel() {
        this.setText("Y size");
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setFont(new Font("Didot", Font.BOLD, 30));
        this.setForeground(Color.ORANGE);
        this.setBounds(150,250,100,50);
    }
}
