package com.john.silverfox.biz.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.john.silverfox.biz.StrategyHelper;
import com.john.silverfox.biz.api.AccountManager;
import com.john.silverfox.biz.api.StrategyManager;
import com.john.silverfox.common.enums.TransactionTypeEnum;
import com.john.silverfox.common.enums.TrendEnum;
import com.john.silverfox.common.model.ZZSDStrategy;
import com.john.silverfox.dal.mybatis.mapper.TickRecordMapper;
import com.john.silverfox.dal.mybatis.mapper.TransactionMapper;
import com.john.silverfox.dal.mybatis.model.Account;
import com.john.silverfox.dal.mybatis.model.MyStrategy;
import com.john.silverfox.dal.mybatis.model.Strategy;
import com.john.silverfox.dal.mybatis.model.TickRecord;
import com.john.silverfox.dal.mybatis.model.Transaction;


@Service(value = "zzsdStrategyManagerImpl")
public class ZZSDStrategyManagerImpl implements StrategyManager {
	
	@Resource
	private AccountManager accountManager;
	
	@Resource
	private TickRecordMapper tickRecordMapper;
	
	@Resource
	private TransactionMapper transactionMapper;

	@Override
	public Object run(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		MyStrategy myStrategy = (MyStrategy) paramMap.get("myStrategy");
		Boolean owned = myStrategy.getOwned();
		Long accountId = myStrategy.getAccountId();
		
		Account account = accountManager.findById(accountId);
		Integer exchangeId = account.getExchangeId();
		
		Strategy strategy = (Strategy) paramMap.get("strategy");
		String strategyStr = StrategyHelper.assembly(strategy.getStrategyTemplate(), myStrategy.getStrategyContent());
		ZZSDStrategy zzsdStrategy = JSONObject.parseObject(strategyStr, ZZSDStrategy.class);
		String currencyPair = zzsdStrategy.getCurrencyPair();
		
		if (owned) {
			Transaction transaction = transactionMapper.selectLastByType(accountId, currencyPair,
					TransactionTypeEnum.BUY.code());
			String lastBuyTick = transaction.getTick();
			List<TickRecord> tickRecords = tickRecordMapper.selectAfterTick(currencyPair, exchangeId, lastBuyTick,
					zzsdStrategy.getSellTickCounts());
			
			if (CollectionUtils.isEmpty(tickRecords)) {
				return null;
			}
			
			boolean isAllUp = true;
			for (TickRecord tickRecord : tickRecords) {
				if (tickRecord.getTrend() == TrendEnum.DOWN.code()) {
					isAllUp = false;
					break;
				}
			}
			
			
		}
		
		return null;
	}

}
