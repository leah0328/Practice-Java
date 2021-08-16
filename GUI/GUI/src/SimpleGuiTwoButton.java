import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuiTwoButton {
    private static JFrame frame;
    private static MyDrawPanel3c panel;
    private static JLabel label;
    private static JButton colorButton;
    private static JButton labelButton;
    private int count;

    public static void main(String[] args) {
        SimpleGuiTwoButton gui = new SimpleGuiTwoButton();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        panel = new MyDrawPanel3c();

        colorButton = new JButton("Change Circle Color");
        colorButton.addActionListener(new ColorListener());

        labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        label = new JLabel("Label clicked: 0");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SimpleGUI3c 2 Button");
        frame.setSize(300, 300);
        frame.getContentPane().add(BorderLayout.CENTER, panel); //important!! do not forget this line!
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.NORTH, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            label.setText("Label clicked: " + count);
        }
    }

    class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }
}