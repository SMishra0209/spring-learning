package springCore.chapter6.ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Hello World");
        comment.setAuthor("BlaBliBlu");

        service.publishComment(comment);
    }
}
