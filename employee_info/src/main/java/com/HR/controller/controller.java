package com.HR.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HR.DATA.employee_repo;
import com.HR.MODEL.employee;
import com.HR.MODEL.salary_info;
import com.HR.inter.sal_interface;
import com.HR.service.SERVICE;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RefreshScope
@RequestMapping("/employee")
public class controller {
	@Autowired
	private SERVICE ser;
	@Autowired
	private sal_interface sa;
	@Value("${com.joker.springcloud.prop}")
	private String value;
	@RequestMapping("/save")
	@PostMapping
	public void savedata(@RequestBody employee emp)
	{
		ser.save_employee(emp);
	}
	// It is used handle the problem if the salary service container has a problem 
	@HystrixCommand(fallbackMethod="backup")
	@RequestMapping("/get_id/{id}")
	@GetMapping
	public employee get_id(@PathVariable("id")String id)
	{
		salary_info sal=sa.info(id);
	   employee emp=ser.get_id(id);
	   emp.setInf(sal);
	   return emp;
	}
	public employee backup(@PathVariable("id")String id)
	{
	   return new employee();
	}
	@GetMapping
	@RequestMapping(value="/reload")
	public String getprop()
	{
		return this.value;
	}
}
