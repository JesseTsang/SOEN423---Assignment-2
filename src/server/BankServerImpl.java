package server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.omg.CORBA.ORB;

import common.BankServerInterfacePOA;
import common.BankServerInterfacePackage.invalid_bankOperation;
import common.BankServerInterfacePackage.invalid_client;
import domain.BranchID;
import domain.Client;
import domain.EditRecordFields;

/*
 * To-do:
 * 1. Rewrite duplicate methods, such as verify if an account exist with a customerID.
 */

public class BankServerImpl extends BankServerInterfacePOA 
{
	private static final long serialVersionUID = 1L;
	
	//Variable for each separate bank server
	private BranchID branchID;
	private Logger logger = null;
	private int clientCount;
	
	//CORBA Variables
	private ORB orb = null;
	private int UDPPort;
	private String UDPHost;
	
	
	private static final int    CLIENT_NAME_INI_POS = 3;

	//1. Each branch will have its separate server
	public BankServerImpl(BranchID branchID, int UDPPort)
	{
		super();
		
		this.branchID = branchID;
		this.UDPPort = UDPPort;
		this.clientCount = 0;
		
		//1.1 Logging Initiation
		this.logger = this.initiateLogger();
		this.logger.info("Initializing Server ...");
				
		System.out.println("Server: " + branchID + " initialization success.");
		System.out.println("Server: " + branchID + " port is : " + UDPPort);
	}	

	private Logger initiateLogger() 
	{
		Logger logger = Logger.getLogger("Server Logs/" + this.branchID + "- Server Log");
		FileHandler fh;
		
		try
		{
			//FileHandler Configuration and Format Configuration
			fh = new FileHandler("Server Logs/" + this.branchID + " - Server Log.log");
			
			//Disable console handling
			logger.setUseParentHandlers(false);
			logger.addHandler(fh);
			
			//Formatting configuration
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);
		}
		catch (SecurityException e)
		{
			System.err.println("Server Log: Error: Security Exception " + e);
			e.printStackTrace();
		}
		catch (IOException e)
		{
			System.err.println("Server Log: Error: IO Exception " + e);
			e.printStackTrace();
		}
		
		System.out.println("Server Log: Logger initialization success.");
		
		return logger;
	}

	@Override
	public String[] getAllCustomerAccount()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createAccount(String firstName, String lastName, String address, String phone, String customerID,
	        common.BranchID branchID) throws invalid_client
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editRecord(String customerID, common.EditRecordFields fieldName, String newValue)
	        throws invalid_client
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deposit(String customerID, float amount) throws invalid_client, invalid_bankOperation
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(String customerID, float amount) throws invalid_client, invalid_bankOperation
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBalance(String customerID) throws invalid_client
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean transferFund(String sourceID, float amount, String destID) throws invalid_client, invalid_bankOperation
	{
		return false;	
	}

	@Override
	public int getUDPPort()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getUDPHost()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void shutdown()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLocalAccountCount()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public BranchID getBranchID()
	{
		return branchID;
	}

	public int getClientCount()
	{
		return clientCount;
	}	
}