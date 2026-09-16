package springCore.chapter5.ex3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
    }
}
