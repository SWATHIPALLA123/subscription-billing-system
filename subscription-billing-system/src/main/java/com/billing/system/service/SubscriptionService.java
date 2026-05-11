package com.billing.system.service;
 
import com.billing.system.entity.Subscription;
 
import java.util.List;
 
public interface SubscriptionService {
 
    Subscription saveSubscription(
            Subscription subscription
    );
 
    List<Subscription> getAllSubscriptions();
 
    Subscription getSubscriptionById(Long id);
 
    void deleteSubscription(Long id);
}
 