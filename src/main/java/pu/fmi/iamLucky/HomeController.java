package pu.fmi.iamLucky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pu.fmi.iamLucky.logic.LuckService;
import pu.fmi.iamLucky.model.Luck;

@Controller
public class HomeController {

	@Autowired
	private LuckService luckService;
	
	@GetMapping("/")
	public static String hello() {
		return "Welcome";
	}
	@GetMapping("getALuck")
	public String getALuck(Model model) {
		Luck luck = luckService.getALuck();
		model.addAttribute("Luck", luck);
		return "YourLuck";	}
	
}
