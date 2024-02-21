package week5_curricullum_activities.class_activity_2A_1.model;

public class Decadevs {
    private String name;

    private  boolean isFemale;

    private boolean isMale;

    public Decadevs(String name, boolean isFemale, boolean isMale) {
        this.name = name;
        this.isFemale = isFemale;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
