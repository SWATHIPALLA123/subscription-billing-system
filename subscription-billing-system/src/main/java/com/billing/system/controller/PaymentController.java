package com.billing.system.controller;
 
import com.billing.system.entity.Payment;
import com.billing.system.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/api/payments")
public class PaymentController {
 
    @Autowired
    private PaymentService paymentService;
 
    @PostMapping
    public Payment savePayment(@RequestBody Payment payment) {
 
        return paymentService.savePayment(payment);
    }
 
    @GetMapping
    public List<Payment> getAllPayments() {
 
        return paymentService.getAllPayments();
    }
 
    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Long id) {
 
        return paymentService.getPaymentById(id);
    }
 
    @DeleteMapping("/{id}")
    public String deletePayment(@PathVariable Long id) {
 
        paymentService.deletePayment(id);
 
        return "Payment Deleted Successfully";
    }
}
 