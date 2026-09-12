package springCore.chapter4.ex1.main;

import springCore.chapter4.ex1.model.Comment;
import springCore.chapter4.ex1.proxies.EmailCommentNotificationProxy;
import springCore.chapter4.ex1.repositories.DBCommentRepository;
import springCore.chapter4.ex1.services.CommentService;

public class Main {
    static void main() {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(
                commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Gini");
        comment.setText("Demo content");

        commentService.publishComment(comment);
    }
}
