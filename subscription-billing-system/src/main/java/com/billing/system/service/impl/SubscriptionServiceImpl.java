package com.billing.system.service.impl;

import com.billing.system.entity.Subscription;
import com.billing.system.repository.SubscriptionRepository;
import com.billing.system.service.SubscriptionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImpl
        implements SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Override
    public Subscription saveSubscription(
            Subscription subscription) {

        return subscriptionRepository.save(subscription);
    }

    @Override
    public List<Subscription> getAllSubscriptions() {

        return subscriptionRepository.findAll();
    }

    @Override
    public Subscription getSubscriptionById(Long id) {

        return subscriptionRepository.findById(id)
                .orElse(null);
    }

    @Override
    public void deleteSubscription(Long id) {

        subscriptionRepository.deleteById(id);
    }
}