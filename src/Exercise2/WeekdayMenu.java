package Exercise2;

import Exercise2.Food.Desert;
import Exercise2.Food.MainDish;
import Exercise2.Food.Soup;

public class WeekdayMenu extends Menu implements SoupOfTheDay {
	private MainDish mainDish;
	private Desert desert;
	private Soup soup;

	public WeekdayMenu(MainDish mainDish, Desert desert, Soup soup) {
		this.mainDish = mainDish;
		this.desert = desert;
		this.soup = soup;
	}

	@Override
	public String getSoupOfTheDay() {
		return "The soup of the day is: " + this.soup;
	}


	public String printMenu() {
		return "Weekday Menu\n############\nSoup: " + soup.getName() + "Main Dish: " + mainDish.getName() + "\nDesert: " + desert.getName() + "\n";
	}
}
