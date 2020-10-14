package com.HR.inter;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.HR.MODEL.salary_info;

@FeignClient("ZULU-API")
//@RibbonClient("SALARY-SERVICES")
public interface sal_interface {
	@GetMapping("/salary-services/salary/get_id/{id}")
   salary_info info(@PathVariable("id")String id);
}
