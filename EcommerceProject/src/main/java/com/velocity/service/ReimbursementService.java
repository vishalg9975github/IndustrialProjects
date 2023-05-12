package com.velocity.service;

import com.velocity.model.Reimbursement;

public interface ReimbursementService {

	public Reimbursement saveReimbursement(Reimbursement reimbursement);
	public Reimbursement updateReimbursement(Reimbursement reimbursement);
	public Reimbursement getReimbursement();
}
