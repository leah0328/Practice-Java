import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI3c implements ActionListener{
    private static JFrame frame;
    private static MyDrawPanel3c panel;
    private static JButton button;

    public static void main(String[]args){
        SimpleGUI3c gui = new SimpleGUI3c();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        panel = new MyDrawPanel3c();

        button = new JButton();
        button.setText("Change Color");
        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SimpleGUI3c With Button");
        frame.setSize(300,300);
        frame.getContentPane().add(BorderLayout.CENTER,panel); //important!! do not forget this line!
        frame.getContentPane().add(BorderLayout.SOUTH,button);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();

    }
}
