package HomeWork7;

import javax.swing.*;
import java.awt.*;

public class PlayerControlArea extends JPanel {
    private JButton butMoveUp;
    private JButton butMoveDown;
    private JButton butMoveRight;
    private JButton butMoveLeft;

    public PlayerControlArea() {
        setLayout(new GridLayout(2, 3));


        butMoveUp = new JButton("UP");

        butMoveDown = new JButton("DOWN");

        butMoveRight = new JButton("RIGHT");

        butMoveLeft = new JButton("LEFT");

        add(new JPanel());

        add(butMoveUp);

        add(new JPanel());

        add(butMoveLeft);

        add(butMoveDown);

        add(butMoveRight);
    }
}

