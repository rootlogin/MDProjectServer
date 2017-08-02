package com.material.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liuyonglong on 16/4/19.
 */
@RestController
@RequestMapping("/login")
public class LoginApi {


    @RequestMapping
    @ResponseBody
    public String test(){
        return "test";
    }
}
