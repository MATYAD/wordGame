package WelcomeWindow.GridWindow;

import javax.swing.*;
import java.awt.*;

public class GridFrame {
    JFrame frame = new JFrame();
    ImageIcon logoImage = new ImageIcon("logo.jpg");
    Grid1Button grid1Button = new Grid1Button(this);
    Grid2Button grid2Button = new Grid2Button(this);
    Grid3Button grid3Button = new Grid3Button(this);
    Grid4Button grid4Button = new Grid4Button(this);
    TextLabel textLabel = new TextLabel();
    public GridFrame() throws HeadlessException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Word Game");
        frame.setIconImage(logoImage.getImage());
        frame.setUndecorated(true);
        frame.getRootPane().setBorder(BorderFactory.createLineBorder(Color.ORANGE,5));
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setLayout(null);
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        frame.add(grid1Button);
        frame.add(grid2Button);
        frame.add(grid3Button);
        frame.add(grid4Button);
        frame.add(textLabel);

    }
    public final JFrame getFrame(){
        return frame;
    }
}
