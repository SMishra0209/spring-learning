package springCore.chapter4.ex6.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springCore.chapter4.ex6.model.Comment;

@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending email notification for comment: " + comment.getText());
    }

}
