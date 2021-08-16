import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class CheckBoxDemo implements ItemListener{
    JFrame frame;
    JCheckBox checkBox;

    public static void main(String[] args) {
        CheckBoxDemo gui = new CheckBoxDemo();
        gui.go();
    }

    public void go() {
        frame = new JFrame("Check Box Demo");
        frame.setSize(300,300);


        checkBox = new JCheckBox("Goes to 11");
        checkBox.addItemListener(this);

        frame.getContentPane().add(BorderLayout.CENTER,checkBox);
        frame.setVisible(true);
    }

    public void itemStateChanged(ItemEvent ev){
        String onOrOff = "off";
        if (checkBox.isSelected()) onOrOff = "on";
            System.out.println("Check box is now " + onOrOff);
            // will print out check box's current state (on or off)
    }
}
