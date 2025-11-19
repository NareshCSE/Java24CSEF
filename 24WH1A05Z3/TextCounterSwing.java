package assignment_problems;

import javax.swing.*;
import java.awt.event.*;

public class TextCounterSwing extends JFrame implements ActionListener {

    JLabel inputLabel, charCountLabel, wordCountLabel;
    JTextArea textArea;
    JButton countButton;

    public TextCounterSwing() {
        setTitle("Text Counter");
        setSize(500, 300);
        setLayout(null);

        inputLabel = new JLabel("Enter text:");
        inputLabel.setBounds(20, 20, 100, 25);
        add(inputLabel);

        textArea = new JTextArea();
        textArea.setBounds(20, 50, 440, 150);
        add(textArea);

        countButton = new JButton("Count");
        countButton.setBounds(20, 210, 100, 30);
        countButton.addActionListener(this);
        add(countButton);

        charCountLabel = new JLabel("Characters: 0");
        charCountLabel.setBounds(140, 210, 150, 30);
        add(charCountLabel);

        wordCountLabel = new JLabel("Words: 0");
        wordCountLabel.setBounds(300, 210, 150, 30);
        add(wordCountLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();
        int charCount = text.length();
        String[] words = text.trim().split("\\s+");
        int wordCount = text.trim().isEmpty() ? 0 : words.length;
        charCountLabel.setText("Characters: " + charCount);
        wordCountLabel.setText("Words: " + wordCount);
    }

    public static void main(String[] args) {
        new TextCounterSwing();
    }
}
