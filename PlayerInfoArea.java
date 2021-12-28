package HomeWork7;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoArea extends JPanel {
    private JLabel playerHp;
    private JLabel playerStr;
    private JLabel playerPosition;

    private String Hp = "Health: ";
    private String Str = "Str: ";
    private String Position = "Position: ";

    public PlayerInfoArea() {
        setLayout(new GridLayout(4, 1));



        playerHp = new JLabel(Hp);
        playerStr = new JLabel(Str);
        playerPosition = new JLabel(Position);

        add(new JLabel("Player Info", SwingConstants.CENTER));
        add(playerHp);
        add(playerStr);
        add(playerPosition);


    }
}
