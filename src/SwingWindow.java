import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingWindow extends JFrame{
    private JButton easyButton;
    private JButton hardButton;
    private JButton mediumButton;
    private JPanel mainPanel;
    private JPanel easyPanel;
    private JPanel mediumPanel;
    private JPanel hardPanel;

    public SwingWindow(){
        setContentPane(mainPanel);
        setTitle("Game");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        hardButton.setBackground(Color.RED);
        easyButton.setBackground(Color.cyan);
        mediumButton.setBackground(Color.pink);

        if(easyButton.isEnabled()) {
            easyButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    EasyMode ez = new EasyMode();
                    ez.show();
                    dispose();
                    ez.setSize(450, 300);
                }

            });
        } if(hardButton.isEnabled()) {
            hardButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent f) {
                    HardMode hM = new HardMode();
                    hM.show();
                    dispose();
                    hM.setSize(450, 300);

                }
            });
        }
    }

    }

