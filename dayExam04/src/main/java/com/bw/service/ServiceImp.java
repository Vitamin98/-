package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.entity.User;
import com.bw.mapper.DaoMapper;

@Service
public class ServiceImp implements ServiceInter{
	@Autowired
	DaoMapper daoMapper;

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return daoMapper.getUserList();
	}
	
	
}
