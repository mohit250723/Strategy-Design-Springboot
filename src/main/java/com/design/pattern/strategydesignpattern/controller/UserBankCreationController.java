package com.design.pattern.strategydesignpattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.design.pattern.strategydesignpattern.component.BankFactory;
import com.design.pattern.strategydesignpattern.container.BankCodes;

@RestController
public class UserBankCreationController {
	
	@Autowired
	BankFactory bank;
	
	@GetMapping("/startBankingWith/")
	public void iniateBankingWith(@RequestParam BankCodes code) {
		
		bank.findBank(code).iniate(code.toString());
		
		
		
	}

}
