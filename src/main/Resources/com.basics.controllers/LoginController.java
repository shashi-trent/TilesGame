package com.basics.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LoginController 
{
    
    public ModelAndView login(HttpServletRequest req, HttpServletResponse res)
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(User.class);
        
        User user = ctx.getBean("user");
        user.setName(req.getParameter("name"));
    
    }

}
