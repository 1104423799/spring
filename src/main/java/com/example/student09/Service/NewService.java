package com.example.student09.Service;

import com.example.student09.domain.NewsEntity;

import java.util.List;


public interface NewService {

public     List<NewsEntity> selectNewList();

    public NewsEntity selectNewId(Integer id);
    public void NewSave(NewsEntity newsEntity);
    public void NewEdit(NewsEntity newsEntity);
    public void NewDelete(Integer id);

}
