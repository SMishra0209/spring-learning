package springCore.chapter4.ex1.proxies;

import springCore.chapter4.ex1.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
