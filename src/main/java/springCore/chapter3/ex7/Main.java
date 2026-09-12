package springCore.chapter3.ex7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springCore.chapter3.ex6.Human;

public class Main {
    static void main() {
        var context =
                new AnnotationConfigApplicationContext(projectConfig.class);

        springCore.chapter3.ex6.Human human = context.getBean(Human.class);
        System.out.println("Human's name: " + human.getName());
        System.out.println("Human's parrot: " + human.getPuppy());
    }
}
