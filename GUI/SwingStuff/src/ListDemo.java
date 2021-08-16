import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListDemo implements ListSelectionListener {
    JFrame frame;
    JPanel panel;
    JScrollPane scroller;
    JList list;
    String [] listEntries ={"alpha","beta","gamma","delta","epson","zeta","eta","theta"};

    public static void main(String[] args) {
        ListDemo gui = new ListDemo();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.cyan);
        frame.getContentPane().add(BorderLayout.CENTER,panel);

        list = new JList(listEntries);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(this);

        scroller = new JScrollPane(list);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        panel.add(scroller);
        panel.add(list);

        frame.setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            String selection = (String) list.getSelectedValue();
            System.out.println(selection);
        }
    }
}
