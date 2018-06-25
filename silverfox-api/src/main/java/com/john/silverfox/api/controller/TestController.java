package com.john.silverfox.api.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.john.silverfox.dal.mybatis.mapper.BalanceMapper;
import com.john.silverfox.dal.mybatis.model.Balance;

@RestController
public class TestController {
	
	@Resource
	private BalanceMapper balanceMapper;
	
	@RequestMapping("/test")
	public String test() {
		Balance balance = new Balance();
		balance.setAmount(20.0);
		balance.setCurrencyName("EOS");
		balance.setAccountId(1L);
		balanceMapper.insertSelective(balance);
		return "OK";
	}

}
