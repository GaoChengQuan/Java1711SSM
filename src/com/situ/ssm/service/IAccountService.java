package com.situ.ssm.service;

public interface IAccountService {
	/**
	 * 从fromAccountId账户转money钱到toAccountId这个账户
	 * @param fromAccountId 转出的账户
	 * @param toAccountId 转入的账户
	 * @param money 转的钱数
	 */
	void transfer(Integer fromAccountId, Integer toAccountId, Integer money);
}
