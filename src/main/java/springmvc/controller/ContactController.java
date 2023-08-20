package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
//	@RequestMapping(path="/processform", method=RequestMethod.POST)
//	public String handleForm(HttpServletRequest request) {
//		
//		System.out.println("User email is "+ request.getParameter("email"));
//		return "";
//	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("email") String userEmail, 
			@RequestParam("userName") String userName,
			@RequestParam("userPassword") String userPassword,
			Model model) {
		
		System.out.println("User Email is " + userEmail);
		System.out.println("User Name is " + userName);
		System.out.println("User Password is " + userPassword);
		
		model.addAttribute("name", userName);
		model.addAttribute("email", userEmail);
		model.addAttribute("password", userPassword);
		return "success";
	}

}
