package com.asg.service;

import java.util.List;
import java.util.Optional;

import com.asg.entity.Invoice;

public interface IInvoiceService {
	public List<Invoice> findAll();
	public Invoice save(Invoice invoice);	
	public Invoice findById(Integer id);	
	public void deleteById(Integer id);	
	public void update(Invoice invoiceNew);
}
