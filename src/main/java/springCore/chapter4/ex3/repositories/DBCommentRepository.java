package springCore.chapter4.ex3.repositories;

import org.springframework.stereotype.Component;
import springCore.chapter4.ex3.model.Comment;

@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment){
        System.out.println("Storing comment: " + comment.getText());

    }
}
