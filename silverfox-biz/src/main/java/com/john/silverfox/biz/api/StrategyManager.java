package com.john.silverfox.biz.api;

import java.util.Map;

public interface StrategyManager {
	
	Object run(Map<String, Object> paramMap) throws Exception;

}
