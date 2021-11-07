import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class LoginForm {
    private JFrame frame;
    private JPanel loginPanel;
    private JTextField userField, passwordField;
    private JLabel pictureContainer;
    private JButton loginButton;
    LoginForm(){
        pictureContainer = new JLabel(new ImageIcon("res/logo_erp.png"));
        frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(loginPanel);
        frame.setVisible(true);
    }
}

