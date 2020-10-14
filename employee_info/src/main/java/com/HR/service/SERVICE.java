package com.HR.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HR.DATA.employee_repo;
import com.HR.MODEL.employee;

@Service
public class SERVICE {
	@Autowired
    private employee_repo rep;
	
	public void save_employee(employee emp) {
		rep.save(emp);
	}

	public employee get_id(String id) {
		Optional<employee> obj=rep.findById(id);
		employee object=obj.get();
		return object;
	}



	


}
