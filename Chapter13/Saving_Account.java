package Chapter13;
public class Saving_Account extends Bank_Account{
    public void SavingAccount(){
        System.out.println("#############################");
        System.out.println("# Show customer information #");
        System.out.println("#############################");
        System.out.println("Customer account : " + account_Number);
        System.out.println("Customer name : " + account_Name);
        System.out.println("Customer address : " + account_Address);
        System.out.println("Account type : Saving Account");
        System.out.println("Account balance with interest = " + (float)(account_Balance + (account_Balance * (0.5/100))));
    }
}
