package Chapter15;
import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}

public class CalculatorMachine implements MouseListener {
    GridBagConstraints constraints;
    Label l ;
    Frame f ;
    TextField tf ;
    public CalculatorMachine(){
        constraints = new GridBagConstraints();
        f = new Frame("Calculator");
        l = new Label("");
        tf = new TextField("0",15);
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b0 = new Button("0");
        Button bplus = new Button("+");
        Button bminut = new Button("-");
        Button bq = new Button("/");
        Button be = new Button("=");
        Button bC = new Button("C");
        Button bคูณ = new Button("*");
        
        
        f.setLayout(new GridBagLayout());  
        f.setSize(100, 100);
        
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        constraints.gridwidth = 15;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        f.add(tf, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridheight = 2;
        constraints.gridwidth = 4;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        f.add(b7, constraints);
        
        constraints.gridx = 5;
        constraints.gridy = 2;
        constraints.gridheight = 1;
        constraints.gridwidth = 5;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        f.add(b8, constraints);
        
        constraints.gridx = 9;
        constraints.gridy = 2;
        constraints.gridheight = 1;
        constraints.gridwidth = 7;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        f.add(b9, constraints);
        
        constraints.gridx = 13;
        constraints.gridy = 2;
        constraints.gridheight = 1;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        f.add(bplus, constraints);
        
        //######################################################################## colum 2
        
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridheight = 1;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        f.add(b4, constraints);
        
        constraints.gridx = 5;
        constraints.gridy = 3;
        constraints.gridheight = 1;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        f.add(b5, constraints);
        
        constraints.gridx = 9;
        constraints.gridy = 3;
        constraints.gridheight = 1;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        f.add(b6, constraints);
        
        constraints.gridx = 13;
        constraints.gridy = 3;
        constraints.gridheight = 1;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        f.add(bminut, constraints);
//        
//        //##################################################################colum3
//        
//        constraints.gridx = 0;
//        constraints.gridy = 3;
//        constraints.gridheight = 1;
//        constraints.gridwidth = 2;
//        constraints.fill = GridBagConstraints.HORIZONTAL;
//        constraints.anchor = GridBagConstraints.CENTER;
//        f.add(b1, constraints);
//        
//        constraints.gridx = 2;
//        constraints.gridy = 3;
//        constraints.gridheight = 1;
//        constraints.gridwidth = 2;
//        constraints.fill = GridBagConstraints.HORIZONTAL;
//        constraints.anchor = GridBagConstraints.CENTER;
//        f.add(b2, constraints);
//        
//        constraints.gridx = 4;
//        constraints.gridy = 3;
//        constraints.gridheight = 1;
//        constraints.gridwidth = 2;
//        constraints.fill = GridBagConstraints.HORIZONTAL;
//        constraints.anchor = GridBagConstraints.CENTER;
//        f.add(b3, constraints);
//        
//        constraints.gridx = 6;
//        constraints.gridy = 3;
//        constraints.gridheight = 1;
//        constraints.gridwidth = 2;
//        constraints.fill = GridBagConstraints.HORIZONTAL;
//        constraints.anchor = GridBagConstraints.CENTER;
//        f.add(bคูณ, constraints);
        
        //##############################################################colum4
        
//        constraints.gridx = 0;
//        constraints.gridy = 4;
//        constraints.gridheight = 1;
//        constraints.gridwidth = 2;
//        constraints.fill = GridBagConstraints.HORIZONTAL;
//        constraints.anchor = GridBagConstraints.CENTER;
//        f.add(b0, constraints);
//        
//        constraints.gridx = 2;
//        constraints.gridy = 4;
//        constraints.gridheight = 1;
//        constraints.gridwidth = 2;
//        constraints.fill = GridBagConstraints.HORIZONTAL;
//        constraints.anchor = GridBagConstraints.CENTER;
//        f.add(bC, constraints);
//        
//        constraints.gridx = 4;
//        constraints.gridy = 4;
//        constraints.gridheight = 1;
//        constraints.gridwidth = 2;
//        constraints.fill = GridBagConstraints.HORIZONTAL;
//        constraints.anchor = GridBagConstraints.CENTER;
//        f.add(be, constraints);
//        
//        constraints.gridx = 6;
//        constraints.gridy = 4;
//        constraints.gridheight = 1;
//        constraints.gridwidth = 2;
//        constraints.fill = GridBagConstraints.HORIZONTAL;
//        constraints.anchor = GridBagConstraints.CENTER;
//        f.add(bq, constraints);
        
                
//        addComponent1(f, new TextField("",20), 0, 0, 24, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        addComponent(f, new Button("7"), "7", 0, 2, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        addComponent(f, new Button("8"), "8", 2, 2, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        addComponent(f, new Button("9"), "9", 4, 2, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        addComponent(f, new Button("+"), "+", 8, 2, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        
//        addComponent(f, new Button("4"), "4", 0, 3, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        addComponent(f, new Button("5"), "5", 2, 3, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        addComponent(f, new Button("6"), "6", 4, 3, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        addComponent(f, new Button("-"), "-", 8, 3, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        
//        addComponent(f, new Button("1"), "1", 0, 4, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        addComponent(f, new Button("2"), "2", 2, 4, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        addComponent(f, new Button("3"), "3", 4, 4, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        addComponent(f, new Button("*"), "*", 8, 4, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        
//        addComponent(f, new Button("0"), "0", 0, 5, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        addComponent(f, new Button("C"), "C", 2, 5, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        addComponent(f, new Button("="), "=", 4, 5, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
//        addComponent(f, new Button("/"), "/", 8, 5, 2, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        f.addWindowListener(new MyWindowAdapter());
        f.pack();
        f.setVisible(true);
    }
    public void mousePressed(MouseEvent e){}
    
    public void mouseReleased(MouseEvent e){
    }
    
    public void mouseEntered(MouseEvent e){}
    
    public void mouseExited(MouseEvent e){}
    
    public void mouseClicked(MouseEvent e){        
        System.out.println("Input");
    }
    
    public static void main(String[] args){
        new CalculatorMachine();
    }
    
//    private void addComponent(Frame f, Component c, String value, int x, int y, int width, int height, int fill, int a){
//        String val = value;
//        constraints.gridx = x;
//        constraints.gridy = y;
//        constraints.gridwidth = width;
//        constraints.gridheight = height;
//        constraints.fill = fill;
//        constraints.anchor = a;
//        f.add(c, constraints);
//        c.addMouseListener(this);
//        f.setSize(500, 500);
//        System.out.println(val);
//        
//    }
//    public void addComponent1(Frame f, Component c1, int x, int y, int width, int height, int fill, int a){
//        Component text = c1;
//        constraints.gridx = x;
//        constraints.gridy = y;
//        constraints.gridwidth = width;
//        constraints.gridheight = height;
//        constraints.fill = fill;
//        constraints.anchor = a;
//        f.add(text, constraints);
//        text.addMouseListener(this);
//    }
}
