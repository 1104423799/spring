package com.example.student09.Service;

import com.example.student09.Repository.NewRepository;
import com.example.student09.domain.NewsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewServiceImp implements NewService{
    @Autowired
    private NewRepository newRepository;
    @Override
    public List<NewsEntity> selectNewList(){   //查询所有NewsEntity的数据并显示出来
        return newRepository.findAll();
    }
    @Override
    public NewsEntity selectNewId(Integer id){    //查询NewsEntity中的id
        return newRepository.findNewById(id);
    }
    @Override
    public void NewSave(NewsEntity newsEntity){  // 保存
        newRepository.save(newsEntity);
    }

    @Override
    public void NewEdit(NewsEntity newsEntity){  //修改
        newRepository.save(newsEntity);
    }

    @Override
    public void NewDelete(Integer id){  //删除
        newRepository.deleteById(id);

    }
}
