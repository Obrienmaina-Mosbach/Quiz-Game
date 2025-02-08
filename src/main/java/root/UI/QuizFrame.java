package root.UI;

import javax.swing.*;
import java.awt.*;
import root.GameController;

public class QuizFrame extends JFrame {
    private GameController gameController;
    private JLabel questionLabel;
    private JButton[] optionButtons;
    private JLabel scoreLabel;

    public QuizFrame(GameController gameController) {
        this.gameController = gameController;
        setTitle("Quiz Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        questionLabel = new JLabel("Question will appear here");
        add(questionLabel, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(4, 1));
        optionButtons = new JButton[4];
        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JButton("Option " + (i + 1));
            optionsPanel.add(optionButtons[i]);
        }
        add(optionsPanel, BorderLayout.CENTER);

        scoreLabel = new JLabel("Score: 0");
        add(scoreLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void updateQuestion(String question, String[] options) {
        questionLabel.setText(question);
        for (int i = 0; i < options.length; i++) {
            optionButtons[i].setText(options[i]);
        }
    }

    public void updateScore(int score) {
        scoreLabel.setText("Score: " + score);
    }
}