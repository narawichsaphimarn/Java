package Chapter15;
import java.awt.*;
public class MyButton {
    public static void main(String[] args){
        Frame f = new Frame("My NS");
        Button b = new Button("Button");
//        f.setBackground(Color.BLUE);
        f.add(b);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
