package com.vardhan.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vardhan.entity.DoctorData;
@Repository
public interface DoctorRepo extends JpaRepository<DoctorData, Serializable> {

}
