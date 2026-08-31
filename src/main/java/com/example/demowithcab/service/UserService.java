package com.example.demowithcab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demowithcab.entity.*;
import com.example.demowithcab.dao.*;
@Service
public class UserService {
	@Autowired
	UserRepo r;
	public User savedetails(User u)
	{
		return r.save(u);
	}
	

}
