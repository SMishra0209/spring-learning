package springCore.chapter4.ex1.repositories;

import springCore.chapter4.ex1.model.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment){
        System.out.println("Storing comment: " + comment.getText());

    }
}
