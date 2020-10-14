package com.HR.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.HR.model.salary_info;
import com.HR.repo.sal_repo;

@Service
public class SERVICE {
    @Autowired
	private sal_repo sa;
	public salary_info find_id(String id) {
		Optional<salary_info> obj=sa.findById(id);
		salary_info object=obj.get();
		return object;
	}

}
