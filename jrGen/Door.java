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
    
    public Op_ext.JRProxyOp JRget_op_isClosed_voidToboolean()
    {
        return op_isClosed_voidToboolean;
    }
    
    public Op_ext.JRProxyOp op_isClosed_voidToboolean;
    
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
        InStatObj JRInstmt6 = new InStatObj(4, false);
        JRLoop14: while (true) {
            {
                // Inni Statement without quantifier
                JRInstmt6.armArray[0] = new QuantRec(new Cap_ext_(op_lock_Cap_voidTovoidTojavadotutildotArrayList, "java.util.ArrayList<Person>"), 0, 0);
                JRInstmt6.armArray[1] = new QuantRec(new Cap_ext_(op_add_PersonToboolean, "boolean"), 1, 1);
                JRInstmt6.armArray[2] = new QuantRec(new Cap_ext_(op_leave_PersonTovoid, "void"), 2, 2);
                JRInstmt6.armArray[3] = new QuantRec(new Cap_ext_(op_isClosed_voidToboolean, "boolean"), 3, 3);
                JRInstmt6.lock();
                // Equivalence Class has been created and locked
                JRInstmt6.serviced = false;
                _label_JRInstmt6: do
                {
                    Invocation JRfinalInvoc6 = null;
                    // find THE invocation and service it
                    JRInstmt6.gatherAndSortTimes();
                    for (JRInstmt6.i = 0;
                        (JRInstmt6.i < JRInstmt6.N) && !JRInstmt6.serviced;
                         JRInstmt6.i++)
                    {
                        JRInstmt6.byStrt = true;
                        JRInstmt6.releaseIter();
                        // if the op is empty
                        if (JRInstmt6.timesArray[JRInstmt6.i].time < 0) continue;
                        switch (JRInstmt6.timesArray[JRInstmt6.i].opNum)
                        {
                            case 0:
                            {
                                JRInstmt6.j = 0;
                                // Inni Arm
                                QuantRec JRquantRec6 = (QuantRec)JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex];
                                Recv_ext JRrrecv6 = null, JRtmprecv6;
                                // not artificial
                                // NUMBER 3
                                Cap_ext_ returnOkCap = null;
                                for (JRInstmt6.iter = JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex].theCap.elements();
                                     JRInstmt6.iter.hasNext();)
                                {
                                    JRtmprecv6 = (Recv_ext)JRInstmt6.iter.next();
                                    JRInstmt6.JRinit.setInvoc(JRInstmt6.j++);
                                    JRtmprecv6.setInvocation(JRInstmt6.JRinit);
                                    // extract values
                                    returnOkCap = (// not artificial
                                    // NUMBER 3
                                    Cap_ext_)JRtmprecv6.JRargs[0];
                                    JRrrecv6 = JRtmprecv6;
                                    break;  // get first one
                                }
                                // Start of servicing
                                if (JRrrecv6 != null)
                                {
                                    JRInstmt6.j = (int)JRrrecv6.getInvoc();
                                    JRInstmt6.serviced = true;
                                    JRInstmt6.iter.remove(JRInstmt6.j);
                                    JRInstmt6.releaseIter();
                                    JRInstmt6.unlock();
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
                                                        { if (JRrrecv6.retOp != null)
                                                            JRrrecv6.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(new ArrayList(entrants))});
                                                        else {
                                                            java.util.ArrayList JRevaltmp = new ArrayList(entrants);
                                                            
                                                        }
                                                        break _label_JRInstmt6; }}
                                                
                                                // End Return

                                            }
                                        } catch (Exception JRe) {
                                            if (JRrrecv6.retOp != null && JRrrecv6.fretOp == null)
                                            {
                                                // forward of cocall
                                                if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                else {
                                                    // give preference to propagation through the call stack
                                                    JRrrecv6.retOp.send(jrvm.getTimestamp(), JRe);
                                                    JRrrecv6.retOp = null;
                                                }
                                            }
                                            else if ((JRrrecv6.retOp != null) && (JRrrecv6.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // for cocall exception handling in operation invocation
                                                if (JRrrecv6.handler != null)
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                    else {
                                                        // catch all
                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                    }
JRrrecv6.fretOp.send(jrvm.getTimestamp(), JRrrecv6.handler, (java.lang.Object []) null);
                                                JRrrecv6.fretOp = null;
                                            }
                                            else if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // this should only be a send
                                                JRrrecv6.handler.JRhandler(JRe);
                                            }
    else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
                                        }
                                    }
                                    
                                }
                                else
                                    JRInstmt6.releaseIter();
                                // End of servicing
                                // End InniArm
                                break;
                            }
                            case 1:
                            {
                                JRInstmt6.j = 0;
                                // Inni Arm
                                QuantRec JRquantRec6 = (QuantRec)JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex];
                                Recv_ext JRrrecv6 = null, JRtmprecv6;
                                // not artificial
                                Person p = null;
                                for (JRInstmt6.iter = JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex].theCap.elements();
                                     JRInstmt6.iter.hasNext();)
                                {
                                    JRtmprecv6 = (Recv_ext)JRInstmt6.iter.next();
                                    JRInstmt6.JRinit.setInvoc(JRInstmt6.j++);
                                    JRtmprecv6.setInvocation(JRInstmt6.JRinit);
                                    // extract values
                                    p = (// not artificial
                                    Person)JRtmprecv6.JRargs[0];
                                    JRrrecv6 = JRtmprecv6;
                                    break;  // get first one
                                }
                                // Start of servicing
                                if (JRrrecv6 != null)
                                {
                                    JRInstmt6.j = (int)JRrrecv6.getInvoc();
                                    JRInstmt6.serviced = true;
                                    JRInstmt6.iter.remove(JRInstmt6.j);
                                    JRInstmt6.releaseIter();
                                    JRInstmt6.unlock();
                                    {
                                        try {
                                            {
                                                // Begin Expr2
                                                asserts(!entrants.contains(p), "Person " + p + " has already entered door");
                                                if (isLocked) {
                                                    // Return
                                                    {
                                                        if (true)
                                                            { if (JRrrecv6.retOp != null)
                                                                JRrrecv6.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(boolean)(false)});
                                                            else {
                                                                boolean JRevaltmp = false;
                                                                
                                                            }
                                                            break _label_JRInstmt6; }}
                                                    
                                                    // End Return

                                                }
                                                // Begin Expr2
                                                addPersonToList(p);
                                                // Return
                                                {
                                                    if (true)
                                                        { if (JRrrecv6.retOp != null)
                                                            JRrrecv6.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(boolean)(true)});
                                                        else {
                                                            boolean JRevaltmp = true;
                                                            
                                                        }
                                                        break _label_JRInstmt6; }}
                                                
                                                // End Return

                                            }
                                        } catch (Exception JRe) {
                                            if (JRrrecv6.retOp != null && JRrrecv6.fretOp == null)
                                            {
                                                // forward of cocall
                                                if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                else {
                                                    // give preference to propagation through the call stack
                                                    JRrrecv6.retOp.send(jrvm.getTimestamp(), JRe);
                                                    JRrrecv6.retOp = null;
                                                }
                                            }
                                            else if ((JRrrecv6.retOp != null) && (JRrrecv6.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // for cocall exception handling in operation invocation
                                                if (JRrrecv6.handler != null)
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                    else {
                                                        // catch all
                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                    }
JRrrecv6.fretOp.send(jrvm.getTimestamp(), JRrrecv6.handler, (java.lang.Object []) null);
                                                JRrrecv6.fretOp = null;
                                            }
                                            else if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // this should only be a send
                                                JRrrecv6.handler.JRhandler(JRe);
                                            }
    else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
                                        }
                                    }
                                    
                                }
                                else
                                    JRInstmt6.releaseIter();
                                // End of servicing
                                // End InniArm
                                break;
                            }
                            case 2:
                            {
                                JRInstmt6.j = 0;
                                // Inni Arm
                                QuantRec JRquantRec6 = (QuantRec)JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex];
                                Recv_ext JRrrecv6 = null, JRtmprecv6;
                                // not artificial
                                Person p = null;
                                for (JRInstmt6.iter = JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex].theCap.elements();
                                     JRInstmt6.iter.hasNext();)
                                {
                                    JRtmprecv6 = (Recv_ext)JRInstmt6.iter.next();
                                    JRInstmt6.JRinit.setInvoc(JRInstmt6.j++);
                                    JRtmprecv6.setInvocation(JRInstmt6.JRinit);
                                    // extract values
                                    p = (// not artificial
                                    Person)JRtmprecv6.JRargs[0];
                                    JRrrecv6 = JRtmprecv6;
                                    break;  // get first one
                                }
                                // Start of servicing
                                if (JRrrecv6 != null)
                                {
                                    JRInstmt6.j = (int)JRrrecv6.getInvoc();
                                    JRInstmt6.serviced = true;
                                    JRInstmt6.iter.remove(JRInstmt6.j);
                                    JRInstmt6.releaseIter();
                                    JRInstmt6.unlock();
                                    {
                                        try {
                                            {
                                                // Begin Expr2
                                                removePersonFromList(p);
                                                if (isLocked && entrants.size() <= 2) {
                                                    returnOkCap.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
                                                }
                                                if (isLocked && entrants.size() == 0) {
                                                    { if (JRrrecv6.retOp != null)
                                                        JRrrecv6.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
                                                    break JRLoop14;}
                                                }
                                            }
                                        } catch (Exception JRe) {
                                            if (JRrrecv6.retOp != null && JRrrecv6.fretOp == null)
                                            {
                                                // forward of cocall
                                                if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                else {
                                                    // give preference to propagation through the call stack
                                                    JRrrecv6.retOp.send(jrvm.getTimestamp(), JRe);
                                                    JRrrecv6.retOp = null;
                                                }
                                            }
                                            else if ((JRrrecv6.retOp != null) && (JRrrecv6.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // for cocall exception handling in operation invocation
                                                if (JRrrecv6.handler != null)
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                    else {
                                                        // catch all
                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                    }
JRrrecv6.fretOp.send(jrvm.getTimestamp(), JRrrecv6.handler, (java.lang.Object []) null);
                                                JRrrecv6.fretOp = null;
                                            }
                                            else if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // this should only be a send
                                                JRrrecv6.handler.JRhandler(JRe);
                                            }
    else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
                                        }
                                    }
                                    { if (JRrrecv6.retOp != null)
                                        JRrrecv6.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                }
                                else
                                    JRInstmt6.releaseIter();
                                // End of servicing
                                // End InniArm
                                break;
                            }
                            case 3:
                            {
                                JRInstmt6.j = 0;
                                // Inni Arm
                                QuantRec JRquantRec6 = (QuantRec)JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex];
                                Recv_ext JRrrecv6 = null, JRtmprecv6;
                                for (JRInstmt6.iter = JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex].theCap.elements();
                                     JRInstmt6.iter.hasNext();)
                                {
                                    JRtmprecv6 = (Recv_ext)JRInstmt6.iter.next();
                                    JRInstmt6.JRinit.setInvoc(JRInstmt6.j++);
                                    JRtmprecv6.setInvocation(JRInstmt6.JRinit);
                                    // extract values
                                    JRrrecv6 = JRtmprecv6;
                                    break;  // get first one
                                }
                                // Start of servicing
                                if (JRrrecv6 != null)
                                {
                                    JRInstmt6.j = (int)JRrrecv6.getInvoc();
                                    JRInstmt6.serviced = true;
                                    JRInstmt6.iter.remove(JRInstmt6.j);
                                    JRInstmt6.releaseIter();
                                    JRInstmt6.unlock();
                                    {
                                        try {
                                            {
                                                // Return
                                                {
                                                    if (true)
                                                        { if (JRrrecv6.retOp != null)
                                                            JRrrecv6.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(boolean)(isLocked)});
                                                        else {
                                                            boolean JRevaltmp = isLocked;
                                                            
                                                        }
                                                        break _label_JRInstmt6; }}
                                                
                                                // End Return

                                            }
                                        } catch (Exception JRe) {
                                            if (JRrrecv6.retOp != null && JRrrecv6.fretOp == null)
                                            {
                                                // forward of cocall
                                                if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                else {
                                                    // give preference to propagation through the call stack
                                                    JRrrecv6.retOp.send(jrvm.getTimestamp(), JRe);
                                                    JRrrecv6.retOp = null;
                                                }
                                            }
                                            else if ((JRrrecv6.retOp != null) && (JRrrecv6.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // for cocall exception handling in operation invocation
                                                if (JRrrecv6.handler != null)
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                    else {
                                                        // catch all
                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                    }
JRrrecv6.fretOp.send(jrvm.getTimestamp(), JRrrecv6.handler, (java.lang.Object []) null);
                                                JRrrecv6.fretOp = null;
                                            }
                                            else if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // this should only be a send
                                                JRrrecv6.handler.JRhandler(JRe);
                                            }
    else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
                                        }
                                    }
                                    
                                }
                                else
                                    JRInstmt6.releaseIter();
                                // End of servicing
                                // End InniArm
                                break;
                            }
                            
                        }
                    }
                    if (!JRInstmt6.serviced)
                    {
                        // must block and loop
                        JRInstmt6.waitOnLock();
                    }
                } while (!JRInstmt6.serviced);
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
        InStatObj JRInstmt8 = new InStatObj(1, false);
        InStatObj JRInstmt7 = new InStatObj(1, false);
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
            JRInstmt7.armArray[0] = new QuantRec(new Cap_ext_(op_returnCap_voidTovoid, "void"), 0, 0);
            JRInstmt7.lock();
            // Equivalence Class has been created and locked
            JRInstmt7.serviced = false;
            _label_JRInstmt7: do
            {
                Invocation JRfinalInvoc7 = null;
                // find THE invocation and service it
                JRInstmt7.gatherAndSortTimes();
                for (JRInstmt7.i = 0;
                    (JRInstmt7.i < JRInstmt7.N) && !JRInstmt7.serviced;
                     JRInstmt7.i++)
                {
                    JRInstmt7.byStrt = true;
                    JRInstmt7.releaseIter();
                    // if the op is empty
                    if (JRInstmt7.timesArray[JRInstmt7.i].time < 0) continue;
                    switch (JRInstmt7.timesArray[JRInstmt7.i].opNum)
                    {
                        case 0:
                        {
                            JRInstmt7.j = 0;
                            // Inni Arm
                            QuantRec JRquantRec7 = (QuantRec)JRInstmt7.armArray[JRInstmt7.timesArray[JRInstmt7.i].armArrayIndex];
                            Recv_ext JRrrecv7 = null, JRtmprecv7;
                            for (JRInstmt7.iter = JRInstmt7.armArray[JRInstmt7.timesArray[JRInstmt7.i].armArrayIndex].theCap.elements();
                                 JRInstmt7.iter.hasNext();)
                            {
                                JRtmprecv7 = (Recv_ext)JRInstmt7.iter.next();
                                JRInstmt7.JRinit.setInvoc(JRInstmt7.j++);
                                JRtmprecv7.setInvocation(JRInstmt7.JRinit);
                                // extract values
                                JRrrecv7 = JRtmprecv7;
                                break;  // get first one
                            }
                            // Start of servicing
                            if (JRrrecv7 != null)
                            {
                                JRInstmt7.j = (int)JRrrecv7.getInvoc();
                                JRInstmt7.serviced = true;
                                JRInstmt7.iter.remove(JRInstmt7.j);
                                JRInstmt7.releaseIter();
                                JRInstmt7.unlock();
                                {
                                    try {
                                        {
                                        }
                                    } catch (Exception JRe) {
                                        if (JRrrecv7.retOp != null && JRrrecv7.fretOp == null)
                                        {
                                            // forward of cocall
                                            if ((JRrrecv7.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                JRrrecv7.handler.JRhandler(JRe);
                                            else {
                                                // give preference to propagation through the call stack
                                                JRrrecv7.retOp.send(jrvm.getTimestamp(), JRe);
                                                JRrrecv7.retOp = null;
                                            }
                                        }
                                        else if ((JRrrecv7.retOp != null) && (JRrrecv7.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                        {
                                            // for cocall exception handling in operation invocation
                                            if (JRrrecv7.handler != null)
                                                JRrrecv7.handler.JRhandler(JRe);
                                                else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
JRrrecv7.fretOp.send(jrvm.getTimestamp(), JRrrecv7.handler, (java.lang.Object []) null);
                                            JRrrecv7.fretOp = null;
                                        }
                                        else if ((JRrrecv7.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                        {
                                            // this should only be a send
                                            JRrrecv7.handler.JRhandler(JRe);
                                        }
    else {
                                                // catch all
                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                            }
                                    }
                                }
                                { if (JRrrecv7.retOp != null)
                                    JRrrecv7.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                            }
                            else
                                JRInstmt7.releaseIter();
                            // End of servicing
                            // End InniArm
                            break;
                        }
                        
                    }
                }
                if (!JRInstmt7.serviced)
                {
                    JRInstmt7.unlock();
                    JRInstmt7.serviced = true;
                    {
                        // Begin Expr2
                        asserts(false, "The closing signal is not sent even though assistant left!");
                    }
                }
            } while (!JRInstmt7.serviced);
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
            JRInstmt8.armArray[0] = new QuantRec(new Cap_ext_(op_returnCap_voidTovoid, "void"), 0, 0);
            JRInstmt8.lock();
            // Equivalence Class has been created and locked
            JRInstmt8.serviced = false;
            _label_JRInstmt8: do
            {
                Invocation JRfinalInvoc8 = null;
                // find THE invocation and service it
                JRInstmt8.gatherAndSortTimes();
                for (JRInstmt8.i = 0;
                    (JRInstmt8.i < JRInstmt8.N) && !JRInstmt8.serviced;
                     JRInstmt8.i++)
                {
                    JRInstmt8.byStrt = true;
                    JRInstmt8.releaseIter();
                    // if the op is empty
                    if (JRInstmt8.timesArray[JRInstmt8.i].time < 0) continue;
                    switch (JRInstmt8.timesArray[JRInstmt8.i].opNum)
                    {
                        case 0:
                        {
                            JRInstmt8.j = 0;
                            // Inni Arm
                            QuantRec JRquantRec8 = (QuantRec)JRInstmt8.armArray[JRInstmt8.timesArray[JRInstmt8.i].armArrayIndex];
                            Recv_ext JRrrecv8 = null, JRtmprecv8;
                            for (JRInstmt8.iter = JRInstmt8.armArray[JRInstmt8.timesArray[JRInstmt8.i].armArrayIndex].theCap.elements();
                                 JRInstmt8.iter.hasNext();)
                            {
                                JRtmprecv8 = (Recv_ext)JRInstmt8.iter.next();
                                JRInstmt8.JRinit.setInvoc(JRInstmt8.j++);
                                JRtmprecv8.setInvocation(JRInstmt8.JRinit);
                                // extract values
                                JRrrecv8 = JRtmprecv8;
                                break;  // get first one
                            }
                            // Start of servicing
                            if (JRrrecv8 != null)
                            {
                                JRInstmt8.j = (int)JRrrecv8.getInvoc();
                                JRInstmt8.serviced = true;
                                JRInstmt8.iter.remove(JRInstmt8.j);
                                JRInstmt8.releaseIter();
                                JRInstmt8.unlock();
                                {
                                    try {
                                        {
                                        }
                                    } catch (Exception JRe) {
                                        if (JRrrecv8.retOp != null && JRrrecv8.fretOp == null)
                                        {
                                            // forward of cocall
                                            if ((JRrrecv8.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                JRrrecv8.handler.JRhandler(JRe);
                                            else {
                                                // give preference to propagation through the call stack
                                                JRrrecv8.retOp.send(jrvm.getTimestamp(), JRe);
                                                JRrrecv8.retOp = null;
                                            }
                                        }
                                        else if ((JRrrecv8.retOp != null) && (JRrrecv8.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                        {
                                            // for cocall exception handling in operation invocation
                                            if (JRrrecv8.handler != null)
                                                JRrrecv8.handler.JRhandler(JRe);
                                                else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
JRrrecv8.fretOp.send(jrvm.getTimestamp(), JRrrecv8.handler, (java.lang.Object []) null);
                                            JRrrecv8.fretOp = null;
                                        }
                                        else if ((JRrrecv8.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                        {
                                            // this should only be a send
                                            JRrrecv8.handler.JRhandler(JRe);
                                        }
    else {
                                                // catch all
                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                            }
                                    }
                                }
                                { if (JRrrecv8.retOp != null)
                                    JRrrecv8.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                            }
                            else
                                JRInstmt8.releaseIter();
                            // End of servicing
                            // End InniArm
                            break;
                        }
                        
                    }
                }
                if (!JRInstmt8.serviced)
                {
                    JRInstmt8.unlock();
                    JRInstmt8.serviced = true;
                    {
                        // Begin Expr2
                        asserts(false, "The closing signal was not sent!");
                    }
                }
            } while (!JRInstmt8.serviced);
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
    	op_isClosed_voidToboolean = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_add_PersonToboolean = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRDoor(op_doorProcess_voidTovoid, op_leave_PersonTovoid, op_lock_Cap_voidTovoidTojavadotutildotArrayList, op_isClosed_voidToboolean, op_add_PersonToboolean);
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
