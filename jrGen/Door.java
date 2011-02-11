/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;
import java.util.*;
import java.util.ArrayList;

public class Door extends java.lang.Object {
    { JRinit(); }
    private ArrayList entrants;
    private boolean isLocked;
    private // NUMBER 8
    Cap_ext_ returnOkCap;
    public Op_ext.JRProxyOp JRget_op_add_PersonToboolean()
    {
        return op_add_PersonToboolean;
    }
    
    public Op_ext.JRProxyOp op_add_PersonToboolean;
    
    public Op_ext.JRProxyOp JRget_op_lock_Cap_voidTovoidTojavadotutildotArrayList()
    {
        return op_lock_Cap_voidTovoidTojavadotutildotArrayList;
    }
    
    public Op_ext.JRProxyOp op_lock_Cap_voidTovoidTojavadotutildotArrayList;
    
    public Op_ext.JRProxyOp JRget_op_leave_PersonTovoid()
    {
        return op_leave_PersonTovoid;
    }
    
    public Op_ext.JRProxyOp op_leave_PersonTovoid;
    
    
    public Door() {
        // Begin Expr2
        super();
        // Begin Expr2
        entrants = new ArrayList();
        // Begin Expr2
        isLocked = false;
        // Begin Expr2
        Global.door = this;
        JRprocess();
    }
    private Op_ext.JRProxyOp JRget_op_doorProcess_voidTovoid()
    {
        return op_doorProcess_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_doorProcess_voidTovoid;
    class ProcOp_voidTovoid_impldoorProcess extends ProcOp_ext_impl
    {
        Door thisarg;
        public ProcOp_voidTovoid_impldoorProcess(Door thisIn) throws RemoteException
        {
        thisarg = thisIn;
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                thisarg.doorProcessvoidTovoid(null, null, null, JRargs);
return null;
            } finally {
                jrvm.sendAndDie();    // to caller
            }
        }
        class sendThread implements Runnable
        {
            java.lang.Object [] JRargs;
            Op_ext.JRProxyOp retOp;
            Cap_ext fretOp;
            edu.ucdavis.jr.RemoteHandler handler;

            public sendThread(Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.handler = handler;
            }
            public sendThread(Op_ext.JRProxyOp retOp, Cap_ext fretOp,edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.fretOp = fretOp;
                this.handler = handler;
            }
            public void run()
            {
                try    {
                    thisarg.doorProcessvoidTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
                } catch (Exception e) {/* should be safe to ignore this exception */}
                jrvm.threadDeath();
            }
        }
        public void send(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, null, null, JRargs);
        }
        public void send(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, handler, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, null, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, handler, null, JRargs);
        }
        public void send(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, handler, JRargs)).start();
        }
        public Cap_ext cosend(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(null, handler, JRargs)).start();
            Op_ext.JRProxyOp myretOp = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            myretOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            return new Cap_ext_(myretOp, "void");
        }
        public Cap_ext cocall(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, null, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Cap_ext cocall(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, Cap_ext fretOp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, fretOp, handler, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Recv_ext recv() throws RemoteException
        {
            /* This is an error */
            throw new jrRuntimeError("Receive invoked on an operation/operation capability associated with a method!");
        }
        public void deliverPendingMessages()
        {
            /* This is an error */
            throw new jrRuntimeError("Message delivery invoked on an operation associated with a method!");
        }
        public int length()
        {
            return 0;
        }
        public InOpIterator elements()
        {
            // This is an error
            throw new jrRuntimeError("Elements invoked on an operation / operation capability associated with a method!");
        }
        public InLock getLock()
        {
            // This is an error
            throw new jrRuntimeError("getLock invoked on an operation / operation capability associated with a method!");
        }
        public long getFirstTime()
        {
            // This is an error
            throw new jrRuntimeError("getFirstTime invoked on an operation / operation capability associated with a method!");
        }
        public boolean isRemote(String site)
        {
            // This is an error
            throw new jrRuntimeError("IsRemote invoked on an operation / operation capability associated with a method!");
        }
    }
    
    private void doorProcessvoidTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_doorProcess_voidTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private void doorProcessvoidTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            {
                // Begin Expr2
                startLoop();
                // Begin Expr2
                System.out.println("Door process exits ...");
                // Return
                { if (retOp != null)
                    retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, null);
                return ; }
                // End Return

            }
        } catch (Exception JRe)    {
            if (retOp != null && fretOp == null)
            {
        	// if it is a forward cocall with handler
        	if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
        	    handler.JRhandler(JRe);
        	else
        	    // give preference to propagation through the call stack
        	    retOp.send(jrvm.getTimestamp(), JRe);
            }
            else if ((retOp != null) && (fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// for COSTMT exception handling in operation
        	if (handler != null)
        	    handler.JRhandler(JRe);
        	fretOp.send(jrvm.getTimestamp(), handler, (java.lang.Object []) null);
            }
            else if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// this should only be for a send/forward
        	handler.JRhandler(JRe);
        	// can rethrow below just to get out of this method
            }
            // rethrow the proper type of exception
            // catch all
            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at "+ jrRuntimeError.where(JRe));
        }
    }
    
    
    @SuppressWarnings(value = "unchecked")
    private void startLoop() {
        InStatObj JRInstmt0 = new InStatObj(3, false);
        JRLoop0: while (true) {
            {
                // Inni Statement without quantifier
                JRInstmt0.armArray[0] = new QuantRec(new Cap_ext_(op_lock_Cap_voidTovoidTojavadotutildotArrayList, "java.util.ArrayList<Person>"), 0, 0);
                JRInstmt0.armArray[1] = new QuantRec(new Cap_ext_(op_add_PersonToboolean, "boolean"), 1, 1);
                JRInstmt0.armArray[2] = new QuantRec(new Cap_ext_(op_leave_PersonTovoid, "void"), 2, 2);
                JRInstmt0.lock();
                // Equivalence Class has been created and locked
                JRInstmt0.serviced = false;
                _label_JRInstmt0: do
                {
                    Invocation JRfinalInvoc0 = null;
                    // find THE invocation and service it
                    JRInstmt0.gatherAndSortTimes();
                    for (JRInstmt0.i = 0;
                        (JRInstmt0.i < JRInstmt0.N) && !JRInstmt0.serviced;
                         JRInstmt0.i++)
                    {
                        JRInstmt0.byStrt = true;
                        JRInstmt0.releaseIter();
                        // if the op is empty
                        if (JRInstmt0.timesArray[JRInstmt0.i].time < 0) continue;
                        switch (JRInstmt0.timesArray[JRInstmt0.i].opNum)
                        {
                            case 0:
                            {
                                JRInstmt0.j = 0;
                                // Inni Arm
                                QuantRec JRquantRec0 = (QuantRec)JRInstmt0.armArray[JRInstmt0.timesArray[JRInstmt0.i].armArrayIndex];
                                Recv_ext JRrrecv0 = null, JRtmprecv0;
                                // not artificial
                                // NUMBER 3
                                Cap_ext_ returnOkCap = null;
                                for (JRInstmt0.iter = JRInstmt0.armArray[JRInstmt0.timesArray[JRInstmt0.i].armArrayIndex].theCap.elements();
                                     JRInstmt0.iter.hasNext();)
                                {
                                    JRtmprecv0 = (Recv_ext)JRInstmt0.iter.next();
                                    JRInstmt0.JRinit.setInvoc(JRInstmt0.j++);
                                    JRtmprecv0.setInvocation(JRInstmt0.JRinit);
                                    // extract values
                                    returnOkCap = (// not artificial
                                    // NUMBER 3
                                    Cap_ext_)JRtmprecv0.JRargs[0];
                                    JRrrecv0 = JRtmprecv0;
                                    break;  // get first one
                                }
                                // Start of servicing
                                if (JRrrecv0 != null)
                                {
                                    JRInstmt0.j = (int)JRrrecv0.getInvoc();
                                    JRInstmt0.serviced = true;
                                    JRInstmt0.iter.remove(JRInstmt0.j);
                                    JRInstmt0.releaseIter();
                                    JRInstmt0.unlock();
                                    {
                                        try {
                                            {
                                                // Begin Expr2
                                                isLocked = true;
                                                // Begin Expr2
                                                this.returnOkCap = returnOkCap;
                                                // Return
                                                {
                                                    if (true)
                                                        { if (JRrrecv0.retOp != null)
                                                            JRrrecv0.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(new ArrayList(entrants))});
                                                        else {
                                                            java.util.ArrayList JRevaltmp = new ArrayList(entrants);
                                                            
                                                        }
                                                        break _label_JRInstmt0; }}
                                                
                                                // End Return

                                            }
                                        } catch (Exception JRe) {
                                            if (JRrrecv0.retOp != null && JRrrecv0.fretOp == null)
                                            {
                                                // forward of cocall
                                                if ((JRrrecv0.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    JRrrecv0.handler.JRhandler(JRe);
                                                else {
                                                    // give preference to propagation through the call stack
                                                    JRrrecv0.retOp.send(jrvm.getTimestamp(), JRe);
                                                    JRrrecv0.retOp = null;
                                                }
                                            }
                                            else if ((JRrrecv0.retOp != null) && (JRrrecv0.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // for cocall exception handling in operation invocation
                                                if (JRrrecv0.handler != null)
                                                    JRrrecv0.handler.JRhandler(JRe);
                                                    else {
                                                        // catch all
                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                    }
JRrrecv0.fretOp.send(jrvm.getTimestamp(), JRrrecv0.handler, (java.lang.Object []) null);
                                                JRrrecv0.fretOp = null;
                                            }
                                            else if ((JRrrecv0.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // this should only be a send
                                                JRrrecv0.handler.JRhandler(JRe);
                                            }
    else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
                                        }
                                    }
                                    
                                }
                                else
                                    JRInstmt0.releaseIter();
                                // End of servicing
                                // End InniArm
                                break;
                            }
                            case 1:
                            {
                                JRInstmt0.j = 0;
                                // Inni Arm
                                QuantRec JRquantRec0 = (QuantRec)JRInstmt0.armArray[JRInstmt0.timesArray[JRInstmt0.i].armArrayIndex];
                                Recv_ext JRrrecv0 = null, JRtmprecv0;
                                // not artificial
                                Person p = null;
                                for (JRInstmt0.iter = JRInstmt0.armArray[JRInstmt0.timesArray[JRInstmt0.i].armArrayIndex].theCap.elements();
                                     JRInstmt0.iter.hasNext();)
                                {
                                    JRtmprecv0 = (Recv_ext)JRInstmt0.iter.next();
                                    JRInstmt0.JRinit.setInvoc(JRInstmt0.j++);
                                    JRtmprecv0.setInvocation(JRInstmt0.JRinit);
                                    // extract values
                                    p = (// not artificial
                                    Person)JRtmprecv0.JRargs[0];
                                    JRrrecv0 = JRtmprecv0;
                                    break;  // get first one
                                }
                                // Start of servicing
                                if (JRrrecv0 != null)
                                {
                                    JRInstmt0.j = (int)JRrrecv0.getInvoc();
                                    JRInstmt0.serviced = true;
                                    JRInstmt0.iter.remove(JRInstmt0.j);
                                    JRInstmt0.releaseIter();
                                    JRInstmt0.unlock();
                                    {
                                        try {
                                            {
                                                if (isLocked) {
                                                    // Return
                                                    {
                                                        if (true)
                                                            { if (JRrrecv0.retOp != null)
                                                                JRrrecv0.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(boolean)(false)});
                                                            else {
                                                                boolean JRevaltmp = false;
                                                                
                                                            }
                                                            break _label_JRInstmt0; }}
                                                    
                                                    // End Return

                                                }
                                                // Begin Expr2
                                                addPersonToList(p);
                                                // Return
                                                {
                                                    if (true)
                                                        { if (JRrrecv0.retOp != null)
                                                            JRrrecv0.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(boolean)(true)});
                                                        else {
                                                            boolean JRevaltmp = true;
                                                            
                                                        }
                                                        break _label_JRInstmt0; }}
                                                
                                                // End Return

                                            }
                                        } catch (Exception JRe) {
                                            if (JRrrecv0.retOp != null && JRrrecv0.fretOp == null)
                                            {
                                                // forward of cocall
                                                if ((JRrrecv0.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    JRrrecv0.handler.JRhandler(JRe);
                                                else {
                                                    // give preference to propagation through the call stack
                                                    JRrrecv0.retOp.send(jrvm.getTimestamp(), JRe);
                                                    JRrrecv0.retOp = null;
                                                }
                                            }
                                            else if ((JRrrecv0.retOp != null) && (JRrrecv0.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // for cocall exception handling in operation invocation
                                                if (JRrrecv0.handler != null)
                                                    JRrrecv0.handler.JRhandler(JRe);
                                                    else {
                                                        // catch all
                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                    }
JRrrecv0.fretOp.send(jrvm.getTimestamp(), JRrrecv0.handler, (java.lang.Object []) null);
                                                JRrrecv0.fretOp = null;
                                            }
                                            else if ((JRrrecv0.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // this should only be a send
                                                JRrrecv0.handler.JRhandler(JRe);
                                            }
    else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
                                        }
                                    }
                                    
                                }
                                else
                                    JRInstmt0.releaseIter();
                                // End of servicing
                                // End InniArm
                                break;
                            }
                            case 2:
                            {
                                JRInstmt0.j = 0;
                                // Inni Arm
                                QuantRec JRquantRec0 = (QuantRec)JRInstmt0.armArray[JRInstmt0.timesArray[JRInstmt0.i].armArrayIndex];
                                Recv_ext JRrrecv0 = null, JRtmprecv0;
                                // not artificial
                                Person p = null;
                                for (JRInstmt0.iter = JRInstmt0.armArray[JRInstmt0.timesArray[JRInstmt0.i].armArrayIndex].theCap.elements();
                                     JRInstmt0.iter.hasNext();)
                                {
                                    JRtmprecv0 = (Recv_ext)JRInstmt0.iter.next();
                                    JRInstmt0.JRinit.setInvoc(JRInstmt0.j++);
                                    JRtmprecv0.setInvocation(JRInstmt0.JRinit);
                                    // extract values
                                    p = (// not artificial
                                    Person)JRtmprecv0.JRargs[0];
                                    JRrrecv0 = JRtmprecv0;
                                    break;  // get first one
                                }
                                // Start of servicing
                                if (JRrrecv0 != null)
                                {
                                    JRInstmt0.j = (int)JRrrecv0.getInvoc();
                                    JRInstmt0.serviced = true;
                                    JRInstmt0.iter.remove(JRInstmt0.j);
                                    JRInstmt0.releaseIter();
                                    JRInstmt0.unlock();
                                    {
                                        try {
                                            {
                                                // Begin Expr2
                                                removePersonFromList(p);
                                                if (isLocked && entrants.size() == 1) {
                                                    returnOkCap.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
                                                    { if (JRrrecv0.retOp != null)
                                                        JRrrecv0.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
                                                    break JRLoop0;}
                                                }
                                            }
                                        } catch (Exception JRe) {
                                            if (JRrrecv0.retOp != null && JRrrecv0.fretOp == null)
                                            {
                                                // forward of cocall
                                                if ((JRrrecv0.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    JRrrecv0.handler.JRhandler(JRe);
                                                else {
                                                    // give preference to propagation through the call stack
                                                    JRrrecv0.retOp.send(jrvm.getTimestamp(), JRe);
                                                    JRrrecv0.retOp = null;
                                                }
                                            }
                                            else if ((JRrrecv0.retOp != null) && (JRrrecv0.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // for cocall exception handling in operation invocation
                                                if (JRrrecv0.handler != null)
                                                    JRrrecv0.handler.JRhandler(JRe);
                                                    else {
                                                        // catch all
                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                    }
JRrrecv0.fretOp.send(jrvm.getTimestamp(), JRrrecv0.handler, (java.lang.Object []) null);
                                                JRrrecv0.fretOp = null;
                                            }
                                            else if ((JRrrecv0.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // this should only be a send
                                                JRrrecv0.handler.JRhandler(JRe);
                                            }
    else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
                                        }
                                    }
                                    { if (JRrrecv0.retOp != null)
                                        JRrrecv0.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                }
                                else
                                    JRInstmt0.releaseIter();
                                // End of servicing
                                // End InniArm
                                break;
                            }
                            
                        }
                    }
                    if (!JRInstmt0.serviced)
                    {
                        // must block and loop
                        JRInstmt0.waitOnLock();
                    }
                } while (!JRInstmt0.serviced);
            }
            // End Inni
            
        }
    }
    
    @SuppressWarnings(value = "unchecked")
    private void addPersonToList(Person p) {
        // Begin Expr2
        entrants.add(p);
    }
    
    @SuppressWarnings(value = "unchecked")
    private void removePersonFromList(Person p) {
        // Begin Expr2
        entrants.remove(p);
    }
    
    public static void main(String[] args) {
        // Begin Expr2
        allDoorTests();
    }
    
    public static void allDoorTests() {
        // Begin Expr2
        testOnePersonEnters();
        // Begin Expr2
        testOnePersonLeaving();
        // Begin Expr2
        testDoor();
        // Begin Expr2
        System.out.println("Door tests passed.");
    }
    
    public static void testOnePersonEnters() {
        Door d = new Door();
        // Begin Expr2
        asserts(d.entrants.size() == 0, "Door should start empty");
        Person p = new Person(true);
        // Begin Expr2
        JR.nap(10);
        // Begin Expr2
        asserts(d.entrants.get(0) == p, "Person p should be in list");
        // Begin Expr2
        asserts(d.entrants.size() == 1, "Should only be 1 person in list");
    }
    
    public static void testOnePersonLeaving() {
        Door d = new Door();
        Person p = new Person(true);
        // Begin Expr2
        JR.nap(10);
        // Begin Expr2
        p.leaveBar();
        // Begin Expr2
        JR.nap(10);
        // Begin Expr2
        asserts(d.entrants.size() == 0, "Everyone should have exited.");
    }
    
    public static void testDoor() {
        InStatObj JRInstmt2 = new InStatObj(1, false);
        InStatObj JRInstmt1 = new InStatObj(1, false);
        Door d = new Door();
        Person p1 = new Person(false);
        // Begin Expr2
        asserts(((Boolean) (new Cap_ext_(d.JRget_op_add_PersonToboolean(), "boolean")).call(jrvm.getTimestamp(), new java.lang.Object [] {p1})), "Door should start open");
        // Begin Expr2
        asserts(d.entrants.size() == 1, "Should only be 1 person in list");
        Person p2 = new Person(false);
        // Begin Expr2
        (new Cap_ext_(d.JRget_op_add_PersonToboolean(), "boolean")).call(jrvm.getTimestamp(), new java.lang.Object [] {p2});
        // Begin Expr2
        asserts(d.entrants.size() == 2, "Two should \'ve entered");
        // Begin Expr2
        asserts(d.entrants.contains(p1), "p1 should be in list");
        // Begin Expr2
        asserts(d.entrants.contains(p2), "p2 should be in list");
        Person landlord = new Person(true);
        Op_ext.JRProxyOp op_returnCap_voidTovoid = null;
        try{
            op_returnCap_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError("Cannot initialize op"); }
        
        
        ArrayList list = ((java.util.ArrayList) (new Cap_ext_(d.JRget_op_lock_Cap_voidTovoidTojavadotutildotArrayList(), "java.util.ArrayList")).call(jrvm.getTimestamp(), new java.lang.Object [] {new Cap_ext_(op_returnCap_voidTovoid)}));
        // Begin Expr2
        asserts(list != d.entrants, "Should not be reference to entrants!");
        // Begin Expr2
        asserts(list.equals(d.entrants), "Should however be equal to entrants!");
        Person p3 = new Person(false);
        // Begin Expr2
        asserts(!((Boolean) (new Cap_ext_(d.JRget_op_add_PersonToboolean(), "boolean")).call(jrvm.getTimestamp(), new java.lang.Object [] {p3})), "Door is locked, p3 should be rejected");
        // Begin Expr2
        asserts(d.entrants.size() == 3, "Nobody should\'ve entered yet since it was locked (2persons + landlord is in)");
        // Begin Expr2
        (new Cap_ext_(d.JRget_op_leave_PersonTovoid(), "void")).call(jrvm.getTimestamp(), new java.lang.Object [] {p1});
        // Begin Expr2
        asserts(d.entrants.size() == 2, "only 1 + landlord should be left");
        // Begin Expr2
        asserts(d.entrants.contains(p2), "p2 should be left");
        // Begin Expr2
        JR.nap(10);
        {
            // Inni Statement without quantifier
            JRInstmt1.armArray[0] = new QuantRec(new Cap_ext_(op_returnCap_voidTovoid, "void"), 0, 0);
            JRInstmt1.lock();
            // Equivalence Class has been created and locked
            JRInstmt1.serviced = false;
            _label_JRInstmt1: do
            {
                Invocation JRfinalInvoc1 = null;
                // find THE invocation and service it
                JRInstmt1.gatherAndSortTimes();
                for (JRInstmt1.i = 0;
                    (JRInstmt1.i < JRInstmt1.N) && !JRInstmt1.serviced;
                     JRInstmt1.i++)
                {
                    JRInstmt1.byStrt = true;
                    JRInstmt1.releaseIter();
                    // if the op is empty
                    if (JRInstmt1.timesArray[JRInstmt1.i].time < 0) continue;
                    switch (JRInstmt1.timesArray[JRInstmt1.i].opNum)
                    {
                        case 0:
                        {
                            JRInstmt1.j = 0;
                            // Inni Arm
                            QuantRec JRquantRec1 = (QuantRec)JRInstmt1.armArray[JRInstmt1.timesArray[JRInstmt1.i].armArrayIndex];
                            Recv_ext JRrrecv1 = null, JRtmprecv1;
                            for (JRInstmt1.iter = JRInstmt1.armArray[JRInstmt1.timesArray[JRInstmt1.i].armArrayIndex].theCap.elements();
                                 JRInstmt1.iter.hasNext();)
                            {
                                JRtmprecv1 = (Recv_ext)JRInstmt1.iter.next();
                                JRInstmt1.JRinit.setInvoc(JRInstmt1.j++);
                                JRtmprecv1.setInvocation(JRInstmt1.JRinit);
                                // extract values
                                JRrrecv1 = JRtmprecv1;
                                break;  // get first one
                            }
                            // Start of servicing
                            if (JRrrecv1 != null)
                            {
                                JRInstmt1.j = (int)JRrrecv1.getInvoc();
                                JRInstmt1.serviced = true;
                                JRInstmt1.iter.remove(JRInstmt1.j);
                                JRInstmt1.releaseIter();
                                JRInstmt1.unlock();
                                {
                                    try {
                                        {
                                            // Begin Expr2
                                            asserts(false, "The closing signal is sent too early!");
                                        }
                                    } catch (Exception JRe) {
                                        if (JRrrecv1.retOp != null && JRrrecv1.fretOp == null)
                                        {
                                            // forward of cocall
                                            if ((JRrrecv1.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                JRrrecv1.handler.JRhandler(JRe);
                                            else {
                                                // give preference to propagation through the call stack
                                                JRrrecv1.retOp.send(jrvm.getTimestamp(), JRe);
                                                JRrrecv1.retOp = null;
                                            }
                                        }
                                        else if ((JRrrecv1.retOp != null) && (JRrrecv1.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                        {
                                            // for cocall exception handling in operation invocation
                                            if (JRrrecv1.handler != null)
                                                JRrrecv1.handler.JRhandler(JRe);
                                                else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
JRrrecv1.fretOp.send(jrvm.getTimestamp(), JRrrecv1.handler, (java.lang.Object []) null);
                                            JRrrecv1.fretOp = null;
                                        }
                                        else if ((JRrrecv1.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                        {
                                            // this should only be a send
                                            JRrrecv1.handler.JRhandler(JRe);
                                        }
    else {
                                                // catch all
                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                            }
                                    }
                                }
                                { if (JRrrecv1.retOp != null)
                                    JRrrecv1.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                            }
                            else
                                JRInstmt1.releaseIter();
                            // End of servicing
                            // End InniArm
                            break;
                        }
                        
                    }
                }
                if (!JRInstmt1.serviced)
                {
                    JRInstmt1.unlock();
                    JRInstmt1.serviced = true;
                    {
                    }
                }
            } while (!JRInstmt1.serviced);
        }
        // End Inni
        
        // Begin Expr2
        (new Cap_ext_(d.JRget_op_leave_PersonTovoid(), "void")).call(jrvm.getTimestamp(), new java.lang.Object [] {p2});
        // Begin Expr2
        asserts(d.entrants.size() == 1, "Only landlord should be in!");
        // Begin Expr2
        asserts(d.entrants.contains(landlord), "Only landlord should be in");
        // Begin Expr2
        JR.nap(10);
        {
            // Inni Statement without quantifier
            JRInstmt2.armArray[0] = new QuantRec(new Cap_ext_(op_returnCap_voidTovoid, "void"), 0, 0);
            JRInstmt2.lock();
            // Equivalence Class has been created and locked
            JRInstmt2.serviced = false;
            _label_JRInstmt2: do
            {
                Invocation JRfinalInvoc2 = null;
                // find THE invocation and service it
                JRInstmt2.gatherAndSortTimes();
                for (JRInstmt2.i = 0;
                    (JRInstmt2.i < JRInstmt2.N) && !JRInstmt2.serviced;
                     JRInstmt2.i++)
                {
                    JRInstmt2.byStrt = true;
                    JRInstmt2.releaseIter();
                    // if the op is empty
                    if (JRInstmt2.timesArray[JRInstmt2.i].time < 0) continue;
                    switch (JRInstmt2.timesArray[JRInstmt2.i].opNum)
                    {
                        case 0:
                        {
                            JRInstmt2.j = 0;
                            // Inni Arm
                            QuantRec JRquantRec2 = (QuantRec)JRInstmt2.armArray[JRInstmt2.timesArray[JRInstmt2.i].armArrayIndex];
                            Recv_ext JRrrecv2 = null, JRtmprecv2;
                            for (JRInstmt2.iter = JRInstmt2.armArray[JRInstmt2.timesArray[JRInstmt2.i].armArrayIndex].theCap.elements();
                                 JRInstmt2.iter.hasNext();)
                            {
                                JRtmprecv2 = (Recv_ext)JRInstmt2.iter.next();
                                JRInstmt2.JRinit.setInvoc(JRInstmt2.j++);
                                JRtmprecv2.setInvocation(JRInstmt2.JRinit);
                                // extract values
                                JRrrecv2 = JRtmprecv2;
                                break;  // get first one
                            }
                            // Start of servicing
                            if (JRrrecv2 != null)
                            {
                                JRInstmt2.j = (int)JRrrecv2.getInvoc();
                                JRInstmt2.serviced = true;
                                JRInstmt2.iter.remove(JRInstmt2.j);
                                JRInstmt2.releaseIter();
                                JRInstmt2.unlock();
                                {
                                    try {
                                        {
                                        }
                                    } catch (Exception JRe) {
                                        if (JRrrecv2.retOp != null && JRrrecv2.fretOp == null)
                                        {
                                            // forward of cocall
                                            if ((JRrrecv2.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                JRrrecv2.handler.JRhandler(JRe);
                                            else {
                                                // give preference to propagation through the call stack
                                                JRrrecv2.retOp.send(jrvm.getTimestamp(), JRe);
                                                JRrrecv2.retOp = null;
                                            }
                                        }
                                        else if ((JRrrecv2.retOp != null) && (JRrrecv2.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                        {
                                            // for cocall exception handling in operation invocation
                                            if (JRrrecv2.handler != null)
                                                JRrrecv2.handler.JRhandler(JRe);
                                                else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
JRrrecv2.fretOp.send(jrvm.getTimestamp(), JRrrecv2.handler, (java.lang.Object []) null);
                                            JRrrecv2.fretOp = null;
                                        }
                                        else if ((JRrrecv2.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                        {
                                            // this should only be a send
                                            JRrrecv2.handler.JRhandler(JRe);
                                        }
    else {
                                                // catch all
                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                            }
                                    }
                                }
                                { if (JRrrecv2.retOp != null)
                                    JRrrecv2.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                            }
                            else
                                JRInstmt2.releaseIter();
                            // End of servicing
                            // End InniArm
                            break;
                        }
                        
                    }
                }
                if (!JRInstmt2.serviced)
                {
                    JRInstmt2.unlock();
                    JRInstmt2.serviced = true;
                    {
                        // Begin Expr2
                        asserts(false, "The closing signal was not sent!");
                    }
                }
            } while (!JRInstmt2.serviced);
        }
        // End Inni
        
        // Begin Expr2
        (new Cap_ext_(d.JRget_op_leave_PersonTovoid(), "void")).call(jrvm.getTimestamp(), new java.lang.Object [] {landlord});
        // Begin Expr2
        asserts(d.entrants.isEmpty(), "Everyone should\'ve leaved");
    }
    
    public static void asserts(boolean b, String s) {
        if (!b) {
            // Begin Expr2
            System.out.println("DoorAssert failed: " + s);
            // Begin Expr2
            System.exit(1);
        }
    }
    protected boolean JRcalled = false;
    protected JRDoor jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_doorProcess_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_impldoorProcess(this));
    	op_leave_PersonTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_lock_Cap_voidTovoidTojavadotutildotArrayList = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_add_PersonToboolean = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRDoor(op_doorProcess_voidTovoid, op_leave_PersonTovoid, op_lock_Cap_voidTovoidTojavadotutildotArrayList, op_add_PersonToboolean);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    	try {
    		op_doorProcess_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	} catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    }
}
