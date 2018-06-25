package com.john.silverfox.biz.api;

public interface ExchangeManager {
	
	/**
	 * @Descriptions: 取消订单然后清仓
	 * @date   2018年6月25日下午12:56:04
	 * @version 1.0
	 * @param accountId
	 * @param currencyPair
	 * @return
	 * @throws Exception
	 */
	Object cancelOrderAndClearHouse(Integer accountId, String currencyPair) throws Exception;

}
