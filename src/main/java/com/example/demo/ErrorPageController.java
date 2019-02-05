package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.*;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;

import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.WebRequest;

@Controller
public class ErrorPageController implements ErrorController {


    private ErrorAttributes errattr;


    @Autowired
    public void setErrorAttributes(ErrorAttributes errattr){
        this.errattr = errattr;
    }


    @RequestMapping("/error")
    public String error(Model model, HttpServletRequest request, WebRequest webrequest){
        RequestAttributes ra = new ServletRequestAttributes(request);
        Map<String, Object> error= this.errattr.getErrorAttributes(webrequest, true);

        model.addAttribute("TIMESTAMP",error.get("timestamp"));
        model.addAttribute("ERROR",error.get("error"));


        return "detailedError";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }




}
