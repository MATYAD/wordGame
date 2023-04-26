package WelcomeWindow.GridWindow;

import javax.swing.*;
import java.awt.*;

public class GridFrame {
    JFrame frame = new JFrame();
    ImageIcon logoImage = new ImageIcon("logo.jpg");
    XTextField xTextField = new XTextField();
    XLabel xLabel = new XLabel();
    YLabel yLabel = new YLabel();
    YTextField yTextField = new YTextField();
    SetButton setButton = new SetButton(this,xTextField,yTextField);

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

        frame.add(xTextField);
        frame.add(xLabel);


        frame.add(yLabel);
        frame.add(yTextField);


        frame.add(setButton);

        frame.add(textLabel);

    }
    public final JFrame getFrame(){
        return frame;
    }
}
