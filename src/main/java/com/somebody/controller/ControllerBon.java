package com.somebody.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.somebody.serviece.auth.Authenticaion;
import com.somebody.serviece.equimpment.Equipment;
import com.somebody.serviece.lesson.Lesson;
import com.somebody.serviece.member.Member;
import com.somebody.serviece.pay.Pay;
import com.somebody.serviece.staff.Staff;

import beans.Centers;
import beans.Members;
import beans.Staffs;


@Controller 
public class ControllerBon {
	@Autowired
	Authenticaion auth;
	@Autowired
	Member me;
	ModelAndView mav;


	private static final Logger logger = LoggerFactory.getLogger(ControllerBon.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/meLogin", method = RequestMethod.POST)
	public ModelAndView meLogin(Model model,@ModelAttribute Members me) {
		
		System.out.println(me.getMePw());
		return this.auth.backControllerME("A02",me);
	}

	@RequestMapping(value = "/ctLogin", method = RequestMethod.POST)
	public ModelAndView ctLogin(Model model, @ModelAttribute Staffs sf) {
		System.out.println(sf.getSfCtCode());
		System.out.println(sf.getAhIp());
		return this.auth.backControllerCT("A03",sf);
	}

	@RequestMapping(value = "/logOut", method = RequestMethod.POST)
	public void logOut(Model model, @ModelAttribute Staffs sf,@ModelAttribute Members me) {
		System.out.println(sf.getSfCtCode());
		System.out.println(me.getMeCode());
		if( sf.getSfId() != null) {
			System.out.println(11);
			this.auth.backControllerCT("A04",sf);
		}else {
			System.out.println(22);
				this.auth.backControllerME("A04",me);
			}
		}
		
	

	@RequestMapping(value = "/sendEmailForm", method = RequestMethod.GET)
	public void sendEmailForm(Model model, @ModelAttribute Centers ct) {
		this.auth.backController("A05",ct);
	}

	@RequestMapping(value = "/ctJoinForm", method = RequestMethod.GET)
	public void ctJoinForm(Model model, @ModelAttribute Centers ct) {
		this.auth.backController("J01",ct);
	}

	@RequestMapping(value = "/ctJoin", method = RequestMethod.POST)
	public void ctJoin(Model model, @ModelAttribute Centers ct) {
		this.auth.backController("J02",ct);
	}
	@RequestMapping(value = "/goMePage", method = RequestMethod.POST)
	public void goMePage(Model model, @ModelAttribute Members me) {
		this.me.backController("M01", me);
	}

	




}
