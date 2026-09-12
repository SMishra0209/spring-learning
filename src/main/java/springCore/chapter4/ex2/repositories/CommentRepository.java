package springCore.chapter4.ex2.repositories;

import springCore.chapter4.ex2.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
