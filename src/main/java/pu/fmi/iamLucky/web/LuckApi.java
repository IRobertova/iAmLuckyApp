package pu.fmi.iamLucky.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pu.fmi.iamLucky.logic.LuckService;
import pu.fmi.iamLucky.model.Luck;

@RestController
//@RequestMapping("/home")
public class LuckApi {

	@Autowired
	private LuckService luckService;
		
	@GetMapping("/getLuck")
	public Luck getLuck() {
		return luckService.getALuck();
	}
	

}
