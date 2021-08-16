import javax.swing.*;
import java.awt.*;

public class MyDrawPanel2DRandom extends JPanel {
    private static JFrame frame;
    private static MyDrawPanel2DRandom panel;
    // not JPanel!! otherwise the graphics wouldn't show!
    //make sure the 'panel' line 6 is the same name as your file

    public static void main(String []args) {

        frame = new JFrame();
        panel = new MyDrawPanel2DRandom();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.setTitle("2D Oval: random");
        frame.setVisible(true);

        panel.setBorder(BorderFactory.createEmptyBorder
                (30, 30, 30, 30));

    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g; // must include this (to invoke graphics 2D method)

        g2d.fillRect(0,0,this.getWidth(), this.getHeight());

        int red1 = (int) (Math.random()*256);
        int green1 = (int) (Math.random()*256);
        int blue1 = (int) (Math.random()*256);
        Color startColor = new Color(red1,green1, blue1);

        int red2 = (int) (Math.random()*256);
        int green2 = (int) (Math.random()*256);
        int blue2 = (int) (Math.random()*256);
        Color endColor = new Color(red2,green2,blue2);

        GradientPaint gradient = new GradientPaint
                (70,70,startColor,150,150,endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }

}






