package codeconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
    //@Autowired
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> TennisCoach default constructor");
    }

    @Autowired
    public TennisCoach(@Qualifier("happyFortuneService")
            FortuneService fortuneService) {
        System.out.println(">> TennisCoach constructor with FortuneService");
        this.fortuneService = fortuneService;
    }

    @PostConstruct
    private void onInit() {
        System.out.println("TennisCoach is initializing...");
    }

    @PreDestroy
    private void onDestroy() {
        System.out.println("TennisCoach is destroying...");
    }

    @Override
    public String getDailyWorkout() {
        return "Move your rocket!";
    }

    @Override
    public String getDailyFortune() {
        return "TENNIS COACH: " + fortuneService.getFortune();
    }
}
