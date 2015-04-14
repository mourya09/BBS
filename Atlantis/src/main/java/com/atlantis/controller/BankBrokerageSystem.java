/**
 * 
 */
package com.atlantis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atlantis.vo.BrokerVO;

/**
 * @author Praveen Kumar
 *
 */

@Controller
public class BankBrokerageSystem {

	@RequestMapping("/brokerList")
	public @ResponseBody BrokerVO getBrokerList()
	{
		BrokerVO vo = new BrokerVO();
		
		vo.setBrokerID(123L);
		vo.setBrokerName("HDFC Bank");
		vo.setDescription("HDFC Bank Ltd");		
		return vo;
		
	}
	
}
