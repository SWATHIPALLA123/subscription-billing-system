package com.billing.system.audit;
 
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Aspect
@Component
public class AuditAspect {
 
    @Autowired
    private AuditService auditService;
 
    @AfterReturning(
            pointcut = "execution(* com.billing.system.service.*.*(..))",
            returning = "result"
    )
    public void logAfterMethodExecution(
            JoinPoint joinPoint,
            Object result
    ) {
 
        String methodName = joinPoint.getSignature().getName();
 
        auditService.logAction(
                "Method Executed : " + methodName
        );
    }
}
 