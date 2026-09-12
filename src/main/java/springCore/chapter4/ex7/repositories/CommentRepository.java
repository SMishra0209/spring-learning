package springCore.chapter4.ex7.repositories;

import springCore.chapter4.ex7.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
