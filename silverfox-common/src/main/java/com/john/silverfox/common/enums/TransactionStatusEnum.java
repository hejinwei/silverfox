package com.john.silverfox.common.enums;


public enum TransactionStatusEnum {
	
	OPEN(1, "已挂单"),
	
	CANCELLED(2, "已取消"),
	
	DONE(3, "已完成"),
	
	;
	
	private Integer status;
	
	private String message;
	
	private TransactionStatusEnum(Integer status, String message) {
		this.status = status;
		this.message = message;
	}
	
	public Integer status() {
		return status;
	}
	
	public String message() {
		return message;
	}

}
