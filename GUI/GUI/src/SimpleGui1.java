import javax.swing.*;

public class SimpleGui1 {
    public static void main(String []args){

        JFrame frame = new JFrame();
        JButton button = new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // make the program quit as soon as you close the window

        frame.getContentPane().add(button);
        // add button to the frame's content pane

        frame.setSize(300,300);
        //give the frame a size, pixels

        button.setSize(30,30);

        frame.setVisible(true);
        //make it visible
        //(otherwise you wont see anything when you run this code lol)

    }
}
