package com.alexgaoyh.zz.base.sysman.servive.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alexgaoyh.zz.base.sysman.dao.auto.entity.SysmanUser;
import com.alexgaoyh.zz.base.sysman.dao.auto.mapper.SysmanUserMapper;
import com.alexgaoyh.zz.base.sysman.servive.ISysmanUserService;
import com.zhongpin.zp.common.vo.page.PaginationVO;

@Service(value = "sysmanUserService")
public class SysmanUserServiceImpl implements ISysmanUserService {

	@Resource
	private SysmanUserMapper mapper;

	@Override
	public int selectCountByMap(Map<Object, Object> map) {
		return mapper.selectCountByMap(map);
	}

	@Override
	public List<SysmanUser> selectListByMap(Map<Object, Object> map) {
		return mapper.selectListByMap(map);
	}

	@Override
	public int insert(SysmanUser record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(SysmanUser record) {
		return mapper.insertSelective(record);
	}

	@Override
	public SysmanUser selectByPrimaryKey(String userId) {
		return mapper.selectByPrimaryKey(userId);
	}

	@Override
	public int updateByPrimaryKeySelective(SysmanUser record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(SysmanUser record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public PaginationVO<SysmanUser> selectPaginationByMap(Map<Object, Object> map) {
		int total = selectCountByMap(map);
		List<SysmanUser> data = selectListByMap(map);
		PaginationVO<SysmanUser> pagination = new PaginationVO<SysmanUser>(total, data);
		return pagination;
	}

}
