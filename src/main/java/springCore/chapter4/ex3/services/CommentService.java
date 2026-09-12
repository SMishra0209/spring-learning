package springCore.chapter4.ex3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springCore.chapter4.ex3.model.Comment;
import springCore.chapter4.ex3.proxies.CommentNotificationProxy;
import springCore.chapter4.ex3.repositories.CommentRepository;

@Component
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private CommentNotificationProxy commentNotificationProxy;


    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
