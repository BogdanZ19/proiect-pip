import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.HashMap;

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

            HashMap<String, VehicleFactory> factories = new HashMap<>();
            factories.put("CAR", new CarFactory());
            factories.put("BIKE", new BikeFactory());
            factories.put("TRUCK", new TruckFactory());

            ActionListener eventListener = e -> {
                String command = ((JButton) e.getSource()).getActionCommand();

                VehicleFactory factory = factories.get(command);

                if (factory != null) {
                    Vehicle vehicle = factory.create();
                    vehicle.build(frame);
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
