package com.dockerProj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dockerProj.entity.User;

@Repository
public interface UserRepositroy extends JpaRepository<User, Long>{

}
