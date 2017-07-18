/**
 * File : SysmanUserTest.java <br/>
 * Author : alexgaoyh <br/>
 * Version : 1.1 <br/>
 * Date : 2017年7月18日 <br/>
 * Modify : <br/>
 * Package Name : com.alexgaoyh.zz.test.base.sysman <br/>
 * Project Name : zz-data-openapi <br/>
 * Description : <br/>
 * 
 */

package com.alexgaoyh.zz.test.base.sysman;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alexgaoyh.zz.base.sysman.dao.auto.entity.SysmanUser;
import com.alexgaoyh.zz.base.sysman.servive.ISysmanUserService;
import com.zhongpin.zp.common.vo.Page;
import com.zhongpin.zp.common.vo.page.PaginationVO;

/**
 * ClassName : SysmanUserTest <br/>
 * Function : TODO ADD FUNCTION. <br/>
 * Reason : TODO ADD REASON. <br/>
 * Date : 2017年7月18日 下午1:42:54 <br/>
 * 
 * @author : alexgaoyh <br/>
 * @version : 1.1 <br/>
 * @since : JDK 1.6 <br/>
 * @see
 */

public class SysmanUserTest {

	private ISysmanUserService service;

	@Before
	public void prepare() throws Exception {
        String[] springConfigFiles = {"applicationContext.xml"};

		ApplicationContext ctx = new ClassPathXmlApplicationContext(springConfigFiles);

		service = (ISysmanUserService) ctx.getBean("sysmanUserService");

	}

	@Test
	public void generateMyPageViewVOTest() {
		String currentPageStr = "1";

		String recordPerPageStr = "10";

		int beginInt = Integer.parseInt(currentPageStr) >= 1 ? Integer.parseInt(currentPageStr) : 1;

		Page page = new Page((beginInt - 1) * Integer.parseInt(recordPerPageStr), Integer.parseInt(recordPerPageStr));

		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("page", page);

		PaginationVO<SysmanUser> pagination = service.selectPaginationByMap(map);
		
		System.out.println(pagination);
	}
}
