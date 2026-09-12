package springCore.chapter4.ex6.repositories;

import springCore.chapter4.ex6.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
