package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
@Transactional
//Implicitly the Hibernate ORM tool is providing the implementation to JPA Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
