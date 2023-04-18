package WelcomeWindow;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;


public class GameNameLabel extends JLabel {

    static Font pixelMplus;


    public GameNameLabel() {
        this.setText("WORD GAME");
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setFont(new FontUIResource("PixelMplus10-Regular.ttf",0,69));
        this.setForeground(Color.ORANGE);
        this.setBounds(300,50,600,150);
        /*
        try {
            pixelMplus = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, new File("PixelMplus10-Regular.ttf")).deriveFont(69f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, new File("PixelMplus10-Regular.ttf")));
        } catch (IOException | FontFormatException e) {

        }
        */
        /*
        try {
            InputStream is = GameNameLabel.class.getResourceAsStream("PixelMplus10-Regular.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            Font sizedFont = font.deriveFont(18f);
            this.setFont(sizedFont);

        } catch (Exception ex) {
            System.err.println("Not loaded");
            ex.printStackTrace();
        }

         */
        /*
        try {
            this.setFont(Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("PixelMplus10-Regular.ttf").openStream()));
        } catch(IOException ex){
            //exception handled here I suppose
        } catch(FontFormatException ex2) {
            //same here
        }

         */




    }

}

