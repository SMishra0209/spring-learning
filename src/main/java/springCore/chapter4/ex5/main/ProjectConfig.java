package springCore.chapter4.ex5.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"springCore.chapter4.ex5.proxies",
        "springCore.chapter4.ex5.repositories",
        "springCore.chapter4.ex5.services"})
public class ProjectConfig {
}
