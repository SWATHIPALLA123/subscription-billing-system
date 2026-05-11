package com.billing.system.controller;
 
import com.billing.system.entity.Plan;
import com.billing.system.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/api/plans")
public class PlanController {
 
    @Autowired
    private PlanService planService;
 
    @PostMapping
    public Plan savePlan(@RequestBody Plan plan) {
 
        return planService.savePlan(plan);
    }
 
    @GetMapping
    public List<Plan> getAllPlans() {
 
        return planService.getAllPlans();
    }
 
    @GetMapping("/{id}")
    public Plan getPlanById(@PathVariable Long id) {
 
        return planService.getPlanById(id);
    }
 
    @PutMapping("/{id}")
    public Plan updatePlan(@PathVariable Long id,
                           @RequestBody Plan plan) {
 
        plan.setId(id);
 
        return planService.savePlan(plan);
    }
 
    @DeleteMapping("/{id}")
    public String deletePlan(@PathVariable Long id) {
 
        planService.deletePlan(id);
 
        return "Plan Deleted Successfully";
    }
}
 