package Exercise2;

import Exercise2.Food.Appetizer;
import Exercise2.Food.Desert;
import Exercise2.Food.MainDish;
import Exercise2.Food.Soup;

public class WeekendMenu extends Menu implements SoupOfTheDay{
	private Appetizer appetizer;
	private MainDish mainDish;
	private Soup soup;
	private Desert desert;

	public WeekendMenu(Appetizer appetizer, MainDish mainDish, Soup soup, Desert desert) {
		this.appetizer = appetizer;
		this.mainDish = mainDish;
		this.soup = soup;
		this.desert = desert;
	}

	@Override
	public String getSoupOfTheDay() {
		return "The soup of the day is: " + this.soup;
	}

	public String printMenu() {
		return "Weekend Menu\n############\nSoup: " + soup.getName() + "Main Dish: " + mainDish.getName() + "\nDesert: " + desert.getName() + "\n";
	}
}
