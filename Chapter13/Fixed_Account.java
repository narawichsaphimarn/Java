package Chapter13;
public class Fixed_Account extends Bank_Account{
    public void FixedAccount(float fixed, int numberFix){
        System.out.println("#############################");
        System.out.println("# Show customer information #");
        System.out.println("#############################");
        System.out.println("Customer account : " + account_Number);
        System.out.println("Customer name : " + account_Name);
        System.out.println("Customer address : " + account_Address);
        System.out.println("Account type : Fixed Account " + numberFix + " months");
        System.out.println("Account balance with interest = " + (float)(account_Balance + (account_Balance * fixed)));
    }
}
