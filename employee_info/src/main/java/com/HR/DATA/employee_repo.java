package com.HR.DATA;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.HR.MODEL.*;
@Repository
public interface employee_repo extends CrudRepository<employee,String>{

}
