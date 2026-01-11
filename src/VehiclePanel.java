import javax.swing.*;
import java.awt.*;

// Clasa container pentru desen
public class VehiclePanel extends JPanel {
    private final Vehicle vehicle;
    
    public VehiclePanel(Vehicle vehicle) {
        this.vehicle = vehicle;
        setPreferredSize(new Dimension(300, 160));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        vehicle.draw((Graphics2D) g);
    }
}
