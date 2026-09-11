package springCore.chapter3.ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
    private String name = "Break";
    @Autowired
    private Puppy puppy;

    //Getters
    public Puppy getPuppy() {
        return puppy;
    }
    public String getName() {
        return name;
    }

    //Setters
    public void setPuppy(Puppy puppy) {
        this.puppy = puppy;
    }

    public void setName(String name) {
        this.name = name;
    }
}
