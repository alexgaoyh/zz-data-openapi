package com.alexgaoyh.zz.base.sysman.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alexgaoyh.zz.base.sysman.servive.ISysmanUserService;

public class SysmanUserController {

	@Resource(name = "sysmanUserService")
	private ISysmanUserService service;

	@ResponseBody
	@RequestMapping(value = "/list", produces = "text/html;charset=UTF-8")
	public String list(HttpServletRequest request, String jsonData) {
		System.out.println(jsonData);
		request.getParameterNames();
		return null;
	}
}
