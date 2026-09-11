package springCore.chapter2.ex5;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name;

    @PostConstruct
    public void init(){
        this.name = "Kiki";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
