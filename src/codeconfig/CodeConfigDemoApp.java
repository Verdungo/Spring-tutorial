package codeconfig;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CodeConfigDemoApp {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("defaultCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        /*

        // If no @ComponentScan, configuration in SportConfig.java is needed!
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());
        */

        context.close();
    }
}
