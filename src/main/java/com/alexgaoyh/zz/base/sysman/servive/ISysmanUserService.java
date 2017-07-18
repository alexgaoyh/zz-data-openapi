package com.alexgaoyh.zz.base.sysman.servive;

import java.util.List;
import java.util.Map;

import com.alexgaoyh.zz.base.sysman.dao.auto.entity.SysmanUser;
import com.zhongpin.zp.common.vo.page.PaginationVO;

public interface ISysmanUserService {

	int selectCountByMap(Map<Object, Object> map);

	List<SysmanUser> selectListByMap(Map<Object, Object> map);
	
	int insert(SysmanUser record);

	int insertSelective(SysmanUser record);

	SysmanUser selectByPrimaryKey(String userId);

	int updateByPrimaryKeySelective(SysmanUser record);

	int updateByPrimaryKey(SysmanUser record);
	
	PaginationVO<SysmanUser> selectPaginationByMap(Map<Object, Object> map);
	
}
