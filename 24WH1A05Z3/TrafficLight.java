package assignment_problems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light Simulator");
        frame.setSize(400, 200);
        frame.setLayout(null);

        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(20, 20, 360, 30);
        frame.add(messageLabel);

        JRadioButton redButton = new JRadioButton("Red");
        redButton.setBounds(50, 70, 80, 30);

        JRadioButton yellowButton = new JRadioButton("Yellow");
        yellowButton.setBounds(150, 70, 80, 30);

        JRadioButton greenButton = new JRadioButton("Green");
        greenButton.setBounds(250, 70, 80, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        frame.add(redButton);
        frame.add(yellowButton);
        frame.add(greenButton);

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (redButton.isSelected()) {
                    messageLabel.setText("Stop");
                    messageLabel.setForeground(Color.RED);
                } else if (yellowButton.isSelected()) {
                    messageLabel.setText("Ready");
                    messageLabel.setForeground(Color.ORANGE);
                } else if (greenButton.isSelected()) {
                    messageLabel.setText("Go");
                    messageLabel.setForeground(Color.GREEN);
                }
            }
        };

        redButton.addActionListener(listener);
        yellowButton.addActionListener(listener);
        greenButton.addActionListener(listener);

        frame.setVisible(true);
    }
}
