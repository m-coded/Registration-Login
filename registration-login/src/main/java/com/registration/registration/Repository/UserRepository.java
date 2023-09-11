package com.registration.registration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.registration.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
