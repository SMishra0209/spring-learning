package springCore.chapter4.ex5.proxies;

import springCore.chapter4.ex5.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
