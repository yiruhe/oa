package com.oa.base.controller;

import com.oa.base.domain.Post;
import com.oa.base.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-26 23:47
 */
@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private IPostService postServiceImpl;




    @RequestMapping("/list")
    public String index(Model model){

        List<Post> list = postServiceImpl.queryAll();

        model.addAttribute("result",list);

        return "/post/list";
    }


    @RequestMapping("/update/p")
    public String updatePost(Post p){

        if(p.getId() != null){

            postServiceImpl.update(p);

        }else{

            postServiceImpl.save(p);
        }

        return "redirect:/post/list";
    }


    @RequestMapping("/update")
    public String updateIndex(Long id,Model model){

        if(id != null){

            model.addAttribute("result",postServiceImpl.get(id));
        }
        return "/post/update";
    }


    @RequestMapping("/delete/p/{id}")
    public String deletePost(@PathVariable Long id){

        if(id != null){
            postServiceImpl.delete(id);
        }
        return "redirect:/post/list";
    }
}
