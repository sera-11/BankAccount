public class BankAccount {

	private double balance; 
	private double prevTransaction; 
	String clientName;
    int accountNumber;
	
	//constructor - 
	public BankAccount( String name, int accNumber ) {
		System.out.println("... Creating account ...");
		System.out.println( "Welcome " + name + "!" );
		this.clientName = name;
		this.balance = 0;
		this.accountNumber = accNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance (double b) {
		
		this.balance = b;
	}
	
	public void deposit( double amount ) {
		
		if( amount != 0 ) {
			balance = balance + amount;
			prevTransaction = amount;
		}
		
	}//end of deposit
	
	public void withdraw( double amount ) {
		
		if( amount != 0 ) {
			if( amount > balance ){
				//Not allowed. End program
				System.out.println( "Not enough funds." );
			}
			else{
         
			   balance = balance - amount;
			   prevTransaction = -amount;
            
			}
		}
	}//end of withdraw
	
	public void getPrevTransaction() {
		
		if (prevTransaction > 0)
			System.out.println( "$" + prevTransaction + " deposited" );
		
		else if( prevTransaction < 0 )
			System.out.println( "$" +  Math.abs(prevTransaction) + " withdrawn" ); //absolute value - get positive number
		
		else
			System.out.println( "No previous transactions" );
		
	}// end of getPreviousTransaction

}
