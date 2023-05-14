package com.velocity.controller;

import java.util.List;

import javax.persistence.PostLoad;

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
<<<<<<< HEAD
=======

>>>>>>> eda9ac4b3ad152805826954ae780c1de790c97ee
	@PutMapping("/updateReimbursement")
	public Reimbursement updateReimbursement(@RequestBody Reimbursement reimbursement) {
		return reimbursementService.updateReimbursement(reimbursement);
	}
<<<<<<< HEAD
=======
	
	@GetMapping("/getReimbursement")
	public Reimbursement getReimbursement() {
		return reimbursementService.getReimbursement();
	}
>>>>>>> eda9ac4b3ad152805826954ae780c1de790c97ee
	
	@GetMapping("/getReimbursement")
	public List<Reimbursement> getReimbursement() {
		return reimbursementService.getReimbursement();
	}
}
