package springCore.chapter4.ex3.proxies;

import springCore.chapter4.ex3.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
