package test.thelist;

import java.io.*;
import java.util.Date;

public class Test {
	public static House a = new House("Beagley", 1, "Good House", "123 house rd", new Date());

	public static House b = new House("Dickson", 2, "Super racist", "596 whatever ave", new Date());

	public static House c = new House("Eversole", 3, "mean dog", "968 house rd", new Date());

	public static House d = new House("Smith", 3, "Threatened me with a gun", "785 road ln", new Date());

	public static House e = new House("Johnson", 1, "Bought a lot", "236 elm ct", new Date());

	public static House f = new House("Bobson", 2, "super good dog gun", "896 birch ave", new Date());

	public static void testCreateHouse() {
		assert a != null;

		System.out.println("It works!");
	}

	public static void testDisplayHouse() {
		a.display();
	}

	public static boolean testAddHouse()
	{
		HouseList houseList = new HouseList();
		houseList.addHouse(a);
		houseList.addHouse(b);
		houseList.addHouse(c);

		houseList.displayHouses();
		return true;
	}
	
	public static void testSortHouse()
	{
		HouseList houseList = new HouseList();

		houseList.addHouse(a);
		houseList.addHouse(b);
		houseList.addHouse(c);
		houseList.addHouse(d);
		houseList.addHouse(e);

		HouseList sortedList = houseList.sortResponses();

		sortedList.displayHouses();
	}

	public static void testSortDate()
	{
		HouseList houseList = new HouseList();

		houseList.addHouse(a);
		houseList.addHouse(b);
		houseList.addHouse(c);
		houseList.addHouse(d);
		houseList.addHouse(e);

		HouseList sortedList = houseList.sortDates();

		sortedList.displayHouses();
	}

	public static void testSortAddress()
	{
		HouseList houseList = new HouseList();

		houseList.addHouse(a);
		houseList.addHouse(b);
		houseList.addHouse(c);
		houseList.addHouse(d);
		houseList.addHouse(e);

		HouseList sortedList = houseList.sortAddress();

		sortedList.displayHouses();
	}

	public static void testFilterResponses()
	{
		HouseList houseList = new HouseList();

		houseList.addHouse(a);
		houseList.addHouse(b);
		houseList.addHouse(c);
		houseList.addHouse(d);
		houseList.addHouse(e);

		HouseList sortedList = houseList.filterResponse(1);

		sortedList.displayHouses();
	}

	public static void testFilterComment()
	{
		HouseList houseList = new HouseList();

		houseList.addHouse(a);
		houseList.addHouse(b);
		houseList.addHouse(c);
		houseList.addHouse(d);
		houseList.addHouse(e);
		houseList.addHouse(f);

		HouseList sortedList = houseList.filterComment("super");

		sortedList.displayHouses();
	}

	public static void main(String args[]) {
		System.out.println("Starting test 1...");
		testCreateHouse();
		System.out.println("Finished test 1");
		System.out.println();
		System.out.println("Starting test 2...");
		testDisplayHouse();
		System.out.println("Finished test 2");
		System.out.println();
		System.out.println("Starting test 3...");
		testAddHouse();
		System.out.println("Finished test 3");
		System.out.println();
		System.out.println("Starting test 4...");
		testSortHouse();
		System.out.println("Finished test 4");
		System.out.println("Starting test 5...");
		testSortDate();
		System.out.println("Finished test 5");
		System.out.println("Starting test 6...");
		testSortAddress();
		System.out.println("Finished test 6");
		System.out.println("Starting test 7...");
		testFilterResponses();
		System.out.println("Finished test 7");
		System.out.println("Starting test 8...");
		testFilterComment();
		System.out.println("Finished test 8");
	}
}