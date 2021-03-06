package com.oa.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-23 20:54
 */
@Controller
public class IndexController {


    @RequestMapping("/index/{position}")
    public String top(@PathVariable String position){

        return "/frame/"+ position;
}

    @RequestMapping("index")
    public String index(){


        return "/frame/index";

    }

}
