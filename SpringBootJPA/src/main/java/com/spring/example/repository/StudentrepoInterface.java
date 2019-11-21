package com.spring.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.example.bean.StudentBean;

public interface StudentrepoInterface extends JpaRepository<StudentBean, Integer>{

}
