package springCore.chapter2.ex5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context =
                new AnnotationConfigApplicationContext(projectConfig.class);

        Dog d = context.getBean(Dog.class);

        System.out.println(d);
        System.out.println(d.getName());
    }
}
