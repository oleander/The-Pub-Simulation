/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;
import java.util.*;

public class Person extends java.lang.Object {
    { JRinit(); }
    private static int startId = 0;
    private int id;
    private Door door;
    private boolean alive;
    
    @Override()
    public String toString() {
        // Return
        return ("" + id);
        // End Return

    }
    
    public Person() {
        // Begin Expr2
        super();
        // Begin Expr2
        id = startId++;
        // Begin Expr2
        enterDoor();
        JRprocess();
    }
    
    private void enterDoor() {
        // Begin Expr2
        alive = ((Boolean) (new Cap_ext_(Global.door.JRget_op_add_PersonToboolean(), "boolean")).call(jrvm.getTimestamp(), new java.lang.Object [] {this}));
    }
    
    public void leaveBar() {
        // Begin JRCall
        // Begin Expr2
        (new Cap_ext_(Global.door.JRget_op_leave_PersonTovoid(), "void")).call(jrvm.getTimestamp(), new java.lang.Object [] {this});// End JRCall
        
        // Begin Expr2
        alive = false;
    }
    protected boolean JRcalled = false;
    protected JRPerson jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRPerson();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
