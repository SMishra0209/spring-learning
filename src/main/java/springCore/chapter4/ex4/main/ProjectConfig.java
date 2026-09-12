package springCore.chapter4.ex4.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springCore.chapter4.ex4.proxies.CommentNotificationProxy;
import springCore.chapter4.ex4.proxies.EmailCommentNotificationProxy;
import springCore.chapter4.ex4.repositories.CommentRepository;
import springCore.chapter4.ex4.repositories.DBCommentRepository;
import springCore.chapter4.ex4.services.CommentService;

@Configuration
@ComponentScan(basePackages = {"springCore.chapter4.ex2.proxies",
        "springCore.chapter4.ex2.repositories",
        "springCore.chapter4.ex2.services"})
public class ProjectConfig {

    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }
    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }
    @Bean
    public CommentService commentService(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepository, commentNotificationProxy);
    }
}
