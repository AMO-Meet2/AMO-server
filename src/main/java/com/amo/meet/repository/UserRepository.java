package com.amo.meet.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.amo.meet.model.User;

public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<Object> {
	
	List<User> findAll();
	
	User findByUserIdAndPassword(String userId, String passwword);

	@Transactional
	Integer deleteByUserId(String userId);
	
}
