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
    
    @Override()
    public boolean equals(Object obj) {
        if (obj == null) {
            // Return
            return (false);
            // End Return

        }
        if (getClass() != obj.getClass()) {
            // Return
            return (false);
            // End Return

        }
        final Item other = ((Item)((Item)obj));
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            // Return
            return (false);
            // End Return

        }
        // Return
        return (true);
        // End Return

    }
    
    @Override()
    public int hashCode() {
        int hash = 5;
        // Begin Expr2
        hash = 79 * hash + (this.name != null ? this.name.hashCode() : 0);
        // Return
        return (hash);
        // End Return

    }
    
    public static void main(String[] args) {
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
