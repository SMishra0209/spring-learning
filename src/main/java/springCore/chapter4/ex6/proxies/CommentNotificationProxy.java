package springCore.chapter4.ex6.proxies;

import springCore.chapter4.ex6.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
