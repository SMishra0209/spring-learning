package springCore.chapter6.ex1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private final Logger logger =
            Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* springCore.chapter6.ex1.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info("Method will execute");
        joinPoint.proceed();
        logger.info("Method executed");
    }
}
