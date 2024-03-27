package com.design.pattern.strategydesignpattern.service;

import org.springframework.stereotype.Service;

import com.design.pattern.strategydesignpattern.container.Bank;
import com.design.pattern.strategydesignpattern.container.BankCodes;

@Service
public class IciciBank implements Bank{

	@Override
	public void iniate(String bankCode) {
		System.out.print("Bank Iniate ::::"+ bankCode );
		
	}

	@Override
	public BankCodes getBankCodes() {
		return BankCodes.ICICI;
	}

}
