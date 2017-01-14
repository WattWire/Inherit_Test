package net.wattwire.dataModel;

/**
 * Created by dave on 1/13/17.
 */
public class Female extends Human {

    private float pussy_wetness;

    public Female (String fname, String gender, float pussy_wetness) {

        super(fname, gender);

    }

    public String speak() {
        return "My labia are stretched!";
    }

}
