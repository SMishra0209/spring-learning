package springCore.chapter4.ex2.proxies;

import springCore.chapter4.ex2.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
