package springCore.chapter2.ex6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(projectConfig.class);

        Dog d = new Dog();
        d.setName("Kiki");

        Supplier<Dog> dogSupplier = () -> d;
        context.registerBean("dog1", Dog.class, dogSupplier);

        Dog g = context.getBean(Dog.class);
        System.out.println(g.getName());
    }
}
