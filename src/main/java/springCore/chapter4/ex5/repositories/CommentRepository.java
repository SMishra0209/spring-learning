package springCore.chapter4.ex5.repositories;

import springCore.chapter4.ex5.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
