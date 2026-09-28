import javax.swing.*;

class CampusCircular{
   public static void main(String[] args) {

        // JFrame
        JFrame f = new JFrame("Circular Campus Management System");

        // JLabel
        JLabel title = new JLabel("Circular Campus Management System");
        JLabel l1 = new JLabel("Circular Title:");
        JLabel l2 = new JLabel("Description:");
        JLabel l3 = new JLabel("Admin Password:");

        // JTextField
        JTextField txt = new JTextField(25);

        // JTextArea
        JTextArea area = new JTextArea(5, 25);

        // JPasswordField
        JPasswordField pwd = new JPasswordField(10);

        // JCheckBox
        JCheckBox box = new JCheckBox("Show Help");

        // Buttons
        JButton submit = new JButton("Submit");
        JButton clear = new JButton("Clear");

        // Set layout
        f.setLayout(null);
      
        // Set positions
        title.setBounds(100, 30, 300, 30);

        l1.setBounds(40, 80, 120, 25);
        txt.setBounds(160, 80, 250, 25);

        l2.setBounds(40, 120, 120, 25);
        area.setBounds(160, 120, 250, 80);

        l3.setBounds(40, 220, 120, 25);
        pwd.setBounds(160, 220, 150, 25);

        box.setBounds(160, 260, 150, 25);

        submit.setBounds(130, 310, 100, 30);
        clear.setBounds(250, 310, 100, 30); 
        }
}
