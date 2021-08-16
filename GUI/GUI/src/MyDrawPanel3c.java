import javax.swing.*;
import java.awt.*;

public class MyDrawPanel3c extends JPanel {
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.fillRect(0,0,(this.getWidth()),(this.getHeight()));

        int red1 = (int) (Math.random()*235);
        int green1 = (int) (Math.random()*235);
        int blue1 = (int) (Math.random()*235);
        Color startColor = new Color(red1, green1, blue1);

        int red2 = (int) (Math.random()*235);
        int green2 = (int) (Math.random()*235);
        int blue2 = (int) (Math.random()*235);
        Color endColor = new Color(red2, green2, blue2);

        GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
;


    }

}
