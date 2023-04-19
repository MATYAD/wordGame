package WelcomeWindow;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;


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
            this.setFont(Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getResource("PixelMplus10-Regular.ttf")).openStream()));
        } catch(IOException ex){
            //exception handled here I suppose
        } catch(FontFormatException ex2) {
            //same here
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

