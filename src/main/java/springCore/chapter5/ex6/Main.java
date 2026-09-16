package springCore.chapter5.ex6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = context.getBean("commentService", CommentService.class);
        var s2 = context.getBean("commentService", CommentService.class);

        boolean b = s1.getCommentRepository() == s2.getCommentRepository();
        System.out.println(b);
    }
}
