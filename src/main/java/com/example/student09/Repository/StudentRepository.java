package com.example.student09.Repository;


import com.example.student09.domain.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {
    public StudentEntity findStudentById(Integer id);
    public  void deleteById(Integer id);
    List<StudentEntity> findStudentByName(String name);


}
