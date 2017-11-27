package com.oa.base.controller;

import com.oa.base.domain.Department;
import com.oa.base.service.IDepartmentService;
import com.oa.base.service.impl.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-23 23:29
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentServiceImpl;

    @RequestMapping("/list")
    public String index(Map map){

        List<Department> list = departmentServiceImpl.queryAll();

        map.put("result",list);

        return "/department/list";
    }

    /**
     * 更新部门信息
     * @return
     */
    @RequestMapping(value = "/update/depart",method = RequestMethod.POST)
    public String addDepartment(Department department){

        if(department.getId() != null){

            departmentServiceImpl.update(department);

        }else{

            departmentServiceImpl.save(department);

        }


        return "redirect:/department/list";
    }


    @RequestMapping(value = "/delete/depart/{id}",method = RequestMethod.GET)
    public String deleteDepartment(@PathVariable("id") Long id){

        departmentServiceImpl.delete(id);

        return "redirect:/department/list";
    }


    /**
     * 跳转department 更新页面
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public String addIndex(Long id, Model model){

        if(id != null){

            Department department = departmentServiceImpl.get(id);

            model.addAttribute("dInfo",department);

        }

        return  "/department/add";
    }


}
