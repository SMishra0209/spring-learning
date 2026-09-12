package springCore.chapter4.ex3.repositories;

import springCore.chapter4.ex3.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
