import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JFrame frame;
    private static JPanel panel;
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordField;
    private static JCheckBox checkBox;
    private static JButton button;
    private static JLabel success;

    public static void main(String []args){

        frame = new JFrame();
        panel = new JPanel();

        frame.setSize(350,200);
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI Login");

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        panel.setLayout(null);
        // setLayout(null) - turn off layout manager
        // to add components exactly where you wanted them to be
        // which is why we typed many 'setBounds' below
        // but in long run, it's almost always easier to use layout manger
        // otherwise we will have to hard-code exact screen location and dimensions

        userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(100,50,165,25);
        panel.add(passwordField);
        // x = horizontal ; y= vertical (started from the panel)

        checkBox = new JCheckBox();
        checkBox.setText("I am not a robot");
        checkBox.setBounds(100,80,200,25);
        panel.add(checkBox);

        button = new JButton();
        button.setText("Submit");
        button.setBounds(100,110,80,25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(100,140,200,50);
        panel.add(success);
        success.setText("");

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordField.getText();

        if (user.equals("Leah") && password.equals("1234")){
            success.setText("Login successful!");

        } else if (user.equals("") && password.equals("")){
            success.setText("Please enter username or password correctly.");

        } else {
            success.setText("Incorrect username or password.");
        }
        userText.setText("");
        passwordField.setText("");
        checkBox.setSelected(false);

    }
}
