import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    JFrame frame;
    JPanel panel;
    JButton button;

    public static void main(String[] args) {
        FlowLayoutDemo gui = new FlowLayoutDemo();
        gui.go();
    }

    public void go() {
        frame = new JFrame("Flow Layout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        panel = new JPanel();
        panel.setBackground(Color.cyan);
        frame.getContentPane().add(BorderLayout.EAST,panel);

        button = new JButton("Button inside panel");
        panel.add(button);

        frame.setVisible(true);
    }
}

//Flow Layout - controls the flow of the component (default layout manager for panel)
// (in the order they were added) - ie. left -> right / top-> bottom
// usually control the components added inside the PANEL (like button, list)
// anything under "panel.add(componentA)"
// the components get preferred size in both dimensions


