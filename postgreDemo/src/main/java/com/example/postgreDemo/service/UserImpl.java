package com.example.postgreDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.postgreDemo.domain.Domain;
import com.example.postgreDemo.repository.UserRepo;

@Service
public class UserImpl implements UserService{

	@Autowired
	private UserRepo repo;
	
	public UserImpl(UserRepo repo) {
				this.repo = repo;
	}

	@Override
	public Domain save(Domain user) {
		Domain domain=repo.save(user);
		return domain;
	}

	@Override
	public List<Domain> getAll() {
		List<Domain> list=(List<Domain>) repo.findAll();
		return list;
	}

	

}
