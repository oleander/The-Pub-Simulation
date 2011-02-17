/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;
import java.util.*;

public class Global extends java.lang.Object {
    { JRinit(); }
    
    public Global() {
        // Begin Expr2
        super();
        JRprocess();
    }
    public static Door door;
    public static int tableCapacities = 10;
    public static int startGlassCount = 10;
    public static int startCupsCount = 10;
    private static final int BEER_DRINKING_TIME = 100;
    private static final int CAPPUCINO_DRINKING_TIME = 100;
    private static final int CHOCLATE_DRINKING_TIME = 100;
    public static final Item beerTap = new Item("Beer tap");
    public static final Item coffee = new Item("Coffee");
    public static final Item milk = new Item("Milk");
    public static final Item choclatePowder = new Item("Choclate Powder");
    public static final List IngrediensList = Arrays.asList(beerTap, coffee, milk, choclatePowder);
    public static final BeverageWare glass = new BeverageWare("Glass", 1);
    public static final BeverageWare cup = new BeverageWare("Cup", 2);
    private static final List beerIngredients = Arrays.asList(beerTap);
    private static final List cappucinoIngredients = Arrays.asList(milk, coffee);
    private static final List choclateIngredients = Arrays.asList(milk, choclatePowder);
    public static final Beverage beer = new Beverage("Beer", BEER_DRINKING_TIME, glass, beerIngredients);
    public static final Beverage cappucino = new Beverage("Cappucino", CAPPUCINO_DRINKING_TIME, cup, cappucinoIngredients);
    public static final Beverage choclate = new Beverage("Choclate", CHOCLATE_DRINKING_TIME, cup, choclateIngredients);
    public static final List beverageList = Arrays.asList(beer, cappucino, choclate);
    protected boolean JRcalled = false;
    protected JRGlobal jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRGlobal();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
