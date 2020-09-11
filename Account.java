import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    /*
    *This method sets the customer number
    * @return int customer number
    * @param int customer number
    */
    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }

     /*
    *This method gets the customer number
    * @return int customer number
    * @param none
    */
    public int getCustomerNumber(){
        return customerNumber;
    }
     /*
    *This method sets the customer pin number
    * @return int customer pin number
    * @param int customer pin number
    */
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }

     /*
    *This method gets the customer number
    * @return int customer number
    * @param none
    */
    public int getPinNumber(){
        return pinNumber;
    }

    /*
    *This method gets the checking balance
    * @return double checking balance
    * @param none
    */
    public double getCheckingBalance(){
        return checkingBalance;
    }

    /*
    *This method gets the saving balance
    * @return double saving balance
    * @param none
    */
    public double getSavingBalance(){
        return savingBalance;
    }

    /*
    *This method withdraws money from the checking account
    * @return double checking balance
    * @param double amount
    */
    public double checkingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

     /*
    *This method withdraws money from the saving account
    * @return double saving balance
    * @param double amount
    */
    public double savingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

     /*
    *This method deposit money to the checking account
    * @return double checking balance
    * @param double amount
    */
    public double checkingDesposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

     /*
    *This method deposit money to the saving account
    * @return double saving balance
    * @param double amount
    */
    public double savingDeposit(double amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }


     /*
    *This method displays the remaining checking balance after withdraw
    * @return void
    * @param none
    */
    public void getCheckingWithdraw(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance) );
        System.out.print("Enter the amount you would like to withdraw: ");
        double amount = input.nextDouble();

        if((checkingBalance - amount) >= 0){
            checkingWithdraw(amount);
            System.out.println("New balance from Checking Account: " + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Account balance cannot be negative. ");
        }
    }


    /*
    *This method displays the remaining saving balance after withdraw
    * @return void
    * @param none
    */
    public void getSavingWithdraw(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(checkingBalance) );
        System.out.print("Enter the amount you would like to withdraw: ");
        double amount = input.nextDouble();

        if((savingBalance - amount) >= 0){
            savingWithdraw(amount);
            System.out.println("New balance from Saving Account: " + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Account balance cannot be negative. ");
        }
    }



     /*
    *This method displays the remaining checking balance after deposit
    * @return void
    * @param none
    */
    public void getCheckingDeposit(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance) );
        System.out.print("Enter the amount you would like to deposit: ");
        double amount = input.nextDouble();

        if((checkingBalance + amount) >= 0){
            checkingDesposit(amount);
            System.out.println("New balance from Checking Account: " + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Account balance cannot be negative. ");
        }
    }

     /*
    *This method displays the remaining saving balance after deposit
    * @return void
    * @param none
    */
    public void getSavingDeposit(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(checkingBalance) );
        System.out.print("Enter the amount you would like to deposit: ");
        double amount = input.nextDouble();

        if((savingBalance + amount) >= 0){
            savingDeposit(amount);
            System.out.println("New balance from Saving Account: " + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Account balance cannot be negative. ");
        }
    }


    
}
