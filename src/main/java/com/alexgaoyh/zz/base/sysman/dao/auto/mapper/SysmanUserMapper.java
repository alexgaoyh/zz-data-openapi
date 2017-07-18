package com.alexgaoyh.zz.base.sysman.dao.auto.mapper;

import com.alexgaoyh.zz.base.sysman.dao.auto.entity.SysmanUser;
import com.zhongpin.zp.persist.base.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;;

public interface SysmanUserMapper extends BaseMapper<SysmanUser> {
	
	int deleteByPrimaryKey(String userId);

	int selectCountByMap(Map<Object, Object> map);

	List<SysmanUser> selectListByMap(Map<Object, Object> map);

	SysmanUser selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

	int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

	int insert(SysmanUser record);

	int insertSelective(SysmanUser record);

	SysmanUser selectByPrimaryKey(String userId);

	int updateByPrimaryKeySelective(SysmanUser record);

	int updateByPrimaryKey(SysmanUser record);
}
