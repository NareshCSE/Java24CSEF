package intro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightStimulator extends JFrame implements ActionListener {

    private JLabel messageLabel;
    private JRadioButton redButton, yellowButton, greenButton;
    private ButtonGroup group;

    public TrafficLightStimulator() {
        setTitle("Traffic Light Simulator");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Message label (initially empty)
        messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 22));
        add(messageLabel, BorderLayout.NORTH);

        // Panel for radio buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // Group radio buttons
        group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        // Add listeners
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        // Add to panel
        panel.add(redButton);
        panel.add(yellowButton);
        panel.add(greenButton);

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (redButton.isSelected()) {
            messageLabel.setText("Stop");
            messageLabel.setForeground(Color.RED);
        } 
        else if (yellowButton.isSelected()) {
            messageLabel.setText("Ready");
            messageLabel.setForeground(Color.ORANGE);
        } 
        else if (greenButton.isSelected()) {
            messageLabel.setText("Go");
            messageLabel.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TrafficLightStimulator::new);
    }
}

