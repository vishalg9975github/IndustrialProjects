package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Reimbursement;
import com.velocity.service.ReimbursementService;

@RestController
public class ReimbursementController {

	@Autowired
	private ReimbursementService reimbursementService;

	
	@PostMapping("/saveReimbursement")
	public Reimbursement saveReimbursement(@RequestBody Reimbursement reimbursement) {
		Reimbursement reimbursement2=reimbursementService.saveReimbursement(reimbursement);
		return reimbursement2;
	}

	@PutMapping("/updateReimbursement")
	public Reimbursement updateReimbursement(@RequestBody Reimbursement reimbursement) {
		return reimbursementService.updateReimbursement(reimbursement);
	}

	@GetMapping("/getReimbursement")
	public List<Reimbursement> getReimbursement() {
		return reimbursementService.getReimbursement();
	}

}