package WelcomeWindow;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class CurrentTimeLabel extends JLabel {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    String time;

    public CurrentTimeLabel() throws InterruptedException {

        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setFont(new Font("Didot",Font.BOLD,20));
        this.setForeground(Color.ORANGE);
        this.setBounds(1050,25,100,50);
        timeFormat = new SimpleDateFormat("hh:mm:ss");

    }
    public void setTime() throws InterruptedException {
        while(true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            this.setText(time);

            Thread.sleep(1000);

        }

    }
}
