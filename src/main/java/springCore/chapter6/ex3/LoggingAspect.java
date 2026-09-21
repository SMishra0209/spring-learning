package springCore.chapter6.ex3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger =
            Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* springCore.chapter6.ex3.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        logger.info("Method " + methodName +
                " with parameters " + Arrays.asList(args) +
                " will execute");

        Comment comment = new Comment();
        comment.setText("Some other text!");
        Object[] newArgs = {comment};
        Object returnedByMethod = joinPoint.proceed(newArgs);

        logger.info("Method executed and returned " + returnedByMethod);

        return "FAILED";
    }
}
