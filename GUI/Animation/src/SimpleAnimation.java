import javax.swing.*;
import java.awt.*;

public class SimpleAnimation  {
    int x = 70;
    int y = 70;
    private static JFrame frame;
    private static MyDrawPanel panel;

    public static void main (String []args){
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go(){
        frame = new JFrame();

        panel = new MyDrawPanel();
        panel.setLayout(new BorderLayout());

        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

        for (int i = 0; i<130; i++){
            x++;
            y++;

            panel.repaint();

            try {
                Thread.sleep(50); // slow down the action
            } catch (Exception ex){}
        }
    }

    class MyDrawPanel extends JPanel{
        public void paintComponent (Graphics g) {
            g.setColor(Color.black);
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            g.setColor(Color.orange);
            g.fillOval(x, y,100, 100);
        }
    }
}
