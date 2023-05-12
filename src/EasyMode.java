import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EasyMode extends JFrame {
    private JPanel easyPanel;
    private JButton quit;

    public EasyMode(){
    easyPanel.setLayout(null);
        quit.setBounds(0,0,50,40);
    setContentPane(easyPanel);
    setTitle("Easy mode");
    setSize(450,300);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    Icon i = new ImageIcon()
    if(quit.isEnabled()){
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWindow s = new SwingWindow();
                s.show();
                dispose();
                s.setSize(450, 300);

            }
        });
    }

}
 public JPanel getEasyPanel(){
     return easyPanel;
 }


}

