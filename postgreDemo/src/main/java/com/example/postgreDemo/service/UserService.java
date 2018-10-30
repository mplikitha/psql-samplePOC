package com.example.postgreDemo.service;

import java.util.List;

import com.example.postgreDemo.domain.Domain;

public interface UserService {
	Domain save(Domain user);

	List<Domain> getAll();

}
