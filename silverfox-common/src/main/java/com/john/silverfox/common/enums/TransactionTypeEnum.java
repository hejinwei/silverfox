package com.john.silverfox.common.enums;

public enum TransactionTypeEnum {
	
	BUY(1),
	
	SELL(2),
	
	;
	
	private Integer code;
	
	
	private TransactionTypeEnum(Integer code) {
		this.code = code;
	}
	
	public Integer code() {
		return code;
	}
	

}
