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
public class InvoiceDto {
 
    private Long id;
 
    private String invoiceNumber;
 
    private Double totalAmount;
 
    private LocalDate invoiceDate;
 
    private Long paymentId;
}
 