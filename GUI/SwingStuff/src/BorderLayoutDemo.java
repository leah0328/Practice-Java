import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    JFrame frame;
    JButton north;
    JButton east;
    JButton west;
    JButton south;
    JButton center;

    public static void main(String[]args){
        BorderLayoutDemo gui = new BorderLayoutDemo();
        gui.go();
    }

    public void go(){
        frame = new JFrame("Border Layout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        north = new JButton("Click me like you mean it");
        east = new JButton("east");
        west = new JButton("west");
        south = new JButton("south");
        center = new JButton("center");

        frame.getContentPane().add(BorderLayout.NORTH, north);
        Font bigFont = new Font("serif", Font.BOLD,28);
        north.setFont(bigFont);
        // bolder font helps you enlarge the (height) of North/South region

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST,west);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setVisible(true);
    }
}
//BORDER LAYOUT- divides component into 5 regions (default layout manager for frame)
// usually control 'panel' (since panel is added inside of frame),
// anything under "frame.getContentPane().add(BorderLayout.EAST, componentA);"

// you can get preferred WIDTH (of component) in EAST / WEST
// you can get preferred HEIGHT (of component) in NORTH /SOUTH
// rest is up to layout manager

// CENTER region gets whatever's left
// unless we use 'pack()'
// pack() - uses the full preferred size of the CENTER component,
// then determines the size of the frame using the center as a starting point,
// building the rest based on what’s in the other regions.