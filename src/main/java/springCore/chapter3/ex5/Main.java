package springCore.chapter3.ex5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context =
                new AnnotationConfigApplicationContext(projectConfig.class);

        Human human = context.getBean(Human.class);
        System.out.println("Human's name: " + human.getName());
        System.out.println("Human's parrot: " + human.getPuppy());
    }
}
