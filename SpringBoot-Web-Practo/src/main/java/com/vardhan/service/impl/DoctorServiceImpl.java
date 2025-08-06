package com.vardhan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vardhan.entity.DoctorData;
import com.vardhan.repo.DoctorRepo;
import com.vardhan.service.DoctorService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepo doctorRepo;
	@Override
	public DoctorData saveDoctor(DoctorData doctorData) {

		return doctorRepo.save(doctorData);
	}

}
