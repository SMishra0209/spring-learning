package springCore.chapter3.ex7;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
    private final Pet pet;

    @Autowired
    public Human(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
}
