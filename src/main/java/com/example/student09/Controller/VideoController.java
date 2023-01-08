package com.example.student09.Controller;

import com.example.student09.Repository.VideoRepository;
import com.example.student09.Service.VideoService;
import com.example.student09.domain.VideosEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class VideoController {
    @Resource
    private VideoService videoService;
    @Autowired
    private VideoRepository videoRepository;

    @RequestMapping("/listvideo")
    public String lsit(Model model) {
        List<VideosEntity> videosEntities = videoService.selectVideosList();
        model.addAttribute("VideosEntities",videosEntities);
        return "video/videolist"; // 跳转到videolist.html
    }

    @RequestMapping("/toAddvideo")
    public String toadd(VideosEntity videosEntity) {
        return "video/videoAdd";//跳转到videoAdd.html
    }

    @RequestMapping("/videoadd")
    public String add(VideosEntity videosEntity) {
        videoService.VideosSave(videosEntity);
        return "redirect:/listvideo";//添加完成，请求重定向到/listvideo
    }


    @RequestMapping("/toEditvideo")
    public String toEdit(Model model,Integer id){
        VideosEntity videosEntity = videoService.selectVideosId(id);
        model.addAttribute("VideosEntity",videosEntity);
        return "video/videoEdit"; //跳转到videoEdit.html页面
    }
    @RequestMapping("/videoedit")
    public String edit(VideosEntity videosEntity){
        videoService.VideosEdit(videosEntity);
        return "redirect:/listvideo";//获取列表数据并显示
    }
    @RequestMapping("/videodelete")
    public String edit(Integer id){
        videoService.VideosDelete(id);
        return "redirect:/listvideo";
    }

}
