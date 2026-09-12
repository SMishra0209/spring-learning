package springCore.chapter3.ex8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class projectConfig {

    @Bean
    public Puppy puppy1(){
        Puppy p = new Puppy();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Puppy puppy2(){
        Puppy p = new Puppy();
        p.setName("Miki");
        return p;
    }

    @Bean
    public Human human(@Qualifier("puppy2") Puppy puppy2){
        Human h = new Human();
        h.setName("Mars");
        h.setPuppy(puppy2);
        return h;
    }
}
