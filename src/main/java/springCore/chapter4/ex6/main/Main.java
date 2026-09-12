package springCore.chapter4.ex6.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springCore.chapter4.ex6.model.Comment;
import springCore.chapter4.ex6.services.CommentService;

public class Main {
    static void main() {

        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        comment.setAuthor("Libs");
        comment.setText("Demo content");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
