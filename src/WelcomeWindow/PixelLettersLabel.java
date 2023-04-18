package WelcomeWindow;

import javax.swing.*;

public class PixelLettersLabel extends JLabel {
    JLabel labelN = new JLabel();
    ImageIcon imageN = new ImageIcon("pixel_N.png");
    JLabel labelE = new JLabel();
    ImageIcon imageE = new ImageIcon("pixel_E.png");
    JLabel labelL = new JLabel();
    ImageIcon imageL = new ImageIcon("pixel_L.png");
    JLabel labelA = new JLabel();
    ImageIcon imageA = new ImageIcon("pixel_A.png");

    public PixelLettersLabel() {

        labelN.setBounds(75,100,180,180);
        labelN.setIcon(imageN);
        labelN.setHorizontalAlignment(JLabel.CENTER);
        labelN.setVerticalAlignment(JLabel.CENTER);
        labelN.setVisible(true);

        labelE.setBounds(950,400,175,175);
        labelE.setIcon(imageE);
        labelE.setHorizontalAlignment(JLabel.CENTER);
        labelE.setVerticalAlignment(JLabel.CENTER);
        labelE.setVisible(true);

        labelL.setBounds(150,450,180,180);
        labelL.setIcon(imageL);
        labelL.setHorizontalAlignment(JLabel.CENTER);
        labelL.setVerticalAlignment(JLabel.CENTER);
        labelL.setVisible(true);

        labelA.setBounds(850,100,180,180);
        labelA.setIcon(imageA);
        labelA.setHorizontalAlignment(JLabel.CENTER);
        labelA.setVerticalAlignment(JLabel.CENTER);
        labelA.setVisible(true);

    }
}
