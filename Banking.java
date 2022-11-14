import java.util.Scanner; 

public class Banking {


	public static void main(String[] args) {
		
		
		Scanner input = new Scanner( System.in );
		
		String name; 
		int accountNumber;
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.println( "Welcome " + name + ", please enter your 6 digit account number: ");
		accountNumber = input.nextInt();
		
		System.out.println();
		
		BankAccount ba = new BankAccount( name, accountNumber );
		
        System.out.println();
      
        showMenu( ba, name ); //method to print menu options

	}//end of main method
   
   public static void showMenu( BankAccount ba, String name ){
   
      Scanner input = new Scanner( System.in );
      char option = ' ';
      int count = 0; 
      
       
		do {

			System.out.println( "What would you like to do?" );
			System.out.println("A. Check Balance");
			System.out.println("B. Make a Deposit");
			System.out.println("C. Make a Withdrawal");
			System.out.println("D. Check Previous Transaction");
			System.out.println("E. Exit");
			System.out.println( "Enter your option: ");
			option = input.next().charAt(0);
			
			
			//Check balance
			if( option == 'A' || option == 'a' ) {
				System.out.println( "Balance: $" + ba.getBalance() );
			}
		
			//Make a deposit
			else if( option == 'B' || option == 'b' ) {
				System.out.println( "How much are you depositing? " );
				double depositInput = input.nextDouble();
			
				ba.deposit( depositInput );
			}
		
			//Make a withdrawal
			else if( option == 'C' || option == 'c' ) {
				System.out.println("How much would you like to withdraw? ");
				double withdrawInput = input.nextDouble();
			
				ba.withdraw( withdrawInput );
			}
		
			//Check previous transaction
			else if( option == 'D' || option == 'd' ) {
				ba.getPrevTransaction();
			}
		
			//Exit
			else if( option == 'E' || option == 'e' ) {
				System.out.println( "Goodbye " + name +"!" );
				count++;//end application
			}
		
			//try again
			else {
				System.out.println( "Wrong input. Please try again.");
			}
		
		}while(count == 0); //end of do while loop 
   
   }//end of showMenu()
	
} //end of class
