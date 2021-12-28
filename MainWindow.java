package HomeWork7;

import javax.swing.*;
import java.awt.*;



public class MainWindow extends JFrame {


        private int widthW = 1024;
        private int heightW = 1024;
        private int posXW = 300;
        private int posYW = 300;

        private String titleW = "Game Alive Player";


        private InfoPanel infoPanel;
        private GamePanel map;



    public MainWindow() {
            setupWindow();
            map = new GamePanel();
            infoPanel = new InfoPanel(this);
            add(map);
            add(infoPanel, BorderLayout.EAST);
            setVisible(true);
        }


        private void setupWindow () {
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(widthW, heightW);
            setLocation(posXW, posYW);
            setTitle(titleW);
            setResizable(false);
        }

    }


