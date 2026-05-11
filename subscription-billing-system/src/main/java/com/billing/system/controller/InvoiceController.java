package com.billing.system.controller;
 
import com.billing.system.entity.Invoice;
import com.billing.system.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {
 
    @Autowired
    private InvoiceService invoiceService;
 
    @PostMapping
    public Invoice saveInvoice(@RequestBody Invoice invoice) {
 
        return invoiceService.saveInvoice(invoice);
    }
 
    @GetMapping
    public List<Invoice> getAllInvoices() {
 
        return invoiceService.getAllInvoices();
    }
 
    @GetMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable Long id) {
 
        return invoiceService.getInvoiceById(id);
    }
 
    @DeleteMapping("/{id}")
    public String deleteInvoice(@PathVariable Long id) {
 
        invoiceService.deleteInvoice(id);
 
        return "Invoice Deleted Successfully";
    }
}
 