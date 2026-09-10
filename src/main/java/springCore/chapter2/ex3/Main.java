package springCore.chapter2.ex3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context =
                new AnnotationConfigApplicationContext(projectConfig.class);
        Cat c = context.getBean("cat1",Cat.class);
        System.out.println(c.getName());
    }
}
