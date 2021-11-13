package gmail.mrkvkrvch;

public class DeterminationOfPunishment {

    public static void main (String[] args) {
        Citizen john = new Citizen("John", 26);
        Citizen.CitizensProfile forJohn = new Citizen.CitizensProfile(10, true);
        Citizen mark = new Citizen("Mark", 18);
        Citizen.CitizensProfile forMark = new Citizen.CitizensProfile(6, false);
        Citizen.CitizensProfile.goToJail(forJohn, john);
        Citizen.CitizensProfile.goToJail(forMark, mark);
    }
}
