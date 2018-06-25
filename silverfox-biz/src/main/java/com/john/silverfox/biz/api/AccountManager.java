package com.john.silverfox.biz.api;

import com.john.silverfox.dal.mybatis.model.Account;

public interface AccountManager {
	
	Account findById(Long accountId);

}
