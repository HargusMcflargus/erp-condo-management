import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {

    //Component Definitions
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel usernameLabel, passwordLabel;
    private JButton loginButton;
    private SpringLayout mainLayout;

    //Constructor
    LoginForm(){

        //Component Initialization

        //Text Fields
        usernameField = new JTextField();
        passwordField = new JPasswordField();

        //Labels
        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");

        //Buttons
        loginButton = new JButton("Log In");

        //Layout Managers
        mainLayout = new SpringLayout();


        //Adding components to JFrame
        this.add(usernameLabel);

        //Set Constraints
        //usernameLabel
        mainLayout.putConstraint(
                SpringLayout.WEST,
                usernameLabel,
                30,
                SpringLayout.WEST,
                this
        );
        mainLayout.putConstraint(
                SpringLayout.NORTH,
                usernameLabel,
                20,
                SpringLayout.NORTH,
                this
        );

        //JFrame Essentials
        this.setTitle("Condominium Management Login");
        this.setUndecorated(false);
        this.setResizable(false);
        this.setSize(new Dimension(400, 270));
        this.setLayout(mainLayout);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
