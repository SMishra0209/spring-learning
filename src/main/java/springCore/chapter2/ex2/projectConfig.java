package springCore.chapter2.ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class projectConfig {
    @Bean
    Dog dog() {
        var d = new Dog();
        d.setName("Shiro");
        return d;
    }
    @Bean
    String hello(){
        return "hello";
    }
    @Bean
    Integer ten(){
        return 10;
    }
}
