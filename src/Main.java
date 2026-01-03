import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Vehicle Factory");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3, 1, 10, 10));

            JLabel label = new JLabel("Select vehicle type:");
            panel.add(label);

            JButton bikeButton = new JButton("Create Bike");
            JButton truckButton = new JButton("Create Truck");

            panel.add(bikeButton);
            panel.add(truckButton);

            bikeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    VehicleFactory factory = new BikeFactory();
                    Vehicle vehicle = factory.create();
                    JOptionPane.showMessageDialog(frame, "Bike created: " + vehicle);
                }
            });

            truckButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    VehicleFactory factory = new TruckFactory();
                    Vehicle vehicle = factory.create();
                    JOptionPane.showMessageDialog(frame, "Truck created: " + vehicle);
                }
            });

            ActionListener eventListener = e -> {
                String btn = ((JButton) e.getSource()).getText();

                if (btn.equals("carButton")) {
                    VehicleFactory factory = new CarFactory();
                    Vehicle vehicle = factory.create();
                    JOptionPane.showMessageDialog(frame, "Car created: " + vehicle);
                }

                if (btn.equals("bikeButton")) {
                    VehicleFactory factory = new BikeFactory();
                    Vehicle vehicle = factory.create();
                    JOptionPane.showMessageDialog(frame, "Bike created: " + vehicle);
                }

                if (btn.equals("truckButton")) {
                    VehicleFactory factory = new TruckFactory();
                    Vehicle vehicle = factory.create();
                    JOptionPane.showMessageDialog(frame, "Truck created: " + vehicle);
                }
            };

            frame.getContentPane().add(panel);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
