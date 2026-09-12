package springCore.chapter4.ex4.repositories;

import springCore.chapter4.ex4.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
