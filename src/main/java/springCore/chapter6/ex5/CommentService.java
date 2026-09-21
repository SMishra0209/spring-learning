package springCore.chapter6.ex5;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private final Logger logger =
            Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }
    @ToLog
    public void deleteComment(Comment comment){
        logger.info("Deleting comment: " + comment.getText());
    }
    public void editComment(Comment comment){
        logger.info("Editing comment: " + comment.getText());
    }
}
