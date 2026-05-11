package com.billing.system.entity;
 
import jakarta.persistence.*;
import lombok.*;
 
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Plan {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String planName;
 
    private Double amount;
 
    // Duration in months
    private Integer duration;
 
    private String description;
}
 