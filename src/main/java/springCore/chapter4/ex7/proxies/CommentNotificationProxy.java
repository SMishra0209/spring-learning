package springCore.chapter4.ex7.proxies;

import springCore.chapter4.ex7.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
