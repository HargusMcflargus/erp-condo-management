import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class UserDashboard {
    public JFrame frame;
    private JPanel mainPanel, headerPanel;
    private JTabbedPane tabbedPane;
    private JLabel welcomeLabel;
    private JPanel dashboardPanel, roomPanel;

    UserDashboard(String user){
        frame = new JFrame("Dashboard");
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setLocationRelativeTo(null);
        frame.setContentPane(mainPanel);
        frame.setIconImage(new ImageIcon("res/loona.png").getImage());
        mainPanel.setBackground(Color.decode(mainClass.color_1));
        headerPanel.setBackground(Color.decode(mainClass.color_1));
        welcomeLabel.setText("Welcome " + user + "!");
        welcomeLabel.setFont(new Font("JetBrains Mono", Font.PLAIN, 22));
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
