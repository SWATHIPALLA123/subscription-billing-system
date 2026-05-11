package com.billing.system.service.impl;

import com.billing.system.entity.Invoice;
import com.billing.system.repository.InvoiceRepository;
import com.billing.system.service.InvoiceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl
        implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public Invoice saveInvoice(Invoice invoice) {

        return invoiceRepository.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices() {

        return invoiceRepository.findAll();
    }

    @Override
    public Invoice getInvoiceById(Long id) {

        return invoiceRepository.findById(id)
                .orElse(null);
    }

    @Override
    public void deleteInvoice(Long id) {

        invoiceRepository.deleteById(id);
    }
}