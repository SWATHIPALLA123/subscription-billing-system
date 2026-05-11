package com.billing.system.controller;
 
import com.billing.system.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {
 
    @Autowired
    private DashboardService dashboardService;
 
    @GetMapping("/summary")
    public String getDashboardSummary() {
 
        return dashboardService.getDashboardSummary();
    }
}