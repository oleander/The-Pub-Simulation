/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;
import java.util.*;

public class Item extends java.lang.Object {
    { JRinit(); }
    private final String name;
    
    @Override()
    public String toString() {
        // Return
        return (name);
        // End Return

    }
    
    public Item(String name) {
        // Begin Expr2
        super();
        // Begin Expr2
        this.name = name;
        JRprocess();
    }
    protected boolean JRcalled = false;
    protected JRItem jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRItem();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
