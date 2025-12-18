import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Car Body Factory");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3, 1, 10, 10));

            JLabel label = new JLabel("Select car body type:");
            panel.add(label);

            JButton sedanButton = new JButton("Create Sedan Body");
            JButton suvButton = new JButton("Create SUV Body");

            panel.add(sedanButton);
            panel.add(suvButton);

            sedanButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    CarBodyFactory factory = new SedanBodyFactory();
                    CarBody body = factory.create();
                    JOptionPane.showMessageDialog(frame, "Sedan body created: " + body);
                }
            });

            suvButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    CarBodyFactory factory = new SuvBodyFactory();
                    CarBody body = factory.create();
                    JOptionPane.showMessageDialog(frame, "SUV body created: " + body);
                }
            });

            frame.getContentPane().add(panel);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
