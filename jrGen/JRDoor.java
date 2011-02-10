/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRDoor
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_doorProcess_voidTovoid;
	public Cap_ext_ JRget_op_doorProcess_voidTovoid() {
		return op_doorProcess_voidTovoid;
	}
	public void JRset_op_doorProcess_voidTovoid(Cap_ext_ op_doorProcess_voidTovoid) {
		this.op_doorProcess_voidTovoid = op_doorProcess_voidTovoid;
	}

	public Cap_ext_ op_leave_PersonTovoid;
	public Cap_ext_ JRget_op_leave_PersonTovoid() {
		return op_leave_PersonTovoid;
	}
	public void JRset_op_leave_PersonTovoid(Cap_ext_ op_leave_PersonTovoid) {
		this.op_leave_PersonTovoid = op_leave_PersonTovoid;
	}

	public Cap_ext_ op_lock_Cap_voidTovoidTojavadotutildotArrayList;
	public Cap_ext_ JRget_op_lock_Cap_voidTovoidTojavadotutildotArrayList() {
		return op_lock_Cap_voidTovoidTojavadotutildotArrayList;
	}
	public void JRset_op_lock_Cap_voidTovoidTojavadotutildotArrayList(Cap_ext_ op_lock_Cap_voidTovoidTojavadotutildotArrayList) {
		this.op_lock_Cap_voidTovoidTojavadotutildotArrayList = op_lock_Cap_voidTovoidTojavadotutildotArrayList;
	}

	public Cap_ext_ op_add_PersonToboolean;
	public Cap_ext_ JRget_op_add_PersonToboolean() {
		return op_add_PersonToboolean;
	}
	public void JRset_op_add_PersonToboolean(Cap_ext_ op_add_PersonToboolean) {
		this.op_add_PersonToboolean = op_add_PersonToboolean;
	}

	public JRDoor(JRDoor copy)
	{
	this.op_doorProcess_voidTovoid = copy.op_doorProcess_voidTovoid;
	this.op_leave_PersonTovoid = copy.op_leave_PersonTovoid;
	this.op_lock_Cap_voidTovoidTojavadotutildotArrayList = copy.op_lock_Cap_voidTovoidTojavadotutildotArrayList;
	this.op_add_PersonToboolean = copy.op_add_PersonToboolean;

	}
	public JRDoor(Object ... opSig)
	{
	this.op_doorProcess_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_leave_PersonTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_lock_Cap_voidTovoidTojavadotutildotArrayList = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_add_PersonToboolean = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);

	}
	public JRDoor(boolean dummy)	{
	    super(dummy);
	this.op_doorProcess_voidTovoid = Cap_ext_.noop;
	this.op_leave_PersonTovoid = Cap_ext_.noop;
	this.op_lock_Cap_voidTovoidTojavadotutildotArrayList = Cap_ext_.noop;
	this.op_add_PersonToboolean = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRDoor(true);
	}
    }
