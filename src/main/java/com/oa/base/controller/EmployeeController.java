package com.oa.base.controller;

import com.oa.base.domain.Department;
import com.oa.base.domain.Employee;
import com.oa.base.domain.Post;
import com.oa.base.service.IDepartmentService;
import com.oa.base.service.IEmployeeService;
import com.oa.base.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-26 23:47
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeServiceImpl;

    @Autowired
    private IDepartmentService departmentService;

    @Autowired
    private IPostService postService;



    @RequestMapping("/list")
    public String index(Model model){

        List<Employee> list = employeeServiceImpl.queryAll();

        model.addAttribute("result",list);

        return "/employee/list";
    }


    @RequestMapping("/update/e")
    public String updateEmployee(Employee e,Long[] pId){

        //与employee建立关系
       Department department = departmentService.get(e.getDepartment().getId());




       Set<Post> posts = postService.queryPostByList(pId);

       e.setDepartment(department);
       e.setPosts(posts);

        if(e.getId() != null){

            employeeServiceImpl.update(e);

        }else{

            employeeServiceImpl.save(e);
        }

        return "redirect:/employee/list";
    }


    @RequestMapping("/update")
    public String updateIndex(Long id,Model model){

        List<Department> departments = departmentService.queryAll();
        List<Post> posts = postService.queryAll();

        model.addAttribute("departments",departments);
        model.addAttribute("posts",posts);

        if(id != null){

            model.addAttribute("result",employeeServiceImpl.get(id));
        }
        return "/employee/update";
    }


    @RequestMapping("/delete/e/{id}")
    public String deleteEmployee(@PathVariable Long id){

        if(id != null){
            employeeServiceImpl.delete(id);
        }
        return "redirect:/employee/list";
    }

}
