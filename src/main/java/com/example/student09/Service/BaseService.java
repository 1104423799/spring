package com.example.student09.Service;
import com.example.student09.domain.StudentEntity;

import java.util.List;


public interface BaseService {
    public List<StudentEntity> selectStudentList();  //查询全部
    public StudentEntity selectStudentId(Integer id);
    public void StudentSave(StudentEntity studentEntity);
    public void StudentEdit(StudentEntity studentEntity);
    public void StudentDelete(Integer id);



    }



