package gmail.mrkvkrvch;

public class Citizens {

    private String citizenName;
    private int age;
    private CitizensProfile citizensProfile;

    public Citizens (String citizenName, int age) {
        this.citizenName = citizenName;
        this. age = age;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public void setCitizenName (String citizenName) {
        this.citizenName = citizenName;
    }

    public int getAge() {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    static class CitizensProfile {

        int penalties;
        boolean citizenship;

        public CitizensProfile (int penalties, boolean citizenship) {
            this.penalties = penalties;
            this.citizenship = citizenship;
        }

    }
}
