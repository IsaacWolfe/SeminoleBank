import java.util.Scanner;
//Use while loop

public class SeminoleBanking_A{
    public static void main (String[] args){
        //Declare variables
        int accountNum = 10000;
        float balance = 1000, deposit, withdrawal;
        char menu = 'a';
        String menuInput;
        boolean testAccount = false;
        
        //Initializing scanner
        Scanner input = new Scanner(System.in);

        //Print welcome message
        System.out.println("********************************************************************************\n\t\t\tWelcome to Seminole Bank!\n********************************************************************************\n\n");
        
        //While to make sure account number is within 5 digits
        while (testAccount == false) {
            System.out.print("\nPlease enter your 5-digit Seminole Account Number: ");
            accountNum = input.nextInt();
            if ( accountNum > 9999 && accountNum < 100000 ){
                testAccount = true;
            }
            else {
                System.out.println("\nPlease enter a valid account number.");
            }
        }

        //Thank you message
        System.out.println("Thank you!\n");

        //Start of menu while and menu output
        while (menu != 'X') {
            System.out.print("\n\nEnter D for deposit, W for withdrawal, B for balance or X to exit the menu: ");
            menuInput = input.next().toUpperCase();
            menu = menuInput.charAt(0);

            //Switch statement for menu
            switch (menu) {
                case 'D': System.out.print("\nEnter the amount of the deposit: ");
                          deposit = input.nextFloat();
                          balance = balance + deposit;
                          break;
                case 'W': System.out.print("\nEnter the amount of the withdrawl: ");
                          withdrawal = input.nextFloat();
                          balance = balance - withdrawal;
                          break;
                case 'B': System.out.printf("\nAccount Number: %d has a current balance of: $%.2f", accountNum, balance);
                          break;
                case 'X': break;
                default: System.out.println("\nPlease enter a D, W, B, or X.");
                         break;
            }
        }
        
        //Exit message
        System.out.println("\n\nThank you for being a loyal Seminole Bank customer!");

        //Closing scanner
        input.close();
    }
} //End of the class
