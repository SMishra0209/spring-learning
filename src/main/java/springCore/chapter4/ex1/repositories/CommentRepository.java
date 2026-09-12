package springCore.chapter4.ex1.repositories;

import springCore.chapter4.ex1.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
