package com.john.silverfox.common.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ZZSDStrategy extends BaseStrategy {
	
	private Double firstBuyAmount;
	
	// 上涨了{continueBuyTargetPercentage}则继续买
	private Double continueBuyTargetPercentage;
	
	private Double continueBuyPercentage;
	
	private Integer buyDepth;
	
	private Integer buyTickCounts;
	
	// 最近{sellTickCounts}个tick有跌的话就要考虑卖了
	private Integer sellTickCounts;
	
	

}
