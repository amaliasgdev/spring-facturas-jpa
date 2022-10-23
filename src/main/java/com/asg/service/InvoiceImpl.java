package com.asg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asg.entity.Invoice;
import com.asg.repo.IInvoiceRepo;


@Service
public class InvoiceImpl implements IInvoiceService {
	
	@Autowired
	IInvoiceRepo repo;

	@Override
	public Invoice save(Invoice invoice) {		
		return repo.save(invoice);
	}

	@Override
	public Invoice findById(Integer id) {		
		return repo.findById(id).get();
	}

	@Override
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public void update(Invoice invoiceNew) {
		repo.save(invoiceNew);
	}

	@Override
	public List<Invoice> findAll() {		
		return repo.findAll();
	}
	

}
