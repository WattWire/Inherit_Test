package net.wattwire;

import net.wattwire.dataModel.Human;

/**
 * Created by dave on 1/13/17.
 */
public class TalkAsHuman {
    private Human h;

    public static String talkashuman(Human h) {

        return "Speaking in TalkingAsHuman: "+h.speak();
    }

}
