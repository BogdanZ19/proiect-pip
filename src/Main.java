import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Vehicle Factory");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(4, 1, 10, 10));

            JLabel label = new JLabel("Select vehicle type:");
            panel.add(label);

            JButton carButton = new JButton("Create Car");
            JButton bikeButton = new JButton("Create Bike");
            JButton truckButton = new JButton("Create Truck");

            carButton.setActionCommand("CAR");
            bikeButton.setActionCommand("BIKE");
            truckButton.setActionCommand("TRUCK");

            panel.add(carButton);
            panel.add(bikeButton);
            panel.add(truckButton);

            ActionListener eventListener = e -> {
                Object btn = ((JButton) e.getSource()).getActionCommand();
                if (btn.equals("CAR")) {
                    VehicleFactory factory = new CarFactory();
                    Vehicle vehicle = factory.create();
                    JOptionPane.showMessageDialog(frame, "Car created: " + vehicle);
                } else if (btn.equals("BIKE")) {
                    VehicleFactory factory = new BikeFactory();
                    Vehicle vehicle = factory.create();
                    JOptionPane.showMessageDialog(frame, "Bike created: " + vehicle);
                } else if (btn.equals("TRUCK")) {
                    VehicleFactory factory = new TruckFactory();
                    Vehicle vehicle = factory.create();
                    JOptionPane.showMessageDialog(frame, "Truck created: " + vehicle);
                }
            };
            carButton.addActionListener(eventListener);
            bikeButton.addActionListener(eventListener);
            truckButton.addActionListener(eventListener);

            frame.getContentPane().add(panel);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
