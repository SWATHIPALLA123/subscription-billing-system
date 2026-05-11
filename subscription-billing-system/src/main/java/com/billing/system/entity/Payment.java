package com.billing.system.entity;
 
import jakarta.persistence.*;
import lombok.*;
 
import java.time.LocalDateTime;
 
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private Double amount;
 
    private String paymentMethod;
 
    private String paymentStatus;
 
    private String transactionId;
 
    private LocalDateTime paymentDate;
}
 