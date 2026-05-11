package com.billing.system.entity;
 
import jakarta.persistence.*;
import lombok.*;
 
import java.time.LocalDate;
 
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String invoiceNumber;
 
    private Double totalAmount;
 
    private LocalDate invoiceDate;
 
    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;
}
 