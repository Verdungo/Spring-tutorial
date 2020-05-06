package xml;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private static final String[] FORTUNES = {
            "Go! Go! Go!",
            "Never give up!",
            "You can do it!"
    };

    @Override
    public String getFortune() {
        return FORTUNES[new Random().nextInt(3)];
    }
}
