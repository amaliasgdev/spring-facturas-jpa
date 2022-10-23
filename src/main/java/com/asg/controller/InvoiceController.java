package com.asg.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.asg.entity.Invoice;
import com.asg.service.IInvoiceService;


@Controller
//@SessionAttributes("invoice")
@RequestMapping("/invoice")
public class InvoiceController {	

	@Autowired
	IInvoiceService servicio;	
		
	@GetMapping("")
	public String inicio() {			
		return "inicio";		
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("invoice", new Invoice());	
		model.addAttribute("mensaje", "");
		return "registro";
	}
	
	@PostMapping("/register")
	public String save(Invoice invoice, Model model) {		
		Invoice savedInvoice = servicio.save(invoice);
		model.addAttribute("mensaje", "Factura con id: " + savedInvoice.getId() + " se agregó correctamente.");
		model.addAttribute("invoice", new Invoice());
		return "registro";
	}
	
	@GetMapping("/list")
	public String listAll(Model model) {
		List<Invoice> listado = servicio.findAll();		
		model.addAttribute("listado", listado);		
		return "listado";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {		
		model.addAttribute("invoice", servicio.findById(id));		
		return "editar";
	}
	
	@PostMapping("/edit")
	public String saveEdit(Invoice invoice, RedirectAttributes redirect) {		
		Invoice newInvoice = servicio.save(invoice);		
		redirect.addFlashAttribute("mensaje", "¡Factura con id: " + newInvoice.getId() + " se actualizó correctamente!");	
		return "redirect:/invoice/list";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id, RedirectAttributes redirect) {
		servicio.deleteById(id);
		redirect.addFlashAttribute("mensaje", "¡Factura con id: " + id + " se eliminó correctamente!");		
		return "redirect:/invoice/list";
	}
		
}
