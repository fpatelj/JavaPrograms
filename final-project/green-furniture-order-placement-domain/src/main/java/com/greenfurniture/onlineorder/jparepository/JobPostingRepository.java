package com.greenfurniture.onlineorder.jparepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenfurniture.onlineorder.domain.JobPosting;

public interface JobPostingRepository extends JpaRepository<JobPosting, Integer>{

	
	Optional<JobPosting> findOneById(Integer id);
}
