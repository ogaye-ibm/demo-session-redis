package com.bofa.demo.demosessionexternalization.controller;

import com.bofa.demo.demosessionexternalization.service.DemoSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

@Controller
public class SpringSessionController {

	@Autowired
	DemoSessionService service;


	@GetMapping("/")
	public String home(Model model, HttpSession session) {

		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
		System.out.println("*** Session ID: " + session.getId());
		service.setSessionId (session.getId());
		System.out.println("*** 2 Session ID: " + service.getSessionAttribute());


		Enumeration<String> attributes = session.getAttributeNames();

		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);

		return "index";
	}

/*	@Cacheable(value = "defaultCache")
	public void sessionAttribute (String sessionId){
		System.out.println("*** 2 Session ID: " + sessionId);
	}*/

	@PostMapping("/persistMessage")
	public String persistMessage(@RequestParam("msg") String msg, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> msgs = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (msgs == null) {
			msgs = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", msgs);
		}
		msgs.add(msg);
		request.getSession().setAttribute("MY_SESSION_MESSAGES", msgs);
		return "redirect:/";
	}

	@PostMapping("/destroy")
	public String destroySession(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/";
	}
}