package seven.impl;



import org.coos.messaging.util.Log;
import org.coos.messaging.util.LogFactory;

import org.coos.actorframe.ActorCS;
import org.coos.javaframe.ActorAddress;
import org.coos.javaframe.State;
import org.coos.javaframe.StateMachine;
import org.coos.javaframe.messages.AFPropertyMsg;
import org.coos.javaframe.messages.ActorMsg;
import seven.api.*;

public class sevenCS extends ActorCS {

    private static final Log logger = LogFactory.getLog(sevenCS.class);
    private ActorAddress ac;

    public sevenCS(String s) {
        super(s);
    }

    public void execTrans(ActorMsg sig, State st, StateMachine curfsm) {

        super.execTrans(sig, st, curfsm);
        sevenSM sm = (sevenSM) curfsm;

        if (st == idle) {
            if (sig.equals(sevenMessageFactory.EXAMPLE_METHOD)) {
                logger.info("sevenSM: received message");
                sameState();
                return;
            }
        } 
    }
}

