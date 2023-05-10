import javax.swing.*;
import java.awt.*;


public class EasyMode extends JFrame {
    private JPanel easyPanel;
    private JButton quit;

public EasyMode(){
    easyPanel.setLayout(null);
    quit.setBounds(0,0,50,20);
  quit.setText("Main Menu");
    setContentPane(easyPanel);
    System.out.println(quit.getText());
    setTitle("Easy mode");
    setSize(450,300);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);

}
 public JPanel getEasyPanel(){
     return easyPanel;
 }


}

