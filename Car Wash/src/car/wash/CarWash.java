import javax.swing.*;
import java.awt.*;

public class CarWash {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Car Wash Login");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);

            // Crear el panel principal con fondo degradado en turquesa
            JPanel mainPanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setPaint(new GradientPaint(0, 0, new Color(64, 224, 208), 0, getHeight(), new Color(72, 209, 204))); // Turquesa
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                }
            };
            mainPanel.setLayout(null); // Usaremos coordenadas absolutas para posicionar el iPhone

            // Contenedor del iPhone
            JPanel iphonePanel = new JPanel();
            iphonePanel.setBounds(200, 50, 400, 500); // Ajuste para terminar en "Forgot Password"
            iphonePanel.setBackground(Color.BLACK);
            iphonePanel.setLayout(new BorderLayout());
            iphonePanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 15, true)); // Marco redondeado

            // Pantalla interna del iPhone
            JPanel screenPanel = new JPanel();
            screenPanel.setBackground(Color.WHITE);
            screenPanel.setLayout(new BoxLayout(screenPanel, BoxLayout.Y_AXIS));
            screenPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            // Añadir contenido al área de pantalla
            JLabel titleLabel = new JLabel("Car Wash Login");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
            titleLabel.setForeground(Color.BLACK);
            titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JTextField usernameField = new JTextField(15);
            usernameField.setMaximumSize(new Dimension(300, 30));

            JPasswordField passwordField = new JPasswordField(15);
            passwordField.setMaximumSize(new Dimension(300, 30));

            JButton loginButton = new JButton("Login");
            loginButton.setBackground(new Color(0, 123, 255));
            loginButton.setForeground(Color.WHITE);
            loginButton.setFocusPainted(false);
            loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel forgotPasswordLabel = new JLabel("<HTML><U>Forgot Password?</U></HTML>");
            forgotPasswordLabel.setForeground(new Color(0, 102, 204));
            forgotPasswordLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            // Añadir los elementos al panel de pantalla
            screenPanel.add(Box.createRigidArea(new Dimension(0, 20)));
            screenPanel.add(titleLabel);
            screenPanel.add(Box.createRigidArea(new Dimension(0, 20)));
            screenPanel.add(usernameField);
            screenPanel.add(Box.createRigidArea(new Dimension(0, 10)));
            screenPanel.add(passwordField);
            screenPanel.add(Box.createRigidArea(new Dimension(0, 20)));
            screenPanel.add(loginButton);
            screenPanel.add(Box.createRigidArea(new Dimension(0, 10)));
            screenPanel.add(forgotPasswordLabel);

            iphonePanel.add(screenPanel, BorderLayout.CENTER);

            // Añadir el iPhone al panel principal
            mainPanel.add(iphonePanel);

            frame.setContentPane(mainPanel);
            frame.setVisible(true);
        });
    }
}
