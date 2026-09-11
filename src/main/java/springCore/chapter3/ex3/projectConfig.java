package springCore.chapter3.ex3;

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
    public Human human(Puppy puppy) {
        Human h = new Human();
        h.setName("Max");
        h.setPuppy(puppy);
        return h;
    }
}
