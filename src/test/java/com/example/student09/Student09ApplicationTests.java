package com.example.student09;

import com.example.student09.Repository.StudentRepository;
import com.example.student09.domain.StudentEntity;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
class Student09ApplicationTests {
@Autowired
private StudentRepository studentRepository;
    @Test
    void contextLoads() {
        System.out.println("table 创建成功。。。。");
    }
    @Test
    public void add(){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName("张三");
        studentEntity.setId(1);
        studentEntity.setAge(22);
        studentEntity.setAcademy("数学");
        studentRepository.save(studentEntity);
        System.out.println(studentEntity);
    }
    @Test
    public void findAll(){
        List<StudentEntity> all =studentRepository.findAll();
        System.out.println(all);
    }
    @Test
    public void delete(){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(4);
        studentRepository.delete(studentEntity);
    }
    @Test
    public  void select(){
        List<StudentEntity> list = studentRepository.findStudentByName("张三");
        System.out.println(list);
    }




}
