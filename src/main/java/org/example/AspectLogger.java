package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


// Aspect class
@Component
@Aspect
public class AspectLogger {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    // Point Cut -> "execution(* org.example.EmployeeService.*(..))"
    @Before("execution(* org.example.EmployeeService.getAllEmployees())")

    // Advice
    public void logBeforeAllMethods(JoinPoint joinPoint) {
        LOGGER.debug("****LoggingAspect.logBeforeAllMethods() : " + joinPoint.getSignature().getName());
    }
}
