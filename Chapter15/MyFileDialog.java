package Chapter15;
import java.awt.*;
public class MyFileDialog {
    public static void main(String[] args){
        Frame f = new Frame("Frame me");
        FileDialog fd = new FileDialog(f, "my File");
        f.setSize(200, 100);
        f.setVisible(true);
        fd.setVisible(true);
    }
}
 