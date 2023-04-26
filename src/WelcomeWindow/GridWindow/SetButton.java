package WelcomeWindow.GridWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetButton extends JButton implements ActionListener {
    GridFrame frame;
    XTextField xTextField;
    YTextField yTextField;
    int xSize;
    int ySize;
    public SetButton(GridFrame frame,XTextField xTextField,YTextField yTextField) {
        this.frame = frame;
        this.xTextField = xTextField;
        this.yTextField = yTextField;
        this.addActionListener(this::actionPerformed);
        this.setFocusable(false);
        this.setText("SET");
        this.setVerticalAlignment(JButton.CENTER);
        this.setHorizontalAlignment(JButton.CENTER);
        this.setBackground(Color.BLACK);
        //this.setContentAreaFilled(false);
        this.setBorder(BorderFactory.createLineBorder(Color.ORANGE,3));
        this.setFont(new Font("Didot", Font.BOLD, 30));
        this.setForeground(Color.ORANGE);
        this.setBounds(375,200,100,50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this){
            xSize = Integer.parseInt(xTextField.getText());
            ySize = Integer.parseInt(yTextField.getText());
            System.out.println(xSize);
            System.out.println(ySize);
            frame.getFrame().dispose();


        }

    }

    public final int getXSize(){
        return xSize;
    }
    public final int getYSize(){
        return ySize;
    }
}
