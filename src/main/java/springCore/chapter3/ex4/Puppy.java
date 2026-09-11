package springCore.chapter3.ex4;

import org.springframework.stereotype.Component;

@Component
public class Puppy {
    private String name = "Pious";

    public Puppy(){
        System.out.println("Puppy created.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Puppy: " + name;
    }
}
