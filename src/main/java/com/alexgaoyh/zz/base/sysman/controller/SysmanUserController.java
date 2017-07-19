package com.alexgaoyh.zz.base.sysman.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alexgaoyh.zz.base.sysman.dao.auto.entity.SysmanUser;
import com.alexgaoyh.zz.base.sysman.servive.ISysmanUserService;
import com.alexgaoyh.zz.vo.sysman.user.SysmanUserVO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.tamper.BeanMap;
import com.alibaba.tamper.core.BeanMappingException;
import com.zhongpin.zp.common.vo.page.PaginationVO;

@Controller
@ResponseBody
@RequestMapping(value = "/sysman/user")
public class SysmanUserController {

	@Resource(name = "sysmanUserService")
	private ISysmanUserService service;

	@RequestMapping(value = "/list", produces = "text/html;charset=UTF-8")
	public String list(HttpServletRequest request, String data) {
		PaginationVO<SysmanUser> pagination = new PaginationVO<SysmanUser>();
		try {
			SysmanUserVO vo = JSONObject.parseObject(data, SysmanUserVO.class);
			BeanMap sysmanUserVOBeanMap = BeanMap.create(SysmanUserVO.class);
			Map<Object, Object> map = sysmanUserVOBeanMap.describe(vo);
			pagination = service.selectPaginationByMap(map);
		}catch (BeanMappingException e) {
			e.printStackTrace();  
		}
		return JSON.toJSONString(pagination);
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
