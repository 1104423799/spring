package com.example.student09.Controller;

import com.example.student09.Repository.NewRepository;
import com.example.student09.Service.NewService;
import com.example.student09.domain.NewsEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class NewController {
    @Resource
    private NewService newService;
    @Autowired
    private NewRepository newRepository;

    @RequestMapping("/listnew")
    public String lsit(Model model) {
        List<NewsEntity> NewsEntities = newService.selectNewList();
        model.addAttribute("NewsEntities", NewsEntities);
        return "new/newlist"; // 跳转到newlist.html
    }



    @RequestMapping("/toAddnew")
    public String toadd(NewsEntity newsEntity) {
        return "new/newAdd";//跳转到newAdd.html
    }

    @RequestMapping("/newadd")
    public String add(NewsEntity newsEntity) {
        newService.NewSave(newsEntity);
        return "redirect:/listnew";//添加完成，请求重定向到/listnew
    }


    @RequestMapping("/toEditnew")
    public String toEdit(Model model,Integer id){
        NewsEntity newsEntity = newService.selectNewId(id);
        model.addAttribute("NewsEntity",newsEntity);
        return "new/newEdit"; //跳转到newEdit.html页面
    }
    @RequestMapping("/newedit")
    public String edit(NewsEntity newsEntity){
        newService.NewEdit(newsEntity);
        return "redirect:/listnew";//获取列表数据并显示
    }
    @RequestMapping("/newdelete")
    public String edit(Integer id){
        newService.NewDelete(id);
        return "redirect:/listnew";
    }






}
