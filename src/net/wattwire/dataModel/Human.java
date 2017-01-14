package net.wattwire.dataModel;

/**
 * Created by dave on 1/12/17.
 */
public class Human {

    private String hname;
    private String gender;

    public Human(String hname, String gender) {

        System.out.println("\n*** Constructing human with first name "+hname);

        this.hname = hname;
        this.gender = gender;

    }

    //=========================================
    public String getEyecolor() {
        return hname;}

    public void setHname(String fanme) {
        this.hname = hname;}
    //-------
    public String getGender() {
        return gender;}

    public void setGender(String gender) {
        this.gender = gender;
    }
    //=========================================

    public String speak() {
        return "Confused generic human here.";
    }




}