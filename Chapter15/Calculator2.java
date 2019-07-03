package Chapter15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator2 implements MouseListener {

    public static String mark;
    public static long num1;
    public static String numSum;
    public static String numSum2;
    public static long sum = 0;
    GridBagConstraints constraints;
    JTextField jtf;
    JFrame jf;
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");
    JButton bplus = new JButton("+");
    JButton bminus = new JButton("-");
    JButton bdivide = new JButton("/");
    JButton bequal = new JButton("=");
    JButton bclear = new JButton("C");
    JButton bmultiply = new JButton("*");

    Calculator2() {
        constraints = new GridBagConstraints();
        jtf = new JTextField("0", 8);
        jtf.setHorizontalAlignment(JTextField.RIGHT);
        jf = new JFrame("Calculator");
        Container cp = jf.getContentPane();
        cp.setLayout(new GridBagLayout());

        addComponent(cp, jtf, 0, 0, 100, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addComponent(cp, b7, 0, 2, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addComponent(cp, b8, 2, 2, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addComponent(cp, b9, 4, 2, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addComponent(cp, bplus, 6, 2, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);

        addComponent(cp, b4, 0, 4, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addComponent(cp, b5, 2, 4, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addComponent(cp, b6, 4, 4, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addComponent(cp, bminus, 6, 4, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);

        addComponent(cp, b1, 0, 6, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addComponent(cp, b2, 2, 6, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addComponent(cp, b3, 4, 6, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addComponent(cp, bmultiply, 6, 6, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);

        addComponent(cp, b0, 0, 8, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addComponent(cp, bclear, 2, 8, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addComponent(cp, bequal, 4, 8, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addComponent(cp, bdivide, 6, 8, 2, 2, GridBagConstraints.BOTH, GridBagConstraints.CENTER);

        jf.addWindowListener(new MyWindowAdapter());
        jf.pack();
        jf.setVisible(true);
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == b1) {
            System.out.println("Input == 1");
            clickAddNumber("1");
        } else if (e.getSource() == b2) {
            System.out.println("Input == 2");
            clickAddNumber("2");
        } else if (e.getSource() == b3) {
            System.out.println("Input == 3");
            clickAddNumber("3");
        } else if (e.getSource() == b4) {
            System.out.println("Input == 4");
            clickAddNumber("4");
        } else if (e.getSource() == b5) {
            System.out.println("Input == 5");
            clickAddNumber("5");
        } else if (e.getSource() == b6) {
            System.out.println("Input == 6");
            clickAddNumber("6");
        } else if (e.getSource() == b7) {
            System.out.println("Input == 7");
            clickAddNumber("7");
        } else if (e.getSource() == b8) {
            System.out.println("Input == 8");
            clickAddNumber("8");
        } else if (e.getSource() == b9) {
            System.out.println("Input == 9");
            clickAddNumber("9");
        } else if (e.getSource() == b0) {
            System.out.println("Input == 0");
            clickAddNumber("0");
        } else if (e.getSource() == bplus) {
            System.out.println("Input == +");
            if (mark == null || mark != null) {
                mark = "+";
                numSum = numSum + mark;
                num1 = sum;
                sum = 0;
            }else if(mark != "+"){
                mark = "+";
                numSum = new Long(num1).toString();
                numSum = numSum + mark;
            }
            setTextField(numSum);
        } else if (e.getSource() == bminus) {
            System.out.println("Input == -");
            if (mark == null || mark != null) {
                mark = "-";
                numSum = numSum + mark;
                num1 = sum;
                sum = 0;
            }else if(mark != "-"){
                mark = "-";
                numSum = new Long(num1).toString();
                numSum = numSum + mark;
            }
            setTextField(numSum);
        } else if (e.getSource() == bequal) {
            System.out.println("Input == =");
            long aask = 0;
            if (mark == "+") {
                aask = num1 + sum;
            }else if(mark == "-"){
                aask = num1 - sum;
            }else if(mark == "*"){
                aask = num1 * sum;
            }else{
                aask = num1 / sum;
            }
            numSum = new Long(aask).toString();
            setTextField(numSum);
        } else if (e.getSource() == bdivide) {
            System.out.println("Input == /");
            if (mark == null || mark != null) {
                mark = "/";
                numSum = numSum + mark;
                num1 = sum;
                sum = 0;
            }else if(mark != "/"){
                mark = "/";
                numSum = new Long(num1).toString();
                numSum = numSum + mark;
            }
            setTextField(numSum);
        } else if (e.getSource() == bclear) {
            System.out.println("Input == C");
            sum = 0;
            numSum = null;
            setTextField("0");
        } else if (e.getSource() == bmultiply) {
            System.out.println("Input == *");
            if (mark == null || mark != null) {
                mark = "*";
                numSum = numSum + mark;
                num1 = sum;
                sum = 0;
            }else if(mark != "*"){
                mark = "*";
                numSum = new Long(num1).toString();
                numSum = numSum + mark;
            }
            setTextField(numSum);
        }
    }

    public static void main(String[] args) {
        new Calculator2();
    }

    private void addComponent(Container cp, Component c, int x, int y, int width, int height, int fill, int a) {
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        constraints.fill = fill;
        constraints.anchor = a;
        cp.add(c, constraints);
        c.addMouseListener(this);
    }

    private void setTextField(String input) {
        jtf.setText(input);
    }

    private void clickAddNumber(String num) {
        long number = Long.parseLong(num);
        sum *= 10;
        sum += number;
        if(numSum == null){
            numSum = num;
        }else
            numSum = numSum + num;
        setTextField(numSum);
    }
}
