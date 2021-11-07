import javax.swing.*;
import java.awt.*;
import java.sql.*;
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

        String databaseURL = "jdbc:ucanaccess://C://Users//hargus//Documents//db.mdb";
        try(Connection connection = DriverManager.getConnection(databaseURL)){
            String sql  = "SELECT * FROM test;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println(resultSet.getString("Name"));
            }
        }catch (java.sql.SQLException e){
            e.printStackTrace();
        }
        //Component Initialization

        //Text Fields
        usernameField = new JTextField(null, 15);
        usernameField.setFont(new Font(usernameField.getFont().toString(), Font.PLAIN, 15));
        passwordField = new JPasswordField(15);
        passwordField.setFont(new Font(passwordField.getFont().toString(), Font.PLAIN, 15));

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
        Image newimg = image.getScaledInstance(15, 20,  java.awt.Image.SCALE_SMOOTH);
        closeButton = new JButton("", new ImageIcon(newimg));
        closeButton.setBackground(Color.RED);
        closeButton.addActionListener(e -> dispose());

        //Layout Managers
        mainLayout = new SpringLayout();


        //Adding components to JFrame
        this.add(windowTitle);
        this.add(usernameLabel);
        this.add(passwordLabel);
        this.add(closeButton);
        this.add(usernameField);
        this.add(passwordField);

        //Set Constraints

        ////////////////////////////////
        /////windowTitle Constraint/////
        ////////////////////////////////
        mainLayout.putConstraint(
                SpringLayout.NORTH,
                windowTitle,
                10,
                SpringLayout.NORTH,
                this
        );
        mainLayout.putConstraint(
                SpringLayout.HORIZONTAL_CENTER,
                windowTitle,
                0,
                SpringLayout.HORIZONTAL_CENTER,
                this.getContentPane()
        );

        ///////////////////////////////////
        /////usernameLabel Constraints/////
        ///////////////////////////////////
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
                15,
                SpringLayout.SOUTH,
                windowTitle
        );

        ////////////////////////////////
        /////Userfield Constraints//////
        ////////////////////////////////
        mainLayout.putConstraint(
                SpringLayout.VERTICAL_CENTER,
                usernameField,
                5,
                SpringLayout.VERTICAL_CENTER,
                usernameLabel
        );
        mainLayout.putConstraint(
                SpringLayout.WEST,
                usernameField,
                15,
                SpringLayout.EAST,
                usernameLabel
        );

        //////////////////////////////////////
        /////passwordLabel Left Constraint////
        //////////////////////////////////////
        mainLayout.putConstraint(
                SpringLayout.WEST,
                passwordLabel,
                0,
                SpringLayout.WEST,
                usernameLabel
        );
        mainLayout.putConstraint(
                SpringLayout.NORTH,
                passwordLabel,
                25,
                SpringLayout.SOUTH,
                usernameLabel
        );

        //////////////////////////////////////
        /////Passwordfield Top Constrains/////
        //////////////////////////////////////
        mainLayout.putConstraint(
                SpringLayout.VERTICAL_CENTER,
                passwordField,
                5,
                SpringLayout.VERTICAL_CENTER,
                passwordLabel
        );
        mainLayout.putConstraint(
                SpringLayout.WEST,
                passwordField,
                20,
                SpringLayout.EAST,
                passwordLabel
        );

        /////////////////////////////////
        /////close Button Constraint/////
        /////////////////////////////////
        mainLayout.putConstraint(
                SpringLayout.NORTH,
                closeButton,
                10,
                SpringLayout.NORTH,
                this
        );
        mainLayout.putConstraint(
                SpringLayout.EAST,
                closeButton,
                -20,
                SpringLayout.EAST,
                this.getContentPane()
        );
        //////////////////////////////

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
