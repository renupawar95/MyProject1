package com.mindtree.gooddeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.gooddeed.entity.Supervisor;
@Repository
public interface SupervisorRepository extends JpaRepository<Supervisor,Integer>{

}
