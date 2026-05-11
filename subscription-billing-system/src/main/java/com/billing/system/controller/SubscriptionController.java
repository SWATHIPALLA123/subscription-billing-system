package com.billing.system.controller;
 
import com.billing.system.entity.Subscription;
import com.billing.system.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/api/subscriptions")
public class SubscriptionController {
 
    @Autowired
    private SubscriptionService subscriptionService;
 
    @PostMapping
    public Subscription saveSubscription(
            @RequestBody Subscription subscription
    ) {
 
        return subscriptionService.saveSubscription(subscription);
    }
 
    @GetMapping
    public List<Subscription> getAllSubscriptions() {
 
        return subscriptionService.getAllSubscriptions();
    }
 
    @GetMapping("/{id}")
    public Subscription getSubscriptionById(
            @PathVariable Long id
    ) {
 
        return subscriptionService.getSubscriptionById(id);
    }
 
    @DeleteMapping("/{id}")
    public String deleteSubscription(
            @PathVariable Long id
    ) {
 
        subscriptionService.deleteSubscription(id);
 
        return "Subscription Deleted Successfully";
    }
 
    @PutMapping("/{id}/cancel")
    public String cancelSubscription(
            @PathVariable Long id
    ) {
 
        return "Subscription Cancelled Successfully";
    }
}