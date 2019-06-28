package Chapter13;
import java.util.Scanner;
import java.io.*;
public class Bank_Account {

    public static long account_Number;
    public static String account_Name;
    public static String account_Address;
    public static double account_Balance;
    public static final float fixed3 = (0.75f/100);
    public static final float fixed6 = (1.00f/100);
    public static final float fixed12 = (1.25f/100);
    public static final float fixed24 = (1.75f/100);

    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader key = new BufferedReader(ir);
        Scanner in = new Scanner(System.in);
        Saving_Account sa;
        Fixed_Account fa;

        System.out.println("Please input customer information");
        do {
            System.out.print("Account number : ");
            account_Number = in.nextLong();
            //System.out.println(String.valueOf(account_Number).length());
        } while (String.valueOf(account_Number).length() != 10 && String.valueOf(account_Number).length() != 12);

        try {
            System.out.print("Name : ");
            account_Name = key.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            System.out.print("Address : ");
            account_Address = key.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.print("Balance : ");
        account_Balance = in.nextDouble();
        System.out.println();
        
        if(String.valueOf(account_Number).length() == 10){
            sa = new Saving_Account();
            sa.SavingAccount();
        }
        else{
            fa = new Fixed_Account();
            if(account_Number%100 == 01){
                fa.FixedAccount(fixed3,3);
            }
            else if(account_Number%100 == 02){
                fa.FixedAccount(fixed6,6);
            }
            else if(account_Number%100 == 03){
                fa.FixedAccount(fixed12,12);
            }
            else{
                fa.FixedAccount(fixed24,24);
            }
        }
    }
}
