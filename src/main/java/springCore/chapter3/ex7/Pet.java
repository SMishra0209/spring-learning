package springCore.chapter3.ex7;

import org.springframework.beans.factory.annotation.Autowired;

public class Pet {
    private String name = "Koko";
    private final Human human;

    @Autowired
    public Pet (Human human){
        this.human = human;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHuman() {
        return human;
    }
}
