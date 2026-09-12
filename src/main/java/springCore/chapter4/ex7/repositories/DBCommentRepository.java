package springCore.chapter4.ex7.repositories;

import org.springframework.stereotype.Repository;
import springCore.chapter4.ex7.model.Comment;

@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment){
        System.out.println("Storing comment: " + comment.getText());

    }
}
