package springCore.chapter4.ex3.proxies;

import org.springframework.stereotype.Component;
import springCore.chapter4.ex3.model.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending notification for comment: " + comment.getText());
    }

}
