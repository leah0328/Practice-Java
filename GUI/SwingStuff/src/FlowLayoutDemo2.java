import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo2 {
    JFrame frame;
    JPanel panel;
    JButton buttonOne;
    JButton buttonTwo;

    public static void main(String[] args) {
        FlowLayoutDemo2 gui = new FlowLayoutDemo2();
        gui.go();
    }

    public void go() {
        frame = new JFrame("Flow Layout Demo 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        panel = new JPanel();
        panel.setBackground(Color.magenta);
        frame.getContentPane().add(BorderLayout.EAST,panel);

        buttonOne = new JButton("Button inside panel");
        panel.add(buttonOne);

        buttonTwo = new JButton("New Button");
        panel.add(buttonTwo);

        frame.setVisible(true);
    }
}

// the size of the components depends on the how much it needs (no more/less)
// like how the 'new button' is smaller than 'button inside panel'
// the panel extended to fit both buttons side by side
// though we would imagine the button to be stacked on top of each other

