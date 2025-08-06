package com.vardhan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vardhan.entity.PatientData;
import com.vardhan.repo.PatientRepo;
import com.vardhan.service.PatientService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepo patientRepo;
	
	@Override
	public PatientData savePatient(PatientData patientData) {
		
		return patientRepo.save(patientData);
	}

}
