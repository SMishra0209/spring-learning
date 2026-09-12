package springCore.chapter4.ex1.proxies;

import springCore.chapter4.ex1.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending notification for comment: " + comment.getText());
    }

}
