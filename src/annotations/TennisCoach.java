package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
    //@Autowired
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public TennisCoach() {
        System.out.println(">> TennisCoach default constructor");
    }

    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService")
                               FortuneService fortuneService) {
        System.out.println(">> TennisCoach constructor with FortuneService");
        this.fortuneService = fortuneService;
    }

//    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> TennisCoach setFortuneService");
        this.fortuneService = fortuneService;
    }

    //@Autowired
    public void doSomeWubbaLabbaDubDub(FortuneService fortuneService) {
        System.out.println(">> TennisCoach doSomeWubbaLabbaDubDub");
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
        return "Team \"" + team + "\", move your rocket!";
    }

    @Override
    public String getDailyFortune() {
        return "TENNIS COACH (" + email + "): " + fortuneService.getFortune();
    }
}
