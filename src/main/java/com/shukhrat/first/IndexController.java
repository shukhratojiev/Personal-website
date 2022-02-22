package com.shukhrat.first;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shukhrat.dao.*;
import com.shukhrat.entity.*;


@Controller
public class IndexController {

	FeedbackDao fdao;
	Feedback fb;
	
	SubscribeDAO sdao;
	Subscribers sb;
	
   
    // public String addFeedback(@RequestParam("name") String name, @RequestParam("lastName") String lastname, @RequestParam("age") int age, @RequestParam("email") String email, @RequestParam("message") String message) {
    @RequestMapping("/addFeedback")
    public String addFeedback(@ModelAttribute Feedback feedback) { 
    
    	fdao = new FeedbackDao();
    	fdao.addFeedback(feedback);
    	
    	return "realFeedback.jsp";
    }
    
    @RequestMapping("/getFeedbacks")
    public ModelAndView getFeedBacks() {
    	fdao = new FeedbackDao();
    	
    	ModelAndView mv = new ModelAndView("feedbacks.jsp");
    	//mv.setViewName("feedbacks.jsp");
    	mv.addObject("feedbacks", fdao.getFeedbacks());
    
    	return mv; 
    }
    
    @RequestMapping("/subscribe")
    public String subscribe(@RequestParam("email") String email) {
    	
    	sdao = new SubscribeDAO();
    	
    	sb = new Subscribers();
    	sb.setEmail(email);
    	
    	sdao.subscribe(sb);
    	
    	System.out.println("subscriber added");
    	
    	return "index.jsp";
    }
    
}
