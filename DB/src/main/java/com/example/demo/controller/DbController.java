package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.UserService;
import com.example.demo.model.Student;

@Controller
public class DbController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("index")
	public String homePage() {
		System.out.println("index meth");
		return "index";
	}
	
	@RequestMapping("courseSelected")
	public ModelAndView roomSelected(@RequestParam("courseName") String courseName) {
		System.out.println(courseName);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("register");
		mav.addObject("courseName", courseName);
		return mav;
	}
	
	@RequestMapping("save")
	public ModelAndView save(Student user) {
		System.out.println(user);
		userService.save(user);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("charges");
		mav.addObject("charge", 1000);
		return mav;
	}
	
	@RequestMapping("others")
	public ModelAndView others(@RequestParam("click") String btnName) {
		ModelAndView mav = new ModelAndView();
		System.out.println(btnName);
		switch(btnName) {
			case "Remove Register":
				mav.setViewName("delete");
				break;
			case "Update Register":
				mav.setViewName("update");
				break;
			case "Show Registers":
				mav.setViewName("show");
				break;
		}
		
		return mav;
	}
	
	@RequestMapping("delete")
	public ModelAndView delete(@RequestParam("id") String id) {
		ModelAndView mav = new ModelAndView("message");
		userService.deleteById(Integer.parseInt(id));
		mav.addObject("message", "user deleted");
		return mav;
	}
	
	@RequestMapping("show")
	public ModelAndView show(@RequestParam("id") String id) {
		ModelAndView mav = new ModelAndView("message");
		Student s = userService.findById(Integer.parseInt(id)).orElse(new Student());
		mav.addObject("message", s);
		return mav;
	}
	

	@RequestMapping("update")
	public ModelAndView update(Student s) {
		ModelAndView mav = new ModelAndView("message");
		userService.deleteById(s.getId());
		userService.save(s);
		mav.addObject("message", s);
		return mav;
	}


}
