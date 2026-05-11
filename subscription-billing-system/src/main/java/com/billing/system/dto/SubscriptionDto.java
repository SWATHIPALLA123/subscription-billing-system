package com.billing.system.dto;
 
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
import java.time.LocalDate;
 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionDto {
 
    private Long id;
 
    private LocalDate startDate;
 
    private LocalDate endDate;
 
    private String status;
 
    private Long userId;
 
    private Long planId;
}
 