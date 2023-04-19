package WelcomeWindow.GridWindow;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class TextLabel extends JLabel {
    public TextLabel() {
        this.setText("choose your grid size");
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setFont(new FontUIResource("PixelMplus10-Regular.ttf",0,45));
        this.setForeground(Color.ORANGE);
        this.setBounds(100,25,400,100);
    }
}
