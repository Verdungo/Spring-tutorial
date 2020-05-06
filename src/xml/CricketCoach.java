package xml;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach() {
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Do a cricket stuff, team \"" + team + "\"!";
    }

    @Override
    public String getDailyFortune() {
        return "Are you even cricket? " + fortuneService.getFortune() + " E-mail me to : " + emailAddress;
    }
}
