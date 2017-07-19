package com.alexgaoyh.zz.base.sysman.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alexgaoyh.zz.base.sysman.servive.ISysmanUserService;
import com.alexgaoyh.zz.vo.sysman.user.SysmanUserVO;
import com.alibaba.fastjson.JSONObject;

@Controller
@ResponseBody
@RequestMapping(value = "/sysman/user")
public class SysmanUserController {

	@Resource(name = "sysmanUserService")
	private ISysmanUserService service;

	@RequestMapping(value = "/list", produces = "text/html;charset=UTF-8")
	public String list(HttpServletRequest request, String data) {
		// data = {"page":{"begin":0,"length":10}}
		SysmanUserVO sysmanUserVO = JSONObject.parseObject(data, SysmanUserVO.class);
		System.out.println(sysmanUserVO);
		return null;
	}
	
}
