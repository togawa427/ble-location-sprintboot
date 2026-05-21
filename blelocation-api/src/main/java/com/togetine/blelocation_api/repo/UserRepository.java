package com.togetine.blelocation_api.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.togetine.blelocation_api.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
}
