import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.geom.RoundRectangle2D;

public class LoginForm extends JFrame {

    //Component Definitions
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel windowTitle, usernameLabel, passwordLabel;
    private JButton loginButton, closeButton;
    private SpringLayout mainLayout;

    //Constructor
    LoginForm(){

        //Component Initialization

        //Text Fields
        usernameField = new JTextField();
        passwordField = new JPasswordField();

        //Labels
        windowTitle = new JLabel("Log In");
        windowTitle.setFont(new Font("green piloww", Font.PLAIN, 55));
        usernameLabel = new JLabel("Username");
        usernameLabel.setFont(new Font("green piloww", Font.PLAIN, 35));
        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("green piloww", Font.PLAIN, 35));

        //Buttons
        loginButton = new JButton("Log In");

        //Close Button Properties
        ImageIcon imageIcon = new ImageIcon("res/close_Icon.png");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH);
        closeButton = new JButton("", new ImageIcon(newimg));
        closeButton.setBackground(Color.RED);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        //Layout Managers
        mainLayout = new SpringLayout();


        //Adding components to JFrame
        this.add(windowTitle);
        this.add(usernameLabel);
        this.add(passwordLabel);
        this.add(closeButton);

        //Set Constraints
        //windowTitle Top Constraint
        mainLayout.putConstraint(
                SpringLayout.NORTH,
                windowTitle,
                10,
                SpringLayout.NORTH,
                this
        );
        //windowTitle Left Constraint
        mainLayout.putConstraint(
                SpringLayout.HORIZONTAL_CENTER,
                windowTitle,
                0,
                SpringLayout.HORIZONTAL_CENTER,
                this.getContentPane()
        );
        //usernameLabel Left Constraints
        mainLayout.putConstraint(
                SpringLayout.WEST,
                usernameLabel,
                30,
                SpringLayout.WEST,
                this
        );
        //usernameLabel Top Constraints
        mainLayout.putConstraint(
                SpringLayout.NORTH,
                usernameLabel,
                15,
                SpringLayout.SOUTH,
                windowTitle
        );
        //passwordLabel Left Constraint
        mainLayout.putConstraint(
                SpringLayout.WEST,
                passwordLabel,
                0,
                SpringLayout.WEST,
                usernameLabel
        );
        //passwordLabel Top Constraint
        mainLayout.putConstraint(
                SpringLayout.NORTH,
                passwordLabel,
                25,
                SpringLayout.SOUTH,
                usernameLabel
        );
        //close Button Top Constraint
        mainLayout.putConstraint(
                SpringLayout.NORTH,
                closeButton,
                10,
                SpringLayout.NORTH,
                this
        );
        //close Button Right constraint
        mainLayout.putConstraint(
                SpringLayout.EAST,
                closeButton,
                -20,
                SpringLayout.EAST,
                this.getContentPane()
        );

        //JFrame Essentials
        this.getContentPane().setBackground(Color.decode(mainClass.color_1));
        this.setUndecorated(true);
        this.setShape(new RoundRectangle2D.Double(0, 0, 400, 270, 30, 30));
        this.setTitle("Condominium Management Login");
        this.setResizable(false);
        this.setSize(new Dimension(400, 270));
        this.setLayout(mainLayout);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
