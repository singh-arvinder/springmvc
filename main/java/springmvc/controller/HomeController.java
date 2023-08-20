package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home url.");
		model.addAttribute("name", "Arvinder Singh");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller.");
		return "about";
	}
	
	@RequestMapping("/")
	public String def() {
		System.out.println("This is defaul page");
		return "home";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help page.");
		
		ModelAndView mView = new ModelAndView();
		
		mView.addObject("name", "Arvinder S.");
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		mView.addObject("time", localDateTime);
		mView.setViewName("help");
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(3434);
		list.add(838);
		list.add(1111);
		
		mView.addObject("marks", list);
		
		return mView;
	}

}
