package com.asg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asg.entity.Invoice;

@Repository
public interface IInvoiceRepo extends JpaRepository<Invoice, Integer>{

}
