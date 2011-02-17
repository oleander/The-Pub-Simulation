/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRPerson
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_personProcess_voidTovoid;
	public Cap_ext_ JRget_op_personProcess_voidTovoid() {
		return op_personProcess_voidTovoid;
	}
	public void JRset_op_personProcess_voidTovoid(Cap_ext_ op_personProcess_voidTovoid) {
		this.op_personProcess_voidTovoid = op_personProcess_voidTovoid;
	}

	public Cap_ext_ op_tellLastCallOrClosing_voidTovoid;
	public Cap_ext_ JRget_op_tellLastCallOrClosing_voidTovoid() {
		return op_tellLastCallOrClosing_voidTovoid;
	}
	public void JRset_op_tellLastCallOrClosing_voidTovoid(Cap_ext_ op_tellLastCallOrClosing_voidTovoid) {
		this.op_tellLastCallOrClosing_voidTovoid = op_tellLastCallOrClosing_voidTovoid;
	}

	public JRPerson(JRPerson copy)
	{
	this.op_personProcess_voidTovoid = copy.op_personProcess_voidTovoid;
	this.op_tellLastCallOrClosing_voidTovoid = copy.op_tellLastCallOrClosing_voidTovoid;

	}
	public JRPerson(Object ... opSig)
	{
	this.op_personProcess_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_tellLastCallOrClosing_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRPerson(boolean dummy)	{
	    super(dummy);
	this.op_personProcess_voidTovoid = Cap_ext_.noop;
	this.op_tellLastCallOrClosing_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRPerson(true);
	}
    }
