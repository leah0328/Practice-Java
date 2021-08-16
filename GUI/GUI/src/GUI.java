import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI(){ //constructor
        frame = new JFrame(); // the window

        JButton button = new JButton("Click me");
        button.addActionListener(this);

        label = new JLabel("Number of Clicks: 0");

        //standard procedure for creatingGUI
        panel = new JPanel(); // the layout
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout());
        panel.add(button);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main (String[] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
