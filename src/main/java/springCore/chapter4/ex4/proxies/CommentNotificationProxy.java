package springCore.chapter4.ex4.proxies;

import springCore.chapter4.ex4.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
