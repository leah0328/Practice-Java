import javax.swing.*;
import java.awt.*;


public class MyDrawPanel extends JPanel {

    private static JFrame frame;
    private static MyDrawPanel panel;

    public static void main(String [] args){
        frame = new JFrame();
        panel = new MyDrawPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Draw Panel");
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.white); // if didn't specified this, will show default color(black)
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);

        Color randomColor = new Color(red,green,blue);
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);
    }
}
