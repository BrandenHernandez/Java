package game;

import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {

    private Snake() {

        initUI();
    }

    private void initUI() {

        add(new Board());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        pack();

        setTitle("Initializing Alice. Please wait."); // Progress Bar goes here
    }

    public static void game() {
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.hasFocus();
            ex.setVisible(true);
        });
    }
} // Thanks for looking