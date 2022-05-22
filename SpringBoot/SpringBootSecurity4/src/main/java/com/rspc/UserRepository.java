package com.rspc;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserSpring, Long> 
{
	UserSpring findByUsername(String username);
}
