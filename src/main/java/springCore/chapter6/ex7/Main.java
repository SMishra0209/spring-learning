package springCore.chapter6.ex7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static Logger logger =
            Logger.getLogger(Main.class.getName());

    static void main() {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Hello World");
        comment.setAuthor("BlaBliBlu");

        String value = service.publishComment(comment);
    }
}
