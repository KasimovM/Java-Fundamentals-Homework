package gmail.mrkvkrvch;

public class Citizen {

    private String name;
    private int age;

    public Citizen(String citizenName, int age) {
        this.name = citizenName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    static class CitizensProfile {

        int penalties;
        boolean isHaveCitizenship;

        public CitizensProfile (int penalties, boolean isHaveCitizenship) {
            this.penalties = penalties;
            this.isHaveCitizenship = isHaveCitizenship;
        }

        public static String goToJail (CitizensProfile citizensProfile, Citizen citizens) {
            if (citizensProfile.penalties > 5 & !citizensProfile.isHaveCitizenship) {
                System.out.println("Неуважаемый НЕгражданин" + " " + citizens.name + "," + " " + "вы изгнаны из " +
                        "нашего государства навеки!");
            } else {
                System.out.println(citizens.name + "," + " " + "за ваши преступления вам придется оплатить штраф " +
                        "в казну!");
            }
            return null;
        }
    }
}
