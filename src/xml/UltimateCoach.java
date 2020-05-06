package xml;

public class UltimateCoach implements Coach{
    private FortuneService fortuneService;

    public UltimateCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Just throw the disk!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
