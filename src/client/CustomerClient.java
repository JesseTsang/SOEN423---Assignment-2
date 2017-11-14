package client;


import domain.BranchID;

public class CustomerClient
{
	private static final String BANK_HOST = "localhost";
	private static final int BANK_PORT = 1099;
	private String customerID;
	private BranchID branchID;
	
	//CORBA Variables
		
	public CustomerClient(String customerID, BranchID branchID) throws 
	{
		this.customerID = customerID;
		this.branchID = branchID;
		
		
		
		
		System.out.println("Login Sucessed. | Customer ID: " + this.customerID + " | Branch ID: " + this.branchID.toString());	
	}
	
	public synchronized void deposit(double amount) throws 
	{
		
	}
	
	public synchronized void withdraw(double amount) throws 
	{
			
	}
	
	public synchronized void getBalance() throws 
	{
		
	}

	public static void main(String[] args)
	{

	}
}
