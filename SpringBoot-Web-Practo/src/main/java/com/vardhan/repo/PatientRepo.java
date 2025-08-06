package com.vardhan.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vardhan.entity.PatientData;

@Repository
public interface PatientRepo extends JpaRepository<PatientData, Serializable> {

}
