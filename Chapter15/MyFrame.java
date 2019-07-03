package Chapter15;
import java.awt.*;
public class MyFrame {
    public static void main(String[] args){
        Frame f = new Frame("Frame");
//        Dialog d = new Dialog(f, "Dialog", true);
//        Label l = new Label("Label");
        Panel p = new Panel();
        f.setBackground(Color.BLACK);
        f.setForeground(Color.red);
        f.setLayout(null);
        p.setBackground(Color.red);
        p.setSize(250, 250);
        f.add(p);
//        d.add(l);
//        d.pack();
        f.setSize(500,500);
        f.setVisible(true);
//        d.setVisible(true);
    }
}
