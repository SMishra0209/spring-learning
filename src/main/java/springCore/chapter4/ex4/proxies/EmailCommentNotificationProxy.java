package springCore.chapter4.ex4.proxies;

import org.springframework.stereotype.Component;
import springCore.chapter4.ex4.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending notification for comment: " + comment.getText());
    }

}
