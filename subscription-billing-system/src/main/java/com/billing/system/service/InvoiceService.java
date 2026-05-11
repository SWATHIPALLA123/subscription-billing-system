package com.billing.system.service;
 
import com.billing.system.entity.Invoice;
 
import java.util.List;
 
public interface InvoiceService {
 
    Invoice saveInvoice(Invoice invoice);
 
    List<Invoice> getAllInvoices();
 
    Invoice getInvoiceById(Long id);
 
    void deleteInvoice(Long id);
}
 