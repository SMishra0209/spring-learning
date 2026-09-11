package springCore.chapter3.ex1;

import org.springframework.context.annotation.Bean;

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
        return h;
    }
}
