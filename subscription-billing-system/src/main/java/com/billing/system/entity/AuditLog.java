package com.billing.system.entity;
 
import jakarta.persistence.*;
import lombok.*;
 
import java.time.LocalDateTime;
 
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuditLog {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String action;
 
    private String performedBy;
 
    private LocalDateTime actionTime;
 
    private String description;
}