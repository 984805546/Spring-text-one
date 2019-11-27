package com.controller;/**
 * @author: fs
 * @create: 2019/11/24 19:52
 */

import com.entity.Dept;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program spring-text-one
 * @description:
 * @author: fs
 * @create: 2019/11/24 19:52
 */
@Controller
@RequestMapping("/dept")
public class HomeController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
