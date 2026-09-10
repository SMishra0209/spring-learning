package springCore.chapter2.ex3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class projectConfig {

    @Bean
    Cat cat1(){
        var c = new Cat();
        c.setName("Meowth");
        return c;
    }

    @Bean
    Cat cat2(){
        var c = new Cat();
        c.setName("Mouth");
        return c;
    }

    @Bean
    Cat cat3(){
        var c = new Cat();
        c.setName("Meow");
        return c;
    }
}
