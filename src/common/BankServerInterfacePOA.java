package common;


/**
* common/BankServerInterfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from bankserver.idl
* Thursday, November 2, 2017 4:02:20 PM EDT
*/


//Interface for the Banking Server
public abstract class BankServerInterfacePOA extends org.omg.PortableServer.Servant
 implements common.BankServerInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getLocalAccountCount", new java.lang.Integer (0));
    _methods.put ("getAllCustomerAccount", new java.lang.Integer (1));
    _methods.put ("createAccount", new java.lang.Integer (2));
    _methods.put ("editRecord", new java.lang.Integer (3));
    _methods.put ("deposit", new java.lang.Integer (4));
    _methods.put ("withdraw", new java.lang.Integer (5));
    _methods.put ("getBalance", new java.lang.Integer (6));
    _methods.put ("transferFund", new java.lang.Integer (7));
    _methods.put ("getUDPPort", new java.lang.Integer (8));
    _methods.put ("getUDPHost", new java.lang.Integer (9));
    _methods.put ("shutdown", new java.lang.Integer (10));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // common/BankServerInterface/getLocalAccountCount
       {
         int $result = (int)0;
         $result = this.getLocalAccountCount ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // common/BankServerInterface/getAllCustomerAccount
       {
         String $result[] = null;
         $result = this.getAllCustomerAccount ();
         out = $rh.createReply();
         common.BankServerInterfacePackage.accountsHelper.write (out, $result);
         break;
       }

       case 2:  // common/BankServerInterface/createAccount
       {
         try {
           String firstName = in.read_string ();
           String lastName = in.read_string ();
           String address = in.read_string ();
           String phone = in.read_string ();
           String customerID = in.read_string ();
           common.BranchID branchID = common.BranchIDHelper.read (in);
           boolean $result = false;
           $result = this.createAccount (firstName, lastName, address, phone, customerID, branchID);
           out = $rh.createReply();
           out.write_boolean ($result);
         } catch (common.BankServerInterfacePackage.invalid_client $ex) {
           out = $rh.createExceptionReply ();
           common.BankServerInterfacePackage.invalid_clientHelper.write (out, $ex);
         }
         break;
       }

       case 3:  // common/BankServerInterface/editRecord
       {
         try {
           String customerID = in.read_string ();
           common.EditRecordFields fieldName = common.EditRecordFieldsHelper.read (in);
           String newValue = in.read_string ();
           boolean $result = false;
           $result = this.editRecord (customerID, fieldName, newValue);
           out = $rh.createReply();
           out.write_boolean ($result);
         } catch (common.BankServerInterfacePackage.invalid_client $ex) {
           out = $rh.createExceptionReply ();
           common.BankServerInterfacePackage.invalid_clientHelper.write (out, $ex);
         }
         break;
       }

       case 4:  // common/BankServerInterface/deposit
       {
         try {
           String customerID = in.read_string ();
           double amount = in.read_double ();
           boolean $result = false;
           $result = this.deposit (customerID, amount);
           out = $rh.createReply();
           out.write_boolean ($result);
         } catch (common.BankServerInterfacePackage.invalid_client $ex) {
           out = $rh.createExceptionReply ();
           common.BankServerInterfacePackage.invalid_clientHelper.write (out, $ex);
         } catch (common.BankServerInterfacePackage.invalid_bankOperation $ex) {
           out = $rh.createExceptionReply ();
           common.BankServerInterfacePackage.invalid_bankOperationHelper.write (out, $ex);
         }
         break;
       }

       case 5:  // common/BankServerInterface/withdraw
       {
         try {
           String customerID = in.read_string ();
           double amount = in.read_double ();
           boolean $result = false;
           $result = this.withdraw (customerID, amount);
           out = $rh.createReply();
           out.write_boolean ($result);
         } catch (common.BankServerInterfacePackage.invalid_client $ex) {
           out = $rh.createExceptionReply ();
           common.BankServerInterfacePackage.invalid_clientHelper.write (out, $ex);
         } catch (common.BankServerInterfacePackage.invalid_bankOperation $ex) {
           out = $rh.createExceptionReply ();
           common.BankServerInterfacePackage.invalid_bankOperationHelper.write (out, $ex);
         }
         break;
       }

       case 6:  // common/BankServerInterface/getBalance
       {
         try {
           String customerID = in.read_string ();
           double $result = (double)0;
           $result = this.getBalance (customerID);
           out = $rh.createReply();
           out.write_double ($result);
         } catch (common.BankServerInterfacePackage.invalid_client $ex) {
           out = $rh.createExceptionReply ();
           common.BankServerInterfacePackage.invalid_clientHelper.write (out, $ex);
         }
         break;
       }

       case 7:  // common/BankServerInterface/transferFund
       {
         try {
           String sourceID = in.read_string ();
           float amount = in.read_float ();
           String destID = in.read_string ();
           boolean $result = false;
           $result = this.transferFund (sourceID, amount, destID);
           out = $rh.createReply();
           out.write_boolean ($result);
         } catch (common.BankServerInterfacePackage.invalid_client $ex) {
           out = $rh.createExceptionReply ();
           common.BankServerInterfacePackage.invalid_clientHelper.write (out, $ex);
         } catch (common.BankServerInterfacePackage.invalid_bankOperation $ex) {
           out = $rh.createExceptionReply ();
           common.BankServerInterfacePackage.invalid_bankOperationHelper.write (out, $ex);
         }
         break;
       }

       case 8:  // common/BankServerInterface/getUDPPort
       {
         int $result = (int)0;
         $result = this.getUDPPort ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 9:  // common/BankServerInterface/getUDPHost
       {
         String $result = null;
         $result = this.getUDPHost ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 10:  // common/BankServerInterface/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:common/BankServerInterface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public BankServerInterface _this() 
  {
    return BankServerInterfaceHelper.narrow(
    super._this_object());
  }

  public BankServerInterface _this(org.omg.CORBA.ORB orb) 
  {
    return BankServerInterfaceHelper.narrow(
    super._this_object(orb));
  }


} // class BankServerInterfacePOA
