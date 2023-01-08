package com.example.student09.Service;

import com.example.student09.Repository.StudentRepository;
import com.example.student09.domain.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseServiceImpl implements BaseService{
    @Autowired
    private StudentRepository studentRepository;
@Override
public List<StudentEntity> selectStudentList(){     //查询全部
    return studentRepository.findAll();
}


@Override
    public StudentEntity selectStudentId(Integer id){  //查询id
    return studentRepository.findStudentById(id);
    }

    @Override
    public void StudentSave(StudentEntity studentEntity){  // 保存
           studentRepository.save(studentEntity);
}

    @Override
    public void StudentEdit(StudentEntity studentEntity){  //修改
           studentRepository.save(studentEntity);
    }

    @Override
    public void StudentDelete(Integer id){  //删除
           studentRepository.deleteById(id);

    }

}
