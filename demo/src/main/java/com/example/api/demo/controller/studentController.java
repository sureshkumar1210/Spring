package com.example.api.demo.controller;

import com.example.api.demo.model.student;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.api.demo.dao.studentDao;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class studentController {

    @Autowired
     studentDao studentDao;

    @RequestMapping("index")
    public String studentList( ){
        return "index.jsp";
    }

    @RequestMapping("addUser")
    public String addUser(student student){
        studentDao.save(student);
        return "sk page";
    }

    @RequestMapping("getUser")
    public ModelAndView getUser(@RequestParam int id){

        ModelAndView mav =new ModelAndView("showUser.jsp");
        student student= studentDao.findById(id).orElse(new student());
        mav.addObject(student);
        return mav;
    }
    @RequestMapping("deleteUser")
    public ModelAndView deleteUser(@RequestParam int id){

        ModelAndView mav =new ModelAndView("deleteUser.jsp");
        student student= studentDao.findById(id).orElse(new student());
        studentDao.delete(student);
        mav.addObject(student);
        return mav;
    }

    @RequestMapping("updateUser")
    public ModelAndView updateUser(student stu)
    {
        ModelAndView mav=new ModelAndView("updateUser.jsp");
        stu= studentDao.findById(stu.getId()).orElse(new student());
        studentDao.deleteById(stu.getId());
        mav.addObject(stu);
        return mav;
    }




}
