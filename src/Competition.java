public class Competition {
    public static void main(String[] args) {

        CompetitionRules.getInstance().printRules();

        Team teamA = new Team();
        Team teamB = new Team();

        teamA.teamName = "Team Android: ";
        teamB.teamName = "Team FullStack: ";


        teamA.p1.name = "Robert";
        teamA.p1.programmingLanguage = "Android";
        teamA.p1.yearsOfExperience = 4;

        teamA.p2.name = "Marcus";
        teamA.p2.programmingLanguage = "Android";
        teamA.p2.yearsOfExperience = 2;

        teamB.p1.name = "John";
        teamB.p1.programmingLanguage = "FullStack";
        teamB.p1.yearsOfExperience = 3;

        teamB.p2.name = "Albert";
        teamB.p2.programmingLanguage = "FullStack";
        teamB.p2.yearsOfExperience = 6;

        System.out.println(teamA.printTeamDetails());
        System.out.println(teamB.printTeamDetails());
    }
}