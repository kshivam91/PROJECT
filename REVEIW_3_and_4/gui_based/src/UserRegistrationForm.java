import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserRegistrationForm extends JFrame {
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton submitButton;
    
    public UserRegistrationForm() {
        setTitle("User Registration");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Name Field
        JLabel nameLabel = new JLabel("Name: ");
        nameField = new JTextField(20);
        
        // Email Field
        JLabel emailLabel = new JLabel("Email: ");
        emailField = new JTextField(20);
        
        // Password Field
        JLabel passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField(20);
        
        // Submit Button
        submitButton = new JButton("Register");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                Str
