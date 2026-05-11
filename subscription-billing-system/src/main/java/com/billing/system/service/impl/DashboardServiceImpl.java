package com.billing.system.service.impl;

import com.billing.system.service.DashboardService;

import org.springframework.stereotype.Service;

@Service
public class DashboardServiceImpl
        implements DashboardService {

    @Override
    public String getDashboardSummary() {

        return "Dashboard Summary Data";
    }
}