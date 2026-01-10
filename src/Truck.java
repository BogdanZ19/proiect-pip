import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Truck implements Vehicle{
    @Override
    public void build(JFrame frame) {
        VehiclePanel panel = new VehiclePanel(this);

        JOptionPane.showMessageDialog(frame, panel, "Created: " + this, JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillRect(40, 70, 130, 50);   // cargo
        g.fillRect(170, 90, 60, 30);   // cabin

        g.setColor(Color.BLACK);
        g.fillOval(60, 115, 30, 30);
        g.fillOval(140, 115, 30, 30);
        g.fillOval(190, 115, 30, 30);
    }

    @Override
    public String toString() {
        return "Truck";
    }
}
