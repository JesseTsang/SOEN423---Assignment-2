package common.BankServerInterfacePackage;


/**
* common/BankServerInterfacePackage/invalid_bankOperation.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from bankserver.idl
* Tuesday, October 31, 2017 11:43:13 PM EDT
*/

public final class invalid_bankOperation extends org.omg.CORBA.UserException
{

  public invalid_bankOperation ()
  {
    super(invalid_bankOperationHelper.id());
  } // ctor


  public invalid_bankOperation (String $reason)
  {
    super(invalid_bankOperationHelper.id() + "  " + $reason);
  } // ctor

} // class invalid_bankOperation
