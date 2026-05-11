package com.billing.system.entity;
 
import jakarta.persistence.*;
import lombok.*;
 
import java.time.LocalDate;
 
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subscription {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private LocalDate startDate;
 
    private LocalDate endDate;
 
    private String status;
 
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
 
    @ManyToOne
    @JoinColumn(name = "plan_id")
    private Plan plan;
}
 