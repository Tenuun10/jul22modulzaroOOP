package person;

public enum Gender {
    MALE("Ferfi","Male"),
    FEMALE("Female", "Nő");

    private String engName;
    private String hunName;

    Gender(String engName, String hunName) {
        this.engName = engName;
        this.hunName = hunName;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getHunName() {
        return hunName;
    }

    public void setHunName(String hunName) {
        this.hunName = hunName;
    }
}
