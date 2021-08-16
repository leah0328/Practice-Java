import javax.swing.*;
import java.awt.*;

public class MyDrawPanel2D extends JPanel {

    private static JFrame frame;
    private static MyDrawPanel2D panel;
    // not JPanel!! otherwise the graphics wouldn't show!

    public static void main(String []args) {

        frame = new JFrame();
        panel = new MyDrawPanel2D();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.getContentPane().add(panel);
        frame.setTitle("2D Oval");
        frame.setVisible(true);

        panel.setBorder(BorderFactory.createEmptyBorder
                (30, 30, 30, 30));
        panel.setLayout(null);
    }
        public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradient = new GradientPaint
                (70,70,Color.red,150,150,Color.orange);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
        }

}




