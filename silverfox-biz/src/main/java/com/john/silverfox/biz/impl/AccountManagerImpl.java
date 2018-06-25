package com.john.silverfox.biz.impl;

import org.springframework.stereotype.Service;

import com.john.silverfox.biz.api.AccountManager;
import com.john.silverfox.dal.mybatis.mapper.AccountMapper;
import com.john.silverfox.dal.mybatis.model.Account;

@Service
public class AccountManagerImpl implements AccountManager {
	
	private AccountMapper accountMapper;

	@Override
	public Account findById(Long accountId) {
		return accountMapper.selectByPrimaryKey(accountId);
	}

}
