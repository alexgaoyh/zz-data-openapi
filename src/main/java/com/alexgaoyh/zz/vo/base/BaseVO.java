/**
 * File : BaseVO.java <br/>
 * Author : alexgaoyh <br/>
 * Version : 1.1 <br/>
 * Date : 2017年7月19日 <br/>
 * Modify : <br/>
 * Package Name : com.alexgaoyh.zz.vo.base <br/>
 * Project Name : zz-data-openapi <br/>
 * Description : <br/>
 * 
 */

package com.alexgaoyh.zz.vo.base;

import java.io.Serializable;

import com.zhongpin.zp.common.vo.Page;

/**
 * ClassName : BaseVO <br/>
 * Function : 基础的VO类，内涵Page对象. <br/>
 * Reason : 基础的VO类，内涵Page对象. <br/>
 * Date : 2017年7月19日 上午11:40:24 <br/>
 * 
 * @author : alexgaoyh <br/>
 * @version : 1.1 <br/>
 * @since : JDK 1.6 <br/>
 * @see
 */

public class BaseVO implements Serializable {

	/**  
	 * serialVersionUID : 
	 */
	private static final long serialVersionUID = 1L;
	
	private Page page;

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "BaseVO [page=" + page + "]";
	}

}
