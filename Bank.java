import java.util.*;

class Bank
{
	//Declaration instance variable
	private double balance;
	private long accountno;
	private String name;
	private int pin;  // Add a PIN property

	//Method to get data of user//
    	public void getData(double balance, long accountno, String name, int pin) 
	{
		//Storing value 
		
        	this.balance = balance;
        	this.accountno = accountno;
        	this.name = name;
        	this.pin = pin;
    	}


	//Method to perform withdraw process//
	public void withdraw() 
	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter the withdrawal amount: ");
        	double withdrawAmount = scanner.nextDouble();

        	if (withdrawAmount <= balance) 
		{
        		balance =balance - withdrawAmount;
        		System.out.println("Remaining balance : "+balance);
        		System.out.println("Withdrawal successful :)");
        	}
		else 
		{
	            System.out.println("Amount is greater than the balance amount");
        	}
    	}

	//Method to perform Deposit Process//
    	public void deposit() 
	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter the deposit amount: ");
        	double depositAmount = scanner.nextDouble();

	        if (depositAmount <= 10000) 
		{
                	balance = balance + depositAmount;
            		System.out.println("Updated Balance :"+balance);
        	}
		else 
		{
	        	System.out.println("Over the limit");
        	}
    	}

	//Method to change the pin of user//
   	public void changePin() 
	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter the current PIN: ");
        	int currentPin ;
		currentPin = scanner.nextInt();
		
        	if (currentPin == pin) 
		{
        		
            		System.out.print("Enter the new PIN: ");
            		int newPin = scanner.nextInt();
            		pin = newPin;
            		System.out.println("PIN changed successfully");
        	}
		else 
		{
            		System.out.println("Incorrect PIN. PIN change failed.");
        	}
    	}

    	public static void main(String[] args) 
	{
        	Bank bobj = new Bank();
        	bobj.getData(5000, 277597282942L, "shreyash", 1234);  // Example PIN: 1234

 	        Scanner scanner = new Scanner(System.in);
		char ans;
	        int choice;

		//Using loop 
	        do 
		{
            		System.out.println("1. Withdraw");
            		System.out.println("2. Deposit");
            		System.out.println("3. Change PIN");
            		System.out.println("4. Exit");
            		System.out.println("Enter choice: ");

			System.out.println("-------------------------------------------------------- Before Selection -------------------------------");
            		choice = scanner.nextInt();
		
			System.out.println("\n");
		
			System.out.println("-------------------------------------------------------- After selection --------------------------------");

			//Using Switch case to perform multiple operation
		        switch (choice) 
			{
                		case 1:     
					bobj.withdraw();
        	   	                break;
                		case 2:
                	        	bobj.deposit();
                    			break;
                		case 3:
                    			bobj.changePin();
                    			break;
                		case 4:
                   			System.out.println("Exiting the application. Goodbye!");
                    			break;
                		default:
                    			System.out.println("Invalid choice. Please enter a valid option.");

            		}
			System.out.println("Do you want to perform any other process Y/N\n");
			ans=scanner.next().charAt(0);

		}
		while(ans=='Y'||ans=='y');
		
    	}
}
