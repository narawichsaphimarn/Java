package Chapter15;
import java.awt.*;
public class MyWindow {
    public static void main(String[] args){
        Window w = new Window(new Frame());
        w.setBackground(Color.yellow);
        w.setSize(500, 500);
        w.setVisible(true);
    }
}
