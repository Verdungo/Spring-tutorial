package codeconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("codeconfig")
@PropertySource("codeconfig/sport.properties")
public class SportConfig {
    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    // NB! no @Component annotation in class!
    // method name is Bean id
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // NB! no @Component annotation in class!
    // method name is Bean id
    @Bean
    public Coach defaultCoach() {
        return new SwimCoach(sadFortuneService()); // injection!
    }
}
