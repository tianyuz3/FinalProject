import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
public class SwingWindow extends JFrame{
    private JButton easyButton;
    private JButton hardButton;
    private JButton mediumButton;
    private JPanel mainPanel;
    final int originalTileSize = 16;
    final int scale = 3;
    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize*maxScreenCol;
    final int screenHeight = tileSize* maxScreenRow;


    public SwingWindow(){
        setContentPane(mainPanel);
        setTitle("Game");
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));  //set up the size of the main panel
        this.setBackground(Color.black);
        this.pack();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        hardButton.setBackground(Color.red);
        hardButton.setOpaque(true);
        hardButton.setBorderPainted(false);
        easyButton.setBackground(Color.cyan);
        easyButton.setOpaque(true);
        easyButton.setBorderPainted(false);
        mediumButton.setBackground(Color.pink);
        mediumButton.setOpaque(true);
        mediumButton.setBorderPainted(false);

        //change color of the three buttons

        if(easyButton.isEnabled()) {
            easyButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    EasyMode ez = new EasyMode();
                    ez.show();
                    dispose();
                    ez.startGameThread();

                }

            });
        } if(hardButton.isEnabled()) {
            hardButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent f) {
                    HardMode hM = new HardMode();
                    hM.show();
                    dispose();

                }
            });
        }
        if(mediumButton.isEnabled()){
            mediumButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MediumMode mM = new MediumMode();
                    mM.show();
                    dispose();
                }
            });
        }
    }



}

