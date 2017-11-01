package common;


/**
* common/BranchIDHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from bankserver.idl
* Tuesday, October 31, 2017 11:43:13 PM EDT
*/

abstract public class BranchIDHelper
{
  private static String  _id = "IDL:common/BranchID:1.0";

  public static void insert (org.omg.CORBA.Any a, common.BranchID that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static common.BranchID extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (common.BranchIDHelper.id (), "BranchID", new String[] { "BC", "MB", "NB", "QC"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static common.BranchID read (org.omg.CORBA.portable.InputStream istream)
  {
    return common.BranchID.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, common.BranchID value)
  {
    ostream.write_long (value.value ());
  }

}
