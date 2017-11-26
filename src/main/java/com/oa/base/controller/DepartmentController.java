package com.oa.base.controller;

import com.oa.base.domain.Department;
import com.oa.base.service.IDepartmentService;
import com.oa.base.service.impl.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-23 23:29
 */
@Controller
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentServiceImpl;

    @RequestMapping("/department/list")
    public String index(Map map){

        List<Department> list = departmentServiceImpl.queryAll();

        map.put("result",list);


        return "/department/list";
    }

}
