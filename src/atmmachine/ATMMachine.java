package atmmachine;
import java.util.Scanner;

public class ATMMachine {
    //global variable for initial amount
    static final double init_balance = 1000;
    //global variable for current amount/amount update
     static double current_amount;
    //global variable for account number
     static int acct_no;
   static  Scanner input = new Scanner(System.in);


   public static void main(String[] args) {
       // accessing the menu
       TopMenu();

       //select an input for the menu
        System.out.println("Please select an option: ");
            int menu_input = input.nextInt();

            if (menu_input == 5)
           System.out.println();
        else{
            while (menu_input != 1) {
                System.out.println("Please Sign in first!!!");
                System.out.println("Select 1 to sign in.");
                menu_input = input.nextInt();
            }
        }

        switch (menu_input){
            case 1:
                //SignIn
                System.out.println("Enter your account number: ");
               // Scanner input1 = new Scanner(System.in);
                acct_no = input.nextInt();

                //assume account numbers are from (0...9)
                //validate input
                int counter = 1;
                while(acct_no<0 || acct_no>9){
                    System.out.println("Number is not valid!!!");
                    System.out.println();

                    /**
                     * menu is displayed again @TopMenu when acount number  is invalid
                     */
                    TopMenu();

                    System.out.println("Please select an option: ");
                    menu_input = input.nextInt();
                    System.out.println("Enter your account number: ");
                    acct_no = input.nextInt();
                    counter++;
                }
        //ACCESS MENU AFTER SIGNING IN
                TopMenu_2();


                break;
            case 5:
                //EXIT OPTION
                System.out.println("GoodBye.");
                break;
            default:
                if (menu_input<1 || menu_input>5)
                    System.out.println("Number out of range!");
             break;
        }


    }

    //This displays The Menu
    public static void TopMenu(){
        System.out.println("Welcome to the ATM Machine.");
        System.out.println("1.Sign In");
        System.out.println("2.Balance");
        System.out.println("3.Deposit");
        System.out.println("4.Withdraw");
        System.out.println("5.Exit");

    }

    //This Displays Menu After Signed In
    public static void TopMenu_2(){
        System.out.println("Please select an option: ");
        System.out.println("1.Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");

       // Scanner input = new Scanner(System.in);
        int menu_input = input.nextInt();

        switch (menu_input){
            case 1:
                //Balance check
                Bal();
                break;
            case 2:
                //Deposit
                Deposit_();
                break;
            case 3:
                //Withdrawal
                Withdrawl_();
                break;
            case 4:
                exit_();
                break;
            default:
                System.out.println("Invalid Entry.");
                System.out.print("Please try again.");
                break;
        }


    }

    /**Balance option @Bal**/
    public static void Bal(){
        int size = 10;
        // double init_balance = 1000;
        double acctbal[] = new double[size];

        for(int i = 0 ; i<size; i++){
            acctbal[i] = init_balance;
            acctbal[acct_no] = init_balance;
        }
        System.out.println("Available Balance:$" + init_balance);
        System.out.println("Updated Balance: " + current_amount);

        //Balance checking
        if (init_balance<100)
            System.out.println("Low Balance.");
        System.out.println(); 
    }

    /**Deposit option @Deposit_**/
    public static void Deposit_(){
        //prompt user to enter amount
        System.out.print("Please enter an amount: ");
        //Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        //verify if input is positive
        while(amount<1){
            System.out.println("Invalid amount.\nTry again.");
            System.out.print("Please enter an amount: ");
            amount = input.nextInt();
            TopMenu_2();
        }

        //update of current balance
       current_amount = amount + init_balance;
        System.out.println("Your current balance: $" + current_amount);
    }

    /**Withdrawal option @Withdrawl_**/
    public static void Withdrawl_(){
        if (init_balance>0)
            System.out.println("Your balance is sufficient.");
        else
            System.out.println("Your balance is insuffiencient.");

        Bal();
        System.out.println("Enter an amount: ");
       // Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        //calculates and displays current balance after withdrawal
        current_amount = init_balance - amount;
        System.out.println("Your available balance is: $" + current_amount);
    }

    /**exit option for user **/
    public static void exit_(){
        System.out.println("GoodBye.");
        System.out.println();
        TopMenu();
    }
}



