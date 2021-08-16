import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo {
    JFrame frame;
    JPanel panel;
    JButton buttonOne;
    JButton buttonTwo;

    public static void main(String[] args) {
        BoxLayoutDemo gui = new BoxLayoutDemo();
        gui.go();
    }

    public void go() {
        frame = new JFrame("Box Layout Demo");
        panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.getContentPane().add(BorderLayout.EAST,panel);

        panel.setBackground(Color.green);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS)); // new line
        // new BoxLayout : change the layout manager to be BoxLayout
        // (panel,BoxLayout.Y_AXIS) : arguments,
        // panel - the component its laying out (i.e., the panel)
        // BoxLayout.Y_AXIS - which axis to use (Y_AXIS for vertical stack).

        buttonOne = new JButton("Button inside panel");
        panel.add(buttonOne);

        buttonTwo = new JButton("New Button");
        panel.add(buttonTwo);

        frame.setVisible(true);
    }
}

//BoxLayout - keeps component stacked,
// even if there are space to put them side by side
// the panel's layout is narrower this time (doesn;t need to fit both button)

// If you want a panel to use something other than flow,
// call setLayout() on the panel.