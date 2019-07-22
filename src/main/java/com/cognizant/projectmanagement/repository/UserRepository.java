package com.cognizant.projectmanagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.projectmanagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}