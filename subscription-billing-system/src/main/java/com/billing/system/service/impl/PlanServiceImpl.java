package com.billing.system.service.impl;

import com.billing.system.entity.Plan;
import com.billing.system.repository.PlanRepository;
import com.billing.system.service.PlanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl
        implements PlanService {

    @Autowired
    private PlanRepository planRepository;

    @Override
    public Plan savePlan(Plan plan) {

        return planRepository.save(plan);
    }

    @Override
    public List<Plan> getAllPlans() {

        return planRepository.findAll();
    }

    @Override
    public Plan getPlanById(Long id) {

        return planRepository.findById(id)
                .orElse(null);
    }

    @Override
    public void deletePlan(Long id) {

        planRepository.deleteById(id);
    }
}