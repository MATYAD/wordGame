package WelcomeWindow;

import WelcomeWindow.GridWindow.GridFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridSelectButton extends JButton implements ActionListener {
    String[] responses = {"3x3", "4x4", "5x4", "6x4"};
    ImageIcon image = new ImageIcon("questionMark.jpg");
    int answer;
    public GridSelectButton() {
        this.addActionListener(this);
        this.setFocusable(false);
        this.setText("GRID");
        this.setVerticalAlignment(JButton.CENTER);
        this.setHorizontalAlignment(JButton.CENTER);
        this.setBackground(Color.BLACK);
        //this.setContentAreaFilled(false);
        this.setBorder(BorderFactory.createLineBorder(Color.ORANGE,3));
        this.setFont(new Font("Didot", Font.BOLD, 30));
        this.setForeground(Color.ORANGE);
        this.setBounds(500,530,200,100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this){

            GridFrame gridFrame = new GridFrame();

        }

    }
}
