package intro;
import java.awt.*;
import java.awt.event.*;




public class TextCounterApp extends Frame implements ActionListener {

    private TextArea textArea;
    private Button countButton;
    private Label charLabel, wordLabel;

    public TextCounterApp() {
        setTitle("Text Counter");
        setSize(500, 400);
        setLayout(new BorderLayout());

        // TextArea for paragraph input
        textArea = new TextArea();
        add(textArea, BorderLayout.CENTER);

        // Panel for button and results
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(3, 1, 5, 5));

        countButton = new Button("Count Characters & Words");
        countButton.addActionListener(this);
        panel.add(countButton);

        charLabel = new Label("Number of Characters: 0");
        panel.add(charLabel);

        wordLabel = new Label("Number of Words: 0");
        panel.add(wordLabel);

        add(panel, BorderLayout.SOUTH);

        // Window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();

        // Count characters (excluding newline characters)
        int charCount = text.replace("\n", "").length();

        // Count words
        String trimmedText = text.trim();
        int wordCount = 0;
        if (!trimmedText.isEmpty()) {
            wordCount = trimmedText.split("\\s+").length;
        }

        charLabel.setText("Number of Characters: " + charCount);
        wordLabel.setText("Number of Words: " + wordCount);
    }

    public static void main(String[] args) {
        new TextCounterApp();
    }
}
