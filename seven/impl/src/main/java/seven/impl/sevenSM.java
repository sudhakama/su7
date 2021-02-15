package seven.impl;

import org.coos.actorframe.ActorSM;

public class sevenSM extends ActorSM {

    public sevenSM() {
        setBehaviorClass(new sevenCS("seven"));
    }

    protected void initInstance() {
    	super.initInstance();
    	setVisible(true);
    }
}

