package com.example.postgreDemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.postgreDemo.domain.Domain;

@Repository
public interface UserRepo extends CrudRepository<Domain, Long>  {

}
