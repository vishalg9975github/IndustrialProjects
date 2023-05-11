package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Reimbursement;
import com.velocity.repository.ReimbursementRepository;
import com.velocity.service.ReimbursementService;

@Service
public class ReimbursementServiceImpl implements ReimbursementService {

	@Autowired
	private ReimbursementRepository reimbursementRepository;

	@Override
	public Reimbursement saveReimbursement(Reimbursement reimbursement) {

		Reimbursement reimbursement2 = reimbursementRepository.save(reimbursement);
		return reimbursement2;
	}

}
