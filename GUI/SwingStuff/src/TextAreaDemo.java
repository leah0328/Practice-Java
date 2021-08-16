import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaDemo implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel textFieldLabel;
    JTextField textField;
    JLabel textAreaLabel;
    JTextArea textArea;
    JScrollPane scroller;
    JButton button;
    int count = 0;

    public static void main(String[] args) {
        TextAreaDemo gui = new TextAreaDemo();
        gui.go();
    }

    public void go() {
        frame = new JFrame("Box Layout Demo");
        panel = new JPanel();

        textFieldLabel = new JLabel("Dog's First Name: ");
        textField = new JTextField(20); // 20 column(of width), not pixel

        textAreaLabel = new JLabel("Dog's Description");
        textArea = new JTextArea(10,20);
        textArea.setLineWrap(true);
        textArea.setText("button never clicked.\n");
        textArea.setLineWrap(true);
        textArea.selectAll(); // select/highlight all text
        textArea.requestFocus(); // put cursor back in the field(so user can start typing)

        scroller = new JScrollPane(textArea);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scroller);

        button = new JButton("Submit");
        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.getContentPane().add(BorderLayout.SOUTH,button);

        panel.setBackground(Color.pink);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        panel.add(textFieldLabel);
        panel.add(textField);
        panel.add(textAreaLabel);
        panel.add(textArea);

        panel.add(button);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        textArea.append("button clicked " + count + "\n" );
    }
}
