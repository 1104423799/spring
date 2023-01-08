package com.example.student09.Repository;

import com.example.student09.domain.VideosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<VideosEntity,Integer> {
    public VideosEntity findVideosById(Integer id);
    public  void deleteById(Integer id);
}
