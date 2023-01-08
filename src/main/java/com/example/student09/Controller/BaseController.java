package com.example.student09.Controller;

import com.example.student09.Repository.StudentRepository;
import com.example.student09.Service.BaseService;
import com.example.student09.domain.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BaseController {
    @Resource
    private  BaseService baseService;
    @Autowired
    private StudentRepository studentRepository;
    @RequestMapping("/")
    public String tiaozhuan(){
        return "hello"; //登录后跳转到首页
    }

    @RequestMapping("/video1")
       public String tovideo1(){
       return "listvideo"; //页面之间的跳转
      }
    @RequestMapping("/user1")
    public String touser1(){
        return "userlist"; //页面之间的跳转
    }

    @RequestMapping("/new1")
    public String tonew1(){
        return "listnew"; //页面之间的跳转
    }
    @RequestMapping("/list")
    public String lsit(Model model){
        List<StudentEntity> studentEntities = baseService.selectStudentList();
        model.addAttribute("StudentEntities",studentEntities);
        return "userlist"; // 跳转userlist.html
    }



    @RequestMapping("/toAdd")
    public String toadd(StudentEntity studentEntity){
        return "userAdd";//跳转到userAdd.html
    }

    @RequestMapping("/toSelect")
    public String toFind(StudentEntity studentEntity){
        return "userSelect";
    }
    @RequestMapping("/select")
    public String select(Model model,String name){
        List<StudentEntity> lists = studentRepository.findStudentByName(name);
        model.addAttribute("lists",lists);
        System.out.println(lists);
        return "/selectlist";//查询完成，返回selectlist
    }


    @RequestMapping("/add")
    public String add(StudentEntity studentEntity){
        baseService.StudentSave(studentEntity);
        return "redirect:/list";//添加完成，请求重定向到/list
    }
    @RequestMapping("/toEdit")
    public String toEdit(Model model,Integer id){
        StudentEntity studentEntity = baseService.selectStudentId(id);
        model.addAttribute("StudentEntity",studentEntity);
        return "/userEdit"; //跳转到userEdit.html页面
    }
    @RequestMapping("/edit")
    public String edit(StudentEntity studentEntity){
       baseService.StudentEdit(studentEntity);
        return "redirect:/list";//获取列表数据并显示
    }
    @RequestMapping("/delete")
    public String edit(Integer id){
        baseService.StudentDelete(id);
        return "redirect:/list";
    }


}
