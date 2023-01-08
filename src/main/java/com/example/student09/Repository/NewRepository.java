package com.example.student09.Repository;

import com.example.student09.domain.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewRepository extends JpaRepository<NewsEntity,Integer> {
    public NewsEntity findNewById(Integer id);
    public  void deleteById(Integer id);
}
