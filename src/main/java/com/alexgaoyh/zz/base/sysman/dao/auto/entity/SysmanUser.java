package com.alexgaoyh.zz.base.sysman.dao.auto.entity;

import com.zhongpin.zp.common.mybatis.plugin.annotation.*;
import com.zhongpin.zp.persist.base.entity.BaseEntity;
import java.io.Serializable;

@MyBatisTableAnnotation(name = "sysman_user", namespace = "com.alexgaoyh.zz.base.sysman.dao.auto.mapper.SysmanUserMapper", remarks = " 修改点 ", aliasName = "sysman_user sysman_user")
public class SysmanUser extends BaseEntity implements Serializable {
	/**
	 * 唯一主键，编码,所属表字段为sysman_user.user_id
	 */
	@MyBatisColumnAnnotation(name = "user_id", value = "sysman_user_user_id", chineseNote = "唯一主键，编码", tableAlias = "sysman_user")
	private String userId;

	/**
	 * 用户名,所属表字段为sysman_user.user_name
	 */
	@MyBatisColumnAnnotation(name = "user_name", value = "sysman_user_user_name", chineseNote = "用户名", tableAlias = "sysman_user")
	private String userName;

	/**
	 * 密码,所属表字段为sysman_user.user_pwd
	 */
	@MyBatisColumnAnnotation(name = "user_pwd", value = "sysman_user_user_pwd", chineseNote = "密码", tableAlias = "sysman_user")
	private String userPwd;

	/**
	 * 真实姓名,所属表字段为sysman_user.real_name
	 */
	@MyBatisColumnAnnotation(name = "real_name", value = "sysman_user_real_name", chineseNote = "真实姓名", tableAlias = "sysman_user")
	private String realName;

	/**
	 * 邮箱,所属表字段为sysman_user.user_email
	 */
	@MyBatisColumnAnnotation(name = "user_email", value = "sysman_user_user_email", chineseNote = "邮箱", tableAlias = "sysman_user")
	private String userEmail;

	/**
	 * 电话,所属表字段为sysman_user.user_phone
	 */
	@MyBatisColumnAnnotation(name = "user_phone", value = "sysman_user_user_phone", chineseNote = "电话", tableAlias = "sysman_user")
	private String userPhone;

	/**
	 * 职位,所属表字段为sysman_user.user_position
	 */
	@MyBatisColumnAnnotation(name = "user_position", value = "sysman_user_user_position", chineseNote = "职位", tableAlias = "sysman_user")
	private String userPosition;

	/**
	 * 职位描述,所属表字段为sysman_user.user_position_desc
	 */
	@MyBatisColumnAnnotation(name = "user_position_desc", value = "sysman_user_user_position_desc", chineseNote = "职位描述", tableAlias = "sysman_user")
	private String userPositionDesc;

	/**
	 * 状态,所属表字段为sysman_user.user_state
	 */
	@MyBatisColumnAnnotation(name = "user_state", value = "sysman_user_user_state", chineseNote = "状态", tableAlias = "sysman_user")
	private String userState;

	/**
	 * 删除标识,所属表字段为sysman_user.delete_flag
	 */
	@MyBatisColumnAnnotation(name = "delete_flag", value = "sysman_user_delete_flag", chineseNote = "删除标识", tableAlias = "sysman_user")
	private String deleteFlag;

	/**
	 * 创建人,所属表字段为sysman_user.creater_id
	 */
	@MyBatisColumnAnnotation(name = "creater_id", value = "sysman_user_creater_id", chineseNote = "创建人", tableAlias = "sysman_user")
	private String createrId;

	private static final long serialVersionUID = 1L;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserPosition() {
		return userPosition;
	}

	public void setUserPosition(String userPosition) {
		this.userPosition = userPosition;
	}

	public String getUserPositionDesc() {
		return userPositionDesc;
	}

	public void setUserPositionDesc(String userPositionDesc) {
		this.userPositionDesc = userPositionDesc;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getCreaterId() {
		return createrId;
	}

	public void setCreaterId(String createrId) {
		this.createrId = createrId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", userId=").append(userId);
		sb.append(", userName=").append(userName);
		sb.append(", userPwd=").append(userPwd);
		sb.append(", realName=").append(realName);
		sb.append(", userEmail=").append(userEmail);
		sb.append(", userPhone=").append(userPhone);
		sb.append(", userPosition=").append(userPosition);
		sb.append(", userPositionDesc=").append(userPositionDesc);
		sb.append(", userState=").append(userState);
		sb.append(", deleteFlag=").append(deleteFlag);
		sb.append(", createrId=").append(createrId);
		sb.append("]");
		return sb.toString();
	}
}
