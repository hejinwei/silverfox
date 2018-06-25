package com.john.silverfox.common.enums;

public enum TrendEnum {
	
	UP(1, "上涨"),
	DOWN(2, "下跌"),
	NOCHANGE(3, "横盘"),
	;
	
	private Integer code;
	
	private String message;
	
	private TrendEnum(Integer code, String message) {
		this.code = code;
		
		this.message = message;
	}

	public Integer code() {
		return code;
	}
	
	public String message() {
		return message;
	}
}
