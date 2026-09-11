package springCore.chapter3.ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class projectConfig {

    @Bean
    public Puppy puppy() {
        Puppy p = new Puppy();
        p.setName("Mars");
        return p;
    }

    @Bean
    public Human human() {
        Human h = new Human();
        h.setName("Max");
        h.setPuppy(puppy());
        return h;
    }
}
