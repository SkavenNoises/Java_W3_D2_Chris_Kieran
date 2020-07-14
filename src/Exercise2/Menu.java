package Exercise2;

import Exercise2.Food.Appetizer;
import Exercise2.Food.Desert;
import Exercise2.Food.MainDish;
import Exercise2.Food.Soup;

public class Menu {
	public static void main(String[] args) {
		Appetizer appetizer = new Appetizer("Tapas");
		MainDish mainDish = new MainDish("Tuna");
		Desert desert = new Desert("Tiramasu");
		Soup soup = new Soup("Tomato");

		WeekdayMenu weekdayMenu = new WeekdayMenu(mainDish, desert, soup);
		WeekendMenu weekendMenu = new WeekendMenu(appetizer, mainDish, soup, desert);

		System.out.println(weekdayMenu.getSoupOfTheDay());

		System.out.println(weekdayMenu.printMenu());
		System.out.println(weekendMenu.printMenu());
	}
}
