import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HardMode extends JFrame {
    private JPanel hardMode;
    private JButton backButton;
    final int originalTileSize = 16;
    final int scale = 3;
    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize*maxScreenCol;
    final int screenHeight = tileSize* maxScreenRow;
    public HardMode() {
        hardMode.setLayout(null);
        backButton.setBounds(0, 0, 50, 40);
        backButton.setText("Menu");    //setting the size and the text for quit button
        setContentPane(hardMode);
        setTitle("Hard mode");
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));  //set up the size of the hard panel
        this.pack();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);   //enable the hard panel

        if (backButton.isEnabled()) {   // go back to main panel
            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    SwingWindow s = new SwingWindow();
                    s.show();
                    dispose();


                }
            });
        }
    }
}