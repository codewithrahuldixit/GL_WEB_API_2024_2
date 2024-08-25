package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer>  {

}
