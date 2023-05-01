import javax.swing.*;
import java.awt.*;

public class SwingWindow extends JFrame{
    private JButton easyButton;
    private JButton hardButton;
    private JButton mediumButton;
    private JPanel mainPanel;

    public SwingWindow(){
        setContentPane(mainPanel);
        setTitle("Game");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        hardButton.setBackground(Color.RED);
        easyButton.setBackground(Color.cyan);
        mediumButton.setBackground(Color.pink);
    }
}
