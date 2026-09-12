package springCore.chapter4.ex5.services;

import org.springframework.stereotype.Component;
import springCore.chapter4.ex5.model.Comment;
import springCore.chapter4.ex5.proxies.CommentNotificationProxy;
import springCore.chapter4.ex5.repositories.CommentRepository;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy) {

        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
