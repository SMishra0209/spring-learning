package springCore.chapter5.ex1;

import org.springframework.context.annotation.Bean;

public class ProjectConfig {

    @Bean
    public CommentService commentService() {
        return new CommentService();
    }

}
