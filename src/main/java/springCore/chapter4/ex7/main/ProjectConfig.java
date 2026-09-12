package springCore.chapter4.ex7.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"springCore.chapter4.ex6.proxies",
        "springCore.chapter4.ex6.repositories",
        "springCore.chapter4.ex6.services"})
public class ProjectConfig {
}
