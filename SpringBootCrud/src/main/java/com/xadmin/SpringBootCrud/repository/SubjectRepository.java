package com.xadmin.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.xadmin.SpringBootCrud.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String> {
	

}
