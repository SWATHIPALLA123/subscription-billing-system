package com.billing.system.dto;
 
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlanDto {
 
    private Long id;
 
    private String planName;
 
    private Double amount;
 
    private Integer duration;
 
    private String description;
}