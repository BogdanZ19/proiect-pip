import java.awt.Color;

public class MyUtility {
    public static Color getRandomColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        
        return new Color(r, g, b);
    }        
}
