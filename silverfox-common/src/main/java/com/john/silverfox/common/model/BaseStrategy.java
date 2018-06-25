package com.john.silverfox.common.model;

import lombok.Data;

@Data
public class BaseStrategy {
	
	private String name;
	
	private String currencyPair;
	
	private Double stopLossRate;

}
