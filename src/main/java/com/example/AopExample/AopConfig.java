package com.example.AopExample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopConfig {

    @Before(value="execution(* com.example.AopExample..*(..))")
    public void beforeAdvice(JoinPoint jp){
        String methodName = jp.getSignature().getName();

        // Extracting method arguments
        Object[] args = jp.getArgs();
        String userId = (String) args[0];
        int age = (int) args[1];

        System.out.println("Before method: " + methodName);
        System.out.println("User ID: " + userId + ", Age: " + age);
        System.out.println("Before Api call is executed");
    }
    @After(value="execution(* com.example.AopExample..*(..))")
    public void afterAdvice(JoinPoint jp){
        System.out.println("After Api call is executed");
    }

    @AfterReturning(value="execution(* com.example.AopExample..*(..))")
    public void afterReturning(JoinPoint jp){
        System.out.println("Return Api call is executed");
    }
    @Around(value="execution(* com.example.AopExample..*(..))")
    public Object aroundAdvice(ProceedingJoinPoint jp) {
        System.out.println("Around Api call is executed");
        Object result = null;
        try {
            result = jp.proceed(); // Proceed and capture the result
            System.out.println("Return Api call is executed");
        } catch (Throwable e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        return result; // Return the result from the actual method
    }

}
