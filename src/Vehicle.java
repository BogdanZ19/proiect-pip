import java.awt.Graphics2D;
import javax.swing.JFrame;

// Interfata de baza, toate clasele de tip vehicul trebuie sa o implementeze

public interface Vehicle {
    void build(JFrame frame); // creaza notificarea
    void draw(Graphics2D g);
}


