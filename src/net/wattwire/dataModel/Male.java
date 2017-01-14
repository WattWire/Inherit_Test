package net.wattwire.dataModel;

/**
 * Created by dave on 1/12/17.
 */
public class Male extends Human {

    private float grip_strength;

    public Male(String mname, String gender, float grip_strength) {

        super(mname, gender);
    }

    public String speak() {
        return "My balls itch!";
    }

}
