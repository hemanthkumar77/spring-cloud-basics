package com.HR.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HR.Service.SERVICE;
import com.HR.model.salary_info;

@RestController
@RequestMapping("/salary")
public class controller {
    @Autowired
	private SERVICE ser;
	@RequestMapping("/get_id/{id}")
	@GetMapping
	public salary_info get_id(@PathVariable("id")String id)
	{
		salary_info sal=ser.find_id(id);
		System.out.println("server-2");
		return sal;
	}
}
