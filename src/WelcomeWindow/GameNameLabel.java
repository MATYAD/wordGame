package WelcomeWindow;

import javax.swing.*;
import java.awt.*;

public class GameNameLabel extends JLabel {
    public GameNameLabel() {
        this.setText("WORD GAME");
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setFont(new Font("Didot", Font.BOLD, 69));
        this.setForeground(Color.ORANGE);
        this.setBounds(300,50,600,150);

    }
}
