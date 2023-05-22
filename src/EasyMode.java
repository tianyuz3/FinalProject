import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EasyMode extends JFrame implements Runnable {
    private JPanel easyPanel;
    private JButton quit;

    final int originalTileSize = 16;
    final int scale = 3;
    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize*maxScreenCol;
    final int screenHeight = tileSize* maxScreenRow;

    Thread gameThread;
    public EasyMode(){
    easyPanel.setLayout(null);
    setContentPane(easyPanel);
    this.setPreferredSize(new Dimension(screenWidth,screenHeight));  //set up the size of the easy panel
    this.pack();
    this.setLocationRelativeTo(null);

    quit.setBounds(0,0,50,40);
    quit.setText("Menu");    //setting the size and the text for quit button
    setTitle("Easy mode");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);   //enable the easypanel

    if(quit.isEnabled()){   // go back to main panel
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWindow s = new SwingWindow();
                s.show();
                dispose();


            }
        });
    }

}
public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
}


    @Override
    //game logic
    public void run() {
        while(gameThread != null){
        update();

        repaint();

        }
    }
    public void update(){

    }
    public void paintComponent(Graphics g){
       super.paintComponents(g);
        Graphics g2 = (Graphics2D)g;
        g2.setColor(Color.BLACK);
        g2.fillRect(200,200,50,50);
        g2.drawRect(200,200,tileSize,tileSize);
        g2.dispose();


    }
}

