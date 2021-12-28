package HomeWork7;

import javax.swing.*;
import java.awt.*;

public class GameControlArea extends JPanel {
    private JButton startGame;
    private JButton exitGame;

    private InfoPanel infoPanel;
    private MainWindow mainWindow;

    public GameControlArea() {
        setLayout (new GridLayout(3,1));
        startGame = new JButton("START GAME");

        exitGame = new JButton("EXIT GAME");

        add(new JLabel("=Game Controls=", SwingConstants.CENTER));
        add(startGame);
        add(exitGame);
    }
}

