package com.registration.registration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.registration.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	 Role findByName(String name);

}
