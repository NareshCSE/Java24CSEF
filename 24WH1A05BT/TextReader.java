package javaPrograms;
import java.awt.*;
import java.awt.event.*;

public class TextReader extends Frame implements ActionListener {

    TextArea textArea;
    Button countButton;
    Label resultLabel;

    public TextReader() {

        setTitle("Word and Character Counter");
        setSize(500, 400);
        setLayout(null);
        textArea = new TextArea();
        textArea.setBounds(50, 50, 400, 200);
        add(textArea);
        countButton = new Button("Count");
        countButton.setBounds(200, 270, 100, 40);
        countButton.addActionListener(this);
        add(countButton);
        resultLabel = new Label("");
        resultLabel.setBounds(50, 330, 400, 30);
        add(resultLabel);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String text = textArea.getText().trim();
        int charCount = text.length();
        int wordCount = 0;
        if (!text.isEmpty()) {
            String[] words = text.split("\\s+");
            wordCount = words.length;
        }
        resultLabel.setText("Characters: " + charCount + "    Words: " + wordCount);
    }
    public static void main(String[] args) {
        new TextReader();
    }
}
