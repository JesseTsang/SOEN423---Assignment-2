package client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import domain.BranchID;

public class CustomerDriver 
{

	public static void main(String[] args) 
	{
		String customer1 = "BCCA1234";
		BranchID branch1 = BranchID.QC;
		
		try
		{
			CustomerClient testClient1 = new CustomerClient(customer1, branch1);
			
		    //testClient1.getBalance();
			//testClient1.deposit(1000);
			testClient1.withdraw(10000);
		}
		catch (RemoteException | NotBoundException e)
		{
			e.printStackTrace();
		}

	}

}
