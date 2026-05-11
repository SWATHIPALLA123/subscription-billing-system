package com.billing.system.audit;
 
import org.springframework.stereotype.Service;
 
@Service
public class AuditService {
 
    public void logAction(String action) {
 
        System.out.println("AUDIT LOG : " + action);
 
    }
}
 