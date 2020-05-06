package xml;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    private void init() {
        System.out.println("Init method in TrackCoach");
    }

    private void destroy() {
        System.out.println("Destroy method in TrackCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k.";
    }

    @Override
    public String getDailyFortune() {
        return "Run it! " + fortuneService.getFortune();
    }
}
