package springCore.chapter3.ex2;

import org.w3c.dom.ls.LSOutput;

public class Puppy {
    private String name;

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
