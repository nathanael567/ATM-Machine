import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;


/*
*This class represents the Menu Options
* for the Nate's ATM 
*/ 

public class OptionMenu extends Account {

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    /*
    * This method is a simple login method
    * Contains a HashMap with already declared members.
    * @param none
    * @return void
    */

    public void getLogin() throws IOException{
        int x = 1;

        do{
            try{
                data.put(12345, 4043);
                data.put(19876, 1357);

                System.out.println("Welcome to the Nate's ATM Machine!");
                System.out.print("Enter your account number: ");
                setCustomerNumber(input.nextInt());

                System.out.print("Enter your Pin Number: ");
                setPinNumber(input.nextInt());
            }catch(Exception e){
                System.out.println("Invalid character only number.");
                x = 2;
            }
            /*
            * Loops through the map to check if the values match
            */
            for (Entry<Integer, Integer> entry : data.entrySet()){
                if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()){
                    getAccountType();
                }
            }
            System.out.println("Wrong customer number or pin number");
        }while (x == 1);
    }

    /*
    * This method prompts the user to make an account selection
    * @param none
    * @return void
    */
    public void getAccountType(){
        System.out.println("Select an account you would like to access: ");
        System.out.println("1. Checking account");
        System.out.println("2. Saving account");
        System.out.println("3. Exit");
        System.out.println("Your choice: ");

        int selection = input.nextInt();
        
        switch (selection){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank for choosing Nate's ATM. Later.");
                break;
            default:
                System.out.println("Invalid choice, try again"); 
                getAccountType();
        }       
        }

        /*
        *This method displays the Checking menu
        * @return void
        * @param  none
        */
          public void getChecking(){
                System.out.println("Checking account: ");
                System.out.println("1. - View Balance");
                System.out.println("2. - Withdraw Funds");
                System.out.println("3. - Deposit Funds");
                System.out.println("4. - Exit");
                System.out.println("Your choice # : ");

                int selection = input.nextInt();

                switch (selection){
                    case 1:
                        System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                        getAccountType();
                        break;
                    case 2:
                        getCheckingWithdraw();
                        getAccountType();
                        break;
                    case 3:
                        getCheckingDeposit();
                        getAccountType();
                        break;
                    case 4:
                        System.out.println("Thank you for choosing Nate's ATM.");
                        break;
                    default:
                        System.out.println("Invalid choice, try again");
                        getChecking();

                }

          }
           /*
            *This method displays the Saving menu
            * @return void
            * @param  none
            */
            public void getSaving(){
                System.out.println("Saving account: ");
                System.out.println("1. - View Balance");
                System.out.println("2. - Withdraw Funds");
                System.out.println("3. - Deposit Funds");
                System.out.println("4. - Exit");
                System.out.println("Your choice # : ");

                int selection = input.nextInt();

                switch (selection){
                    case 1:
                        System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
                        getAccountType();
                        break;
                    case 2:
                        getSavingWithdraw();
                        getAccountType();
                        break;
                    case 3:
                        getSavingDeposit();
                        getAccountType();
                        break;
                    case 4:
                        System.out.println("Thank you for choosing Nate's ATM.");
                        break;
                    default:
                        System.out.println("Invalid choice, try again");
                        getChecking();

                }

             }
          

        }