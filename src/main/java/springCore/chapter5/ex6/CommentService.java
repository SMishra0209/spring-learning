package springCore.chapter5.ex6;

import org.springframework.beans.factory.annotation.Autowired;

public class CommentService {

    @Autowired
    private CommentRepository commentRepository;
    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
