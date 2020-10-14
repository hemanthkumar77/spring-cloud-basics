package com.HR.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.HR.model.*;
@Repository
public interface sal_repo extends CrudRepository<salary_info,String> {

}
