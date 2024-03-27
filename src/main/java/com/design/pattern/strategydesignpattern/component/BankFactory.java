package com.design.pattern.strategydesignpattern.component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.design.pattern.strategydesignpattern.container.Bank;
import com.design.pattern.strategydesignpattern.container.BankCodes;

@Component
public class BankFactory {

	Map<BankCodes,Bank> map;
	
	public BankFactory(Set<Bank> bank) {
		createStrategy(bank);
	}

	public void createStrategy(Set<Bank> bank) {
		map = new HashMap<BankCodes, Bank>();
		bank.stream().forEach(b-> map.put(b.getBankCodes(), b));
		
	}

	public Bank findBank(BankCodes bankCodes) {
		 return map.get(bankCodes);
	}
}
