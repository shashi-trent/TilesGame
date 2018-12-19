package com.basics.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LoginController 
{
    
    public ModelAndView login(HttpServletRequest req, HttpServletResponse res)
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PojosConfig.class);
        
        User user = ctx.getBean("user");
        user.setName(req.getParameter("name"));
        user.setEmail(req.getParameter("email"));
        user.setkey(req.getParameter("key"));
        
        ModelAndView mv = new ModelAndView();
        mv.addObeject(user);
        mv.setViewName("welcome");
        
        return mv;
    
    }

}
