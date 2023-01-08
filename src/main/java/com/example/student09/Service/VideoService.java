package com.example.student09.Service;

import com.example.student09.domain.VideosEntity;

import java.util.List;

public interface VideoService {
    public List<VideosEntity> selectVideosList();

    public VideosEntity selectVideosId(Integer id);
    public void VideosSave(VideosEntity videosEntity);
    public void VideosEdit(VideosEntity videosEntity);
    public void VideosDelete(Integer id);
}
