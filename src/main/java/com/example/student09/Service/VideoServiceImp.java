package com.example.student09.Service;

import com.example.student09.Repository.VideoRepository;
import com.example.student09.domain.NewsEntity;
import com.example.student09.domain.VideosEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImp implements VideoService {
    @Autowired
    private VideoRepository videoRepository;
    @Override
    public List<VideosEntity> selectVideosList(){   //查询所有VideosEntity的数据并显示出来
        return videoRepository.findAll();
    }
    @Override
    public VideosEntity selectVideosId(Integer id){    //查询VideosEntity中的id
        return videoRepository.findVideosById(id);
    }
    @Override
    public void VideosSave(VideosEntity videosEntity){  // 保存
        videoRepository.save(videosEntity);
    }

    @Override
    public void VideosEdit(VideosEntity videosEntity){  //修改
        videoRepository.save(videosEntity);
    }

    @Override
    public void VideosDelete(Integer id){  //删除
        videoRepository.deleteById(id);

    }

}
