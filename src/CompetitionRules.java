public class CompetitionRules {

    private static CompetitionRules instance;

    private String competitionRules1 = "Do not copy and paste from StackOverflow!";
    private String competitionRules2 = "Learn every day!";
    private String competitionRules3 = "Be the best Team!";
    private CompetitionRules(){}


    public static CompetitionRules getInstance() {
        if (instance == null) {
            instance = new CompetitionRules();
        }
        return instance;
    }

    public void printRules() {
        System.out.println(competitionRules1 + " " + competitionRules2 + " " +  competitionRules3);

    }
}



