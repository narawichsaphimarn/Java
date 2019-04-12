//package Chapter11;

import java.io.*;
//import java.util.Scanner;
public class CalculateBMI {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        String massege;
        double height = 0, weight = 0;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        System.out.println("Are you overweight?");
        System.out.println("Calculate you BMI now ...");
        System.out.print("Enter height (centimeter) : ");
//        float height = in.nextFloat();
        try {
            massege = in.readLine();
            height = Double.parseDouble(massege);
//            System.out.println();
        }
        catch(IOException e){
            System.out.println("Error to input " + e);
        }
        System.out.print("Enter weight (kilogram) : ");
//        float weight = in.nextFloat();
        try {
            massege = in.readLine();
            weight = Double.parseDouble(massege);
//            System.out.println();
        }
        catch(IOException e){
            System.out.println("Error to input " + e);
        }
        double bmi = weight/(height*height);
        if(bmi < 18.5){
            System.out.println("BMI is " + bmi + " [Underweight]");
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("BMI is " + bmi + " [Normal weight]");
        }
        else if(bmi >= 25.0 && bmi <= 29.9){
            System.out.println("BMI is " + bmi + " [Overweight]");
        }
        else
            System.out.println("BMI is " + bmi + " [Obesity]");
    }
}
