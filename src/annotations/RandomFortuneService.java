package annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{
    private static final String[] FORTUNES = {
            "Go! Go! Go!",
            "You rock!",
            "C'mon!"
    };
    @Override
    public String getFortune() {
        return FORTUNES[new Random().nextInt(3)];
    }
}
