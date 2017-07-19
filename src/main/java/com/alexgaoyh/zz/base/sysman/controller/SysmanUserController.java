package com.alexgaoyh.zz.base.sysman.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;

import com.alexgaoyh.zz.base.sysman.dao.auto.entity.SysmanUser;
import com.alexgaoyh.zz.base.sysman.servive.ISysmanUserService;

public class SysmanUserController {

	@Resource(name = "sysmanUserService")
	private ISysmanUserService service;

	@RequestMapping(value = "/list", produces = "text/html;charset=UTF-8")
	public String list(HttpServletRequest request, String data) {
		// data = {"page":{"begin":0,"length":10}}
		Map<Object, Object> map = new HashMap<Object, Object>();
		service.selectPaginationByMap(map);
		return null;
	}
	
	@RequestMapping(value = "/save", produces = "text/html;charset=UTF-8")
	public String save(HttpServletRequest request, String data) {
		SysmanUser record = new SysmanUser();
		service.insertSelective(record);
		return null;
	}
	
	@RequestMapping(value = "/update", produces = "text/html;charset=UTF-8")
	public String update(HttpServletRequest request, String data) {
		SysmanUser record = new SysmanUser();
		service.updateByPrimaryKeySelective(record);
		return null;
	}
	
	@RequestMapping(value = "/selectone", produces = "text/html;charset=UTF-8")
	public String selectOne(HttpServletRequest request, String data) {
		String primaryKey = "";
		service.selectByPrimaryKey(primaryKey);
		return null;
	}
			
}
