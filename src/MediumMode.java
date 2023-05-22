import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

public class MediumMode extends JFrame {
    private JButton mainMenu;
    private JPanel medium;

    final int originalTileSize = 16;
    final int scale = 3;
    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize*maxScreenCol;
    final int screenHeight = tileSize* maxScreenRow;

    public MediumMode(){
        medium.setLayout(null);
        mainMenu.setBounds(0, 0, 50, 40);
        mainMenu.setText("Menu");    //setting the size and the text for quit button
        setContentPane(medium);
        setTitle("Medium mode");
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));  //set up the size of the medium panel
        this.pack();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);   //enable the medium panel

        if (mainMenu.isEnabled()) {   // go back to main panel
            mainMenu.addActionListener(new ActionListener() {
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
