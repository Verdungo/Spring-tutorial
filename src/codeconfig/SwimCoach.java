package codeconfig;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
    FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim fast! Team: " + team + ". Email: " + email;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
