package springCore.chapter2.ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context =
                new AnnotationConfigApplicationContext();
        Dog dog = new Dog();
    }
}
