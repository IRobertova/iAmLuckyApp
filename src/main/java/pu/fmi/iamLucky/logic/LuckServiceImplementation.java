package pu.fmi.iamLucky.logic;

import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pu.fmi.iamLucky.model.Luck;
import pu.fmi.iamLucky.model.LuckRepository;

@Service
@Transactional
public class LuckServiceImplementation implements LuckService {
	
	@Autowired
	private LuckRepository luckRepo;
	
	@Override
	public Luck getALuck() {
		
		long count = luckRepo.count();
		int c = (int)count + 1;
		long index = new Random().nextInt(c);
		if(index==0)
			index++;
		Luck luck = new Luck();
		luck = luckRepo.findById(index).get();
		String randomLuck = luck.getValue();
		System.out.println(randomLuck);
		//return " \" " + luck.getValue() + " \" " + "- " + luck.getAuthor();
		return luck;
		}
	

}
