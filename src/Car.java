import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Car implements Vehicle {
    Color color = MyUtility.getRandomColor();

    @Override
    public void build(JFrame frame) {
        VehiclePanel panel = new VehiclePanel(this);

        JOptionPane.showMessageDialog(frame, panel, "Created: " + this, JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public void draw(Graphics2D g) {

        g.setColor(this.color);
        g.fillRect(60, 80, 160, 40);   
        g.fillRect(90, 50, 100, 30);   

        g.setColor(Color.BLACK);
        g.fillOval(80, 110, 30, 30);   
        g.fillOval(170, 110, 30, 30);
    }

    @Override
    public String toString() {
        return "Car";
    }
}
