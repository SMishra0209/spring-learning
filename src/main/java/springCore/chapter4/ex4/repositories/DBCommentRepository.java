package springCore.chapter4.ex4.repositories;

import org.springframework.stereotype.Component;
import springCore.chapter4.ex4.model.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment){
        System.out.println("Storing comment: " + comment.getText());

    }
}
