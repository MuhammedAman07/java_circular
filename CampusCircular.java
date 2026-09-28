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

        
    }
}