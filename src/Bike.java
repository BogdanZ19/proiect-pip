import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

// Concrete product class
public class Bike implements Vehicle{
    Color color = MyUtility.getRandomColor();

    @Override
    public void build(JFrame frame) {
        VehiclePanel panel = new VehiclePanel(this);
        
        JOptionPane.showMessageDialog(frame, panel, "Created: " + this, JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.drawOval(60, 90, 40, 40);
        g.drawOval(160, 90, 40, 40);

        g.setStroke(new BasicStroke(3));
        g.setColor(color);
        g.drawLine(80, 110, 130, 70);
        g.drawLine(130, 70, 180, 110);
        g.drawLine(100, 110, 160, 110);
    }

    @Override
    public String toString() {
        return "Bike";
    }
}
