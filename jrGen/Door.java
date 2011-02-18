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
        InStatObj JRInstmt3 = new InStatObj(3, false);
        JRLoop11: while (true) {
            {
                // Inni Statement without quantifier
                JRInstmt3.armArray[0] = new QuantRec(new Cap_ext_(op_lock_Cap_voidTovoidTojavadotutildotArrayList, "java.util.ArrayList<Person>"), 0, 0);
                JRInstmt3.armArray[1] = new QuantRec(new Cap_ext_(op_add_PersonToboolean, "boolean"), 1, 1);
                JRInstmt3.armArray[2] = new QuantRec(new Cap_ext_(op_leave_PersonTovoid, "void"), 2, 2);
                JRInstmt3.lock();
                // Equivalence Class has been created and locked
                JRInstmt3.serviced = false;
                _label_JRInstmt3: do
                {
                    Invocation JRfinalInvoc3 = null;
                    // find THE invocation and service it
                    JRInstmt3.gatherAndSortTimes();
                    for (JRInstmt3.i = 0;
                        (JRInstmt3.i < JRInstmt3.N) && !JRInstmt3.serviced;
                         JRInstmt3.i++)
                    {
                        JRInstmt3.byStrt = true;
                        JRInstmt3.releaseIter();
                        // if the op is empty
                        if (JRInstmt3.timesArray[JRInstmt3.i].time < 0) continue;
                        switch (JRInstmt3.timesArray[JRInstmt3.i].opNum)
                        {
                            case 0:
                            {
                                JRInstmt3.j = 0;
                                // Inni Arm
                                QuantRec JRquantRec3 = (QuantRec)JRInstmt3.armArray[JRInstmt3.timesArray[JRInstmt3.i].armArrayIndex];
                                Recv_ext JRrrecv3 = null, JRtmprecv3;
                                // not artificial
                                // NUMBER 3
                                Cap_ext_ returnOkCap = null;
                                for (JRInstmt3.iter = JRInstmt3.armArray[JRInstmt3.timesArray[JRInstmt3.i].armArrayIndex].theCap.elements();
                                     JRInstmt3.iter.hasNext();)
                                {
                                    JRtmprecv3 = (Recv_ext)JRInstmt3.iter.next();
                                    JRInstmt3.JRinit.setInvoc(JRInstmt3.j++);
                                    JRtmprecv3.setInvocation(JRInstmt3.JRinit);
                                    // extract values
                                    returnOkCap = (// not artificial
                                    // NUMBER 3
                                    Cap_ext_)JRtmprecv3.JRargs[0];
                                    JRrrecv3 = JRtmprecv3;
                                    break;  // get first one
                                }
                                // Start of servicing
                                if (JRrrecv3 != null)
                                {
                                    JRInstmt3.j = (int)JRrrecv3.getInvoc();
                                    JRInstmt3.serviced = true;
                                    JRInstmt3.iter.remove(JRInstmt3.j);
                                    JRInstmt3.releaseIter();
                                    JRInstmt3.unlock();
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
                                                        { if (JRrrecv3.retOp != null)
                                                            JRrrecv3.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(new ArrayList(entrants))});
                                                        else {
                                                            java.util.ArrayList JRevaltmp = new ArrayList(entrants);
                                                            
                                                        }
                                                        break _label_JRInstmt3; }}
                                                
                                                // End Return

                                            }
                                        } catch (Exception JRe) {
                                            if (JRrrecv3.retOp != null && JRrrecv3.fretOp == null)
                                            {
                                                // forward of cocall
                                                if ((JRrrecv3.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    JRrrecv3.handler.JRhandler(JRe);
                                                else {
                                                    // give preference to propagation through the call stack
                                                    JRrrecv3.retOp.send(jrvm.getTimestamp(), JRe);
                                                    JRrrecv3.retOp = null;
                                                }
                                            }
                                            else if ((JRrrecv3.retOp != null) && (JRrrecv3.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // for cocall exception handling in operation invocation
                                                if (JRrrecv3.handler != null)
                                                    JRrrecv3.handler.JRhandler(JRe);
                                                    else {
                                                        // catch all
                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                    }
JRrrecv3.fretOp.send(jrvm.getTimestamp(), JRrrecv3.handler, (java.lang.Object []) null);
                                                JRrrecv3.fretOp = null;
                                            }
                                            else if ((JRrrecv3.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // this should only be a send
                                                JRrrecv3.handler.JRhandler(JRe);
                                            }
    else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
                                        }
                                    }
                                    
                                }
                                else
                                    JRInstmt3.releaseIter();
                                // End of servicing
                                // End InniArm
                                break;
                            }
                            case 1:
                            {
                                JRInstmt3.j = 0;
                                // Inni Arm
                                QuantRec JRquantRec3 = (QuantRec)JRInstmt3.armArray[JRInstmt3.timesArray[JRInstmt3.i].armArrayIndex];
                                Recv_ext JRrrecv3 = null, JRtmprecv3;
                                // not artificial
                                Person p = null;
                                for (JRInstmt3.iter = JRInstmt3.armArray[JRInstmt3.timesArray[JRInstmt3.i].armArrayIndex].theCap.elements();
                                     JRInstmt3.iter.hasNext();)
                                {
                                    JRtmprecv3 = (Recv_ext)JRInstmt3.iter.next();
                                    JRInstmt3.JRinit.setInvoc(JRInstmt3.j++);
                                    JRtmprecv3.setInvocation(JRInstmt3.JRinit);
                                    // extract values
                                    p = (// not artificial
                                    Person)JRtmprecv3.JRargs[0];
                                    JRrrecv3 = JRtmprecv3;
                                    break;  // get first one
                                }
                                // Start of servicing
                                if (JRrrecv3 != null)
                                {
                                    JRInstmt3.j = (int)JRrrecv3.getInvoc();
                                    JRInstmt3.serviced = true;
                                    JRInstmt3.iter.remove(JRInstmt3.j);
                                    JRInstmt3.releaseIter();
                                    JRInstmt3.unlock();
                                    {
                                        try {
                                            {
                                                // Begin Expr2
                                                asserts(!entrants.contains(p), "Person " + p + " has already entered door");
                                                if (isLocked) {
                                                    // Return
                                                    {
                                                        if (true)
                                                            { if (JRrrecv3.retOp != null)
                                                                JRrrecv3.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(boolean)(false)});
                                                            else {
                                                                boolean JRevaltmp = false;
                                                                
                                                            }
                                                            break _label_JRInstmt3; }}
                                                    
                                                    // End Return

                                                }
                                                // Begin Expr2
                                                addPersonToList(p);
                                                // Return
                                                {
                                                    if (true)
                                                        { if (JRrrecv3.retOp != null)
                                                            JRrrecv3.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(boolean)(true)});
                                                        else {
                                                            boolean JRevaltmp = true;
                                                            
                                                        }
                                                        break _label_JRInstmt3; }}
                                                
                                                // End Return

                                            }
                                        } catch (Exception JRe) {
                                            if (JRrrecv3.retOp != null && JRrrecv3.fretOp == null)
                                            {
                                                // forward of cocall
                                                if ((JRrrecv3.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    JRrrecv3.handler.JRhandler(JRe);
                                                else {
                                                    // give preference to propagation through the call stack
                                                    JRrrecv3.retOp.send(jrvm.getTimestamp(), JRe);
                                                    JRrrecv3.retOp = null;
                                                }
                                            }
                                            else if ((JRrrecv3.retOp != null) && (JRrrecv3.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // for cocall exception handling in operation invocation
                                                if (JRrrecv3.handler != null)
                                                    JRrrecv3.handler.JRhandler(JRe);
                                                    else {
                                                        // catch all
                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                    }
JRrrecv3.fretOp.send(jrvm.getTimestamp(), JRrrecv3.handler, (java.lang.Object []) null);
                                                JRrrecv3.fretOp = null;
                                            }
                                            else if ((JRrrecv3.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // this should only be a send
                                                JRrrecv3.handler.JRhandler(JRe);
                                            }
    else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
                                        }
                                    }
                                    
                                }
                                else
                                    JRInstmt3.releaseIter();
                                // End of servicing
                                // End InniArm
                                break;
                            }
                            case 2:
                            {
                                JRInstmt3.j = 0;
                                // Inni Arm
                                QuantRec JRquantRec3 = (QuantRec)JRInstmt3.armArray[JRInstmt3.timesArray[JRInstmt3.i].armArrayIndex];
                                Recv_ext JRrrecv3 = null, JRtmprecv3;
                                // not artificial
                                Person p = null;
                                for (JRInstmt3.iter = JRInstmt3.armArray[JRInstmt3.timesArray[JRInstmt3.i].armArrayIndex].theCap.elements();
                                     JRInstmt3.iter.hasNext();)
                                {
                                    JRtmprecv3 = (Recv_ext)JRInstmt3.iter.next();
                                    JRInstmt3.JRinit.setInvoc(JRInstmt3.j++);
                                    JRtmprecv3.setInvocation(JRInstmt3.JRinit);
                                    // extract values
                                    p = (// not artificial
                                    Person)JRtmprecv3.JRargs[0];
                                    JRrrecv3 = JRtmprecv3;
                                    break;  // get first one
                                }
                                // Start of servicing
                                if (JRrrecv3 != null)
                                {
                                    JRInstmt3.j = (int)JRrrecv3.getInvoc();
                                    JRInstmt3.serviced = true;
                                    JRInstmt3.iter.remove(JRInstmt3.j);
                                    JRInstmt3.releaseIter();
                                    JRInstmt3.unlock();
                                    {
                                        try {
                                            {
                                                // Begin Expr2
                                                removePersonFromList(p);
                                                if (isLocked && entrants.size() == 1) {
                                                    returnOkCap.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
                                                }
                                                if (isLocked && entrants.size() == 0) {
                                                    { if (JRrrecv3.retOp != null)
                                                        JRrrecv3.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
                                                    break JRLoop11;}
                                                }
                                            }
                                        } catch (Exception JRe) {
                                            if (JRrrecv3.retOp != null && JRrrecv3.fretOp == null)
                                            {
                                                // forward of cocall
                                                if ((JRrrecv3.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    JRrrecv3.handler.JRhandler(JRe);
                                                else {
                                                    // give preference to propagation through the call stack
                                                    JRrrecv3.retOp.send(jrvm.getTimestamp(), JRe);
                                                    JRrrecv3.retOp = null;
                                                }
                                            }
                                            else if ((JRrrecv3.retOp != null) && (JRrrecv3.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // for cocall exception handling in operation invocation
                                                if (JRrrecv3.handler != null)
                                                    JRrrecv3.handler.JRhandler(JRe);
                                                    else {
                                                        // catch all
                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                    }
JRrrecv3.fretOp.send(jrvm.getTimestamp(), JRrrecv3.handler, (java.lang.Object []) null);
                                                JRrrecv3.fretOp = null;
                                            }
                                            else if ((JRrrecv3.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // this should only be a send
                                                JRrrecv3.handler.JRhandler(JRe);
                                            }
    else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
                                        }
                                    }
                                    { if (JRrrecv3.retOp != null)
                                        JRrrecv3.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                }
                                else
                                    JRInstmt3.releaseIter();
                                // End of servicing
                                // End InniArm
                                break;
                            }
                            
                        }
                    }
                    if (!JRInstmt3.serviced)
                    {
                        // must block and loop
                        JRInstmt3.waitOnLock();
                    }
                } while (!JRInstmt3.serviced);
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
        TestPerson p = new TestPerson();
        // Begin Expr2
        JR.nap(100);
        // Begin Expr2
        asserts(d.entrants.get(0) == p, "Person p should be in list");
        // Begin Expr2
        asserts(d.entrants.size() == 1, "Should only be 1 person in list");
        // Begin Expr2
        p.setGoHome();
        // Begin Expr2
        JR.nap(100);
    }
    
    public static void testOnePersonLeaving() {
        Door d = new Door();
        TestPerson p = new TestPerson();
        // Begin Expr2
        JR.nap(100);
        // Begin Expr2
        p.setGoHome();
        // Begin Expr2
        JR.nap(100);
        // Begin Expr2
        asserts(d.entrants.size() == 0, "Everyone should have exited.");
    }
    
    public static void testDoor() {
        InStatObj JRInstmt5 = new InStatObj(1, false);
        InStatObj JRInstmt4 = new InStatObj(1, false);
        Door d = new Door();
        TestPerson p1 = new TestPerson();
        // Begin Expr2
        JR.nap(100);
        // Begin Expr2
        asserts(d.entrants.size() == 1, "Should only be 1 person in list");
        TestPerson p2 = new TestPerson();
        // Begin Expr2
        JR.nap(100);
        // Begin Expr2
        asserts(d.entrants.size() == 2, "Two should \'ve entered");
        // Begin Expr2
        asserts(d.entrants.contains(p1), "p1 should be in list");
        // Begin Expr2
        asserts(d.entrants.contains(p2), "p2 should be in list");
        TestPerson landlord = new TestPerson();
        // Begin Expr2
        JR.nap(100);
        Op_ext.JRProxyOp op_returnCap_voidTovoid = null;
        try{
            op_returnCap_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError("Cannot initialize op"); }
        
        
        ArrayList list = ((java.util.ArrayList) (new Cap_ext_(d.JRget_op_lock_Cap_voidTovoidTojavadotutildotArrayList(), "java.util.ArrayList")).call(jrvm.getTimestamp(), new java.lang.Object [] {new Cap_ext_(op_returnCap_voidTovoid)}));
        // Begin Expr2
        asserts(list != d.entrants, "Should not be reference to entrants!");
        // Begin Expr2
        asserts(list.equals(d.entrants), "Should however be equal to entrants!");
        TestPerson p3 = new TestPerson();
        // Begin Expr2
        JR.nap(100);
        // Begin Expr2
        asserts(d.entrants.size() == 3, "Nobody should\'ve entered yet since it was locked (2persons + landlord is in)");
        // Begin Expr2
        p1.setGoHome();
        // Begin Expr2
        JR.nap(100);
        // Begin Expr2
        asserts(d.entrants.size() == 2, "only 1 + landlord should be left");
        // Begin Expr2
        asserts(d.entrants.contains(p2), "p2 should be left");
        // Begin Expr2
        JR.nap(100);
        {
            // Inni Statement without quantifier
            JRInstmt4.armArray[0] = new QuantRec(new Cap_ext_(op_returnCap_voidTovoid, "void"), 0, 0);
            JRInstmt4.lock();
            // Equivalence Class has been created and locked
            JRInstmt4.serviced = false;
            _label_JRInstmt4: do
            {
                Invocation JRfinalInvoc4 = null;
                // find THE invocation and service it
                JRInstmt4.gatherAndSortTimes();
                for (JRInstmt4.i = 0;
                    (JRInstmt4.i < JRInstmt4.N) && !JRInstmt4.serviced;
                     JRInstmt4.i++)
                {
                    JRInstmt4.byStrt = true;
                    JRInstmt4.releaseIter();
                    // if the op is empty
                    if (JRInstmt4.timesArray[JRInstmt4.i].time < 0) continue;
                    switch (JRInstmt4.timesArray[JRInstmt4.i].opNum)
                    {
                        case 0:
                        {
                            JRInstmt4.j = 0;
                            // Inni Arm
                            QuantRec JRquantRec4 = (QuantRec)JRInstmt4.armArray[JRInstmt4.timesArray[JRInstmt4.i].armArrayIndex];
                            Recv_ext JRrrecv4 = null, JRtmprecv4;
                            for (JRInstmt4.iter = JRInstmt4.armArray[JRInstmt4.timesArray[JRInstmt4.i].armArrayIndex].theCap.elements();
                                 JRInstmt4.iter.hasNext();)
                            {
                                JRtmprecv4 = (Recv_ext)JRInstmt4.iter.next();
                                JRInstmt4.JRinit.setInvoc(JRInstmt4.j++);
                                JRtmprecv4.setInvocation(JRInstmt4.JRinit);
                                // extract values
                                JRrrecv4 = JRtmprecv4;
                                break;  // get first one
                            }
                            // Start of servicing
                            if (JRrrecv4 != null)
                            {
                                JRInstmt4.j = (int)JRrrecv4.getInvoc();
                                JRInstmt4.serviced = true;
                                JRInstmt4.iter.remove(JRInstmt4.j);
                                JRInstmt4.releaseIter();
                                JRInstmt4.unlock();
                                {
                                    try {
                                        {
                                            // Begin Expr2
                                            asserts(false, "The closing signal is sent too early!");
                                        }
                                    } catch (Exception JRe) {
                                        if (JRrrecv4.retOp != null && JRrrecv4.fretOp == null)
                                        {
                                            // forward of cocall
                                            if ((JRrrecv4.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                JRrrecv4.handler.JRhandler(JRe);
                                            else {
                                                // give preference to propagation through the call stack
                                                JRrrecv4.retOp.send(jrvm.getTimestamp(), JRe);
                                                JRrrecv4.retOp = null;
                                            }
                                        }
                                        else if ((JRrrecv4.retOp != null) && (JRrrecv4.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                        {
                                            // for cocall exception handling in operation invocation
                                            if (JRrrecv4.handler != null)
                                                JRrrecv4.handler.JRhandler(JRe);
                                                else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
JRrrecv4.fretOp.send(jrvm.getTimestamp(), JRrrecv4.handler, (java.lang.Object []) null);
                                            JRrrecv4.fretOp = null;
                                        }
                                        else if ((JRrrecv4.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                        {
                                            // this should only be a send
                                            JRrrecv4.handler.JRhandler(JRe);
                                        }
    else {
                                                // catch all
                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                            }
                                    }
                                }
                                { if (JRrrecv4.retOp != null)
                                    JRrrecv4.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                            }
                            else
                                JRInstmt4.releaseIter();
                            // End of servicing
                            // End InniArm
                            break;
                        }
                        
                    }
                }
                if (!JRInstmt4.serviced)
                {
                    JRInstmt4.unlock();
                    JRInstmt4.serviced = true;
                    {
                    }
                }
            } while (!JRInstmt4.serviced);
        }
        // End Inni
        
        // Begin Expr2
        p2.setGoHome();
        // Begin Expr2
        JR.nap(100);
        // Begin Expr2
        asserts(d.entrants.size() == 1, "Only landlord should be in!");
        // Begin Expr2
        asserts(d.entrants.contains(landlord), "Only landlord should be in");
        // Begin Expr2
        JR.nap(100);
        {
            // Inni Statement without quantifier
            JRInstmt5.armArray[0] = new QuantRec(new Cap_ext_(op_returnCap_voidTovoid, "void"), 0, 0);
            JRInstmt5.lock();
            // Equivalence Class has been created and locked
            JRInstmt5.serviced = false;
            _label_JRInstmt5: do
            {
                Invocation JRfinalInvoc5 = null;
                // find THE invocation and service it
                JRInstmt5.gatherAndSortTimes();
                for (JRInstmt5.i = 0;
                    (JRInstmt5.i < JRInstmt5.N) && !JRInstmt5.serviced;
                     JRInstmt5.i++)
                {
                    JRInstmt5.byStrt = true;
                    JRInstmt5.releaseIter();
                    // if the op is empty
                    if (JRInstmt5.timesArray[JRInstmt5.i].time < 0) continue;
                    switch (JRInstmt5.timesArray[JRInstmt5.i].opNum)
                    {
                        case 0:
                        {
                            JRInstmt5.j = 0;
                            // Inni Arm
                            QuantRec JRquantRec5 = (QuantRec)JRInstmt5.armArray[JRInstmt5.timesArray[JRInstmt5.i].armArrayIndex];
                            Recv_ext JRrrecv5 = null, JRtmprecv5;
                            for (JRInstmt5.iter = JRInstmt5.armArray[JRInstmt5.timesArray[JRInstmt5.i].armArrayIndex].theCap.elements();
                                 JRInstmt5.iter.hasNext();)
                            {
                                JRtmprecv5 = (Recv_ext)JRInstmt5.iter.next();
                                JRInstmt5.JRinit.setInvoc(JRInstmt5.j++);
                                JRtmprecv5.setInvocation(JRInstmt5.JRinit);
                                // extract values
                                JRrrecv5 = JRtmprecv5;
                                break;  // get first one
                            }
                            // Start of servicing
                            if (JRrrecv5 != null)
                            {
                                JRInstmt5.j = (int)JRrrecv5.getInvoc();
                                JRInstmt5.serviced = true;
                                JRInstmt5.iter.remove(JRInstmt5.j);
                                JRInstmt5.releaseIter();
                                JRInstmt5.unlock();
                                {
                                    try {
                                        {
                                        }
                                    } catch (Exception JRe) {
                                        if (JRrrecv5.retOp != null && JRrrecv5.fretOp == null)
                                        {
                                            // forward of cocall
                                            if ((JRrrecv5.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                JRrrecv5.handler.JRhandler(JRe);
                                            else {
                                                // give preference to propagation through the call stack
                                                JRrrecv5.retOp.send(jrvm.getTimestamp(), JRe);
                                                JRrrecv5.retOp = null;
                                            }
                                        }
                                        else if ((JRrrecv5.retOp != null) && (JRrrecv5.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                        {
                                            // for cocall exception handling in operation invocation
                                            if (JRrrecv5.handler != null)
                                                JRrrecv5.handler.JRhandler(JRe);
                                                else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
JRrrecv5.fretOp.send(jrvm.getTimestamp(), JRrrecv5.handler, (java.lang.Object []) null);
                                            JRrrecv5.fretOp = null;
                                        }
                                        else if ((JRrrecv5.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                        {
                                            // this should only be a send
                                            JRrrecv5.handler.JRhandler(JRe);
                                        }
    else {
                                                // catch all
                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                            }
                                    }
                                }
                                { if (JRrrecv5.retOp != null)
                                    JRrrecv5.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                            }
                            else
                                JRInstmt5.releaseIter();
                            // End of servicing
                            // End InniArm
                            break;
                        }
                        
                    }
                }
                if (!JRInstmt5.serviced)
                {
                    JRInstmt5.unlock();
                    JRInstmt5.serviced = true;
                    {
                        // Begin Expr2
                        asserts(false, "The closing signal was not sent!");
                    }
                }
            } while (!JRInstmt5.serviced);
        }
        // End Inni
        
        // Begin Expr2
        landlord.setGoHome();
        // Begin Expr2
        JR.nap(100);
        // Begin Expr2
        asserts(d.entrants.isEmpty(), "Everyone should\'ve leaved");
        // Begin Expr2
        JR.nap(100);
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
