package net.wattwire;

import net.wattwire.dataModel.Female;
import net.wattwire.dataModel.Human;
import net.wattwire.dataModel.Male;

public class Inherit_Main {

    public static void main(String[] args) {
	// *** Blow me!

        Human h,h1,h2;

        h = new Human("Pat", "ambiguous");
        System.out.println("Human h is "+h.getGender()+" and says \"" + h.speak() + "\"");

        Male m = new Male("Mike", "male", 3.9f);
        Female f = new Female("Barbie","female",9.0f);

        h1 = m;
        h2 = (Human)f;

        System.out.println("Human h1 is "+h1.getGender()+" and says \"" + h1.speak() + "\"");
        System.out.println("Human h2 is "+h2.getGender()+" and says \"" + h2.speak() + "\"");

    }
}
