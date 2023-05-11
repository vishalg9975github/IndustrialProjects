package com.velocity.controller;

import javax.persistence.PostLoad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Reimbursement;
import com.velocity.service.ReimbursementService;

@RestController
public class ReimbursementController {

	@Autowired
	private ReimbursementService reimbursementService;
	
	@PostMapping("/ReimbursementData")
	public Reimbursement saveReimbursement(@RequestBody Reimbursement reimbursement) {
		Reimbursement reimbursement2=reimbursementService.saveReimbursement(reimbursement);
		return reimbursement2;
	}
	
}
