package pu.fmi.iamLucky;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pu.fmi.iamLucky.model.Luck;
import pu.fmi.iamLucky.model.LuckRepository;

@SpringBootTest
class IamLuckyApplicationTests {
	
	@Autowired
	private LuckRepository luckRepo;
	
	@Test
	void contextLoads() {
	}
	@Test
	void createLucks() {
		luckRepo.save(new Luck("All things are difficult before they are easy.", "Thomas Fuller"));
		luckRepo.save(new Luck("Life is 10% what happens to you and 90% how you react to it.","Charles R. Swindoll"));
		luckRepo.save(new Luck("The past has no power over the present moment.", "Eckhart Tolle"));
		luckRepo.save(new Luck("You cannot have a positive life and a negative mind.", "Joyce Meyer"));
		luckRepo.save(new Luck("If opportunity doesn’t knock, build a door.", "Milton Berle"));
		luckRepo.save(new Luck("We are all here for some special reason. Stop being a prisoner of your past. Become the architect of your future.", "Robin S. Sharma"));
		luckRepo.save(new Luck("Always turn a negative situation into a positive situation.", "Michael Jordan"));
		luckRepo.save(new Luck("If we’re growing, we’re always going to be out of our comfort zone.", "John C. Maxwell"));
		luckRepo.save(new Luck("If you realized how powerful your thoughts are, you would never think a negative thought.", "Peace Pilgrim"));
		luckRepo.save(new Luck("Many of life’s failures are people who did not realize how close they were to success when they gave up.", "Thomas A. Edison"));
		luckRepo.save(new Luck("It is said that the darkest hour of the night comes just before the dawn.", "Thomas Fuller"));
		luckRepo.save(new Luck("The positive thinker sees the invisible, feels the intangible , and achieves the impossible.", "Winston Churchill"));
		luckRepo.save(new Luck("I have not failed. I’ve just found 10,000 ways that won’t work.", "Thomas A. Edison"));
		luckRepo.save(new Luck("That which does not kill us makes us stronger.", "Friedrich Nietzsche"));
		luckRepo.save(new Luck("We can complain because rose bushes have thorns, or rejoice because thorn bushes have roses.", "Abraham Lincoln"));
		luckRepo.save(new Luck("Difficult roads often lead to beautiful destinations. The best is yet to come.", "Zig Ziglar"));
		luckRepo.save(new Luck("Lack of direction, not lack of time, is the problem. We all have twenty-four hour days.", "Zig Ziglar"));
		luckRepo.save(new Luck("F-E-A-R has two meanings: ‘Forget Everything And Run’ or ‘Face Everything And Rise.’ The choice is yours.", "Zig Ziglar"));
		luckRepo.save(new Luck("Don't be distracted by criticism. Remember: the only taste of success some people have is when they take a bite out of you.", "Zig Ziglar"));
		luckRepo.save(new Luck("The more you are grateful for what you have the more you will have to be grateful for.", "Zig Ziglar"));
		luckRepo.save(new Luck("Ability can take you to the top, but it takes character to keep you there.", "Zig Ziglar"));
		luckRepo.save(new Luck("Love is the absence of judgment.", "Dalai Lama XIV"));
		luckRepo.save(new Luck("Darkness cannot drive out darkness; only light can do that. Hate cannot drive out hate, only love can do that.", "Martin Luther King Jr."));
		luckRepo.save(new Luck("You don't love someone because they're perfect, you love them in spite of the fact that they're not.", "Jodi Picoult"));
		luckRepo.save(new Luck("All you need is love. But a little chocolate now and then doesn’t hurt.", "Charles M. Schulz"));
		luckRepo.save(new Luck("What can you do to promote world peace? Go home and love your family.", "Mother Teresa"));
		luckRepo.save(new Luck("I have decided to stick with love. Hate is too great a burden to bear.", "Martin Luther King Jr."));
		luckRepo.save(new Luck("We accept the love we think we deserve.", "Stephen Chbosky"));
		luckRepo.save(new Luck("Love is that condition in which the happiness of another person is essential to your own.", "Robert A. Heinlein"));
		luckRepo.save(new Luck("Above all else, guard your heart, for everything you do flows from it.", "Proverbs, Bible"));
		luckRepo.save(new Luck("Love is patient, love is kind. It does not envy, it does not boast, it is not proud. It does not dishonor others, it is not self-seeking, it is not easily angered, it keeps no record of wrongs. Love does not delight in evil but rejoices with the truth. It always protects, always trusts, always hopes, always perseveres. Love never fails.", "1 Corithians, Bible"));

	}
	
	

}
