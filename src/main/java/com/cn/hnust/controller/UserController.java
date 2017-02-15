package com.cn.hnust.controller;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * User：    ysl
 * Date:   2017/2/14
 * Time:   21:48
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static Logger log = Logger.getLogger(UserController.class);

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser.do")
    public String toIndex(HttpServletRequest request,Model model) {

        int userId = Integer.parseInt(request.getParameter("id"));
        log.info("id:{}"+request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }

    }
