package GameWindow;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class TimeLabel extends JLabel {
    public TimeLabel() {
        this.setText("TIME LEFT");
        this.setBounds(550,50,100,50);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        //this.setFont(new FontUIResource("PixelMplus10-Regular.ttf",0,69));
        this.setForeground(Color.ORANGE);
    }
}
