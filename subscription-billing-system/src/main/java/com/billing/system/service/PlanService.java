package com.billing.system.service;
 
import com.billing.system.entity.Plan;
 
import java.util.List;
 
public interface PlanService {
 
    Plan savePlan(Plan plan);
 
    List<Plan> getAllPlans();
 
    Plan getPlanById(Long id);
 
    void deletePlan(Long id);
}