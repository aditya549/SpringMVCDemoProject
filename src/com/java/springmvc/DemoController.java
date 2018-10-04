package com.java.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	@RequestMapping("/demo")
	public ModelAndView demo(HttpServletRequest req,HttpServletResponse resp) {
		String name=req.getParameter("name");
		/*ModelAndView mv=new ModelAndView();
		mv.setViewName("home.jsp");
		mv.addObject("name", name);*/
		return new ModelAndView("home.jsp", "name", name);
	}
}
