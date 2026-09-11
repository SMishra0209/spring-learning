package springCore.chapter3.ex2;

public class Human {
    private String name;
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
