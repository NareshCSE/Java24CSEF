package javaPrograms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Traffic Light Simulator");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(150, 20, 200, 30);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(messageLabel);
        JRadioButton redBtn = new JRadioButton("Red");
        redBtn.setBounds(50, 80, 100, 30);
        frame.add(redBtn);

        JRadioButton yellowBtn = new JRadioButton("Yellow");
        yellowBtn.setBounds(150, 80, 100, 30);
        frame.add(yellowBtn);

        JRadioButton greenBtn = new JRadioButton("Green");
        greenBtn.setBounds(250, 80, 100, 30);
        frame.add(greenBtn);
        
        ButtonGroup group = new ButtonGroup();
        group.add(redBtn);
        group.add(yellowBtn);
        group.add(greenBtn);
        redBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("STOP");
                messageLabel.setForeground(Color.RED);
            }
        });

        yellowBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("READY");
                messageLabel.setForeground(Color.ORANGE);
            }
        });

        greenBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("GO");
                messageLabel.setForeground(Color.GREEN.darker());
            }
        });
        frame.setVisible(true);
    }
}
