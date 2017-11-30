package com.oa.base.controller;

import com.oa.base.domain.Department;
import com.oa.base.domain.Employee;
import com.oa.base.domain.Menu;
import com.oa.base.domain.Post;
import com.oa.base.service.IDepartmentService;
import com.oa.base.service.IEmployeeService;
import com.oa.base.service.IPostService;
import com.oa.base.vo.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

        //查询所有employee信息
        List<Employee> list = employeeServiceImpl.queryAll();

        model.addAttribute("result",list);

        return "/employee/list";
    }


    @RequestMapping("/update/e")
    public String updateEmployee(Employee e,Long[] pId){

        //与employee建立关系

        //查询department
       Department department = departmentService.get(e.getDepartment().getId());


       //查询对应的post对象
       Set<Post> posts = postService.queryPostByList(pId);

       //建立关系
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

        //查询所有的department信息
        List<Department> departments = departmentService.queryAll();
        //查询所有的post信息
        List<Post> posts = postService.queryAll();

        //添加到model传递到前台
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

    @RequestMapping("/save/privilege")
    @ResponseBody
    public ResultMessage savePrivilege(Long id,Long[] ids){


        employeeServiceImpl.savePrivilege(id,ids);


        return new ResultMessage();
    }


    @RequestMapping("/privilege")
    @ResponseBody public List<Menu> queryUserPrivilege(Long id){


        return employeeServiceImpl.queryUserPrivilege(id);
    }

}
