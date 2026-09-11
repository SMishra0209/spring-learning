package springCore.chapter3.ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
    private String name = "Break";
    private final Puppy puppy;

    @Autowired
    public Human(Puppy puppy) {
        this.puppy = puppy;
    }

    //Getters
    public Puppy getPuppy() {
        return puppy;
    }
    public String getName() {
        return name;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
}
