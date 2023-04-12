package WelcomeWindow;

import javax.swing.*;

public class PixelLettersLabel extends JLabel {
    JLabel labelN = new JLabel();
    ImageIcon imageN = new ImageIcon("pixel_N.jpg");
    JLabel labelE = new JLabel();
    ImageIcon imageE = new ImageIcon("pixel_E.jpg");
    JLabel labelL = new JLabel();
    ImageIcon imageL = new ImageIcon("pixel_L.jpg");
    JLabel labelA = new JLabel();
    ImageIcon imageA = new ImageIcon("pixel_A.jpg");

    public PixelLettersLabel() {

        labelN.setBounds(50,200,205,205);
        labelN.setIcon(imageN);
        labelN.setHorizontalAlignment(JLabel.CENTER);
        labelN.setVerticalAlignment(JLabel.CENTER);
        labelN.setVisible(true);

        labelE.setBounds(900,100,205,205);
        labelE.setIcon(imageE);
        labelE.setHorizontalAlignment(JLabel.CENTER);
        labelE.setVerticalAlignment(JLabel.CENTER);
        labelE.setVisible(true);

        labelL.setBounds(100,500,205,205);
        labelL.setIcon(imageL);
        labelL.setHorizontalAlignment(JLabel.CENTER);
        labelL.setVerticalAlignment(JLabel.CENTER);
        labelL.setVisible(true);

        labelA.setBounds(500,400,205,205);
        labelA.setIcon(imageA);
        labelA.setHorizontalAlignment(JLabel.CENTER);
        labelA.setVerticalAlignment(JLabel.CENTER);
        labelA.setVisible(true);

    }
}
