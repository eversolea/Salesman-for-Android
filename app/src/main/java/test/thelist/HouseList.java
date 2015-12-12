package test.thelist;

import java.io.*;
import java.util.*;

//import test.thelist.House;

public class HouseList {
	private ArrayList<House> houses;

	public HouseList() {
		houses = new ArrayList<House>();
	}

	public HouseList(HouseList h) {
		houses = h.houses;
	}
	
	public void addHouse(House h)
	{
		houses.add(h);
	}

	public void displayHouses() {
		for (int i = 0; i < houses.size(); i++) {
			houses.get(i).display();
			System.out.println();
		}
	}

	public HouseList sortName()
	{
		HouseList h = new HouseList(this);

		Collections.sort(h.houses, new nameComparator());
		return h;
	}
	
	public HouseList sortResponses()
	{
		HouseList h = new HouseList(this);

		Collections.sort(h.houses, new responseComparator());
		return h;
	}

	public HouseList sortDates()
	{
		HouseList h = new HouseList(this);

		Collections.sort(h.houses, new dateComparator());
		return h;
	}

	public HouseList sortAddress()
	{
		HouseList h = new HouseList(this);

		Collections.sort(h.houses, new addressComparator());
		return h;
	}

	public HouseList filterName(String myName) {
		HouseList h = new HouseList();

		for (int i = 0; i < houses.size(); i++) {
			if (houses.get(i).getName().toLowerCase().contains(myName.toLowerCase())) {
				h.addHouse(houses.get(i));
			}
		}

		return h;
	}

	public HouseList filterResponse(int myResponse) {
		HouseList h = new HouseList();

		for (int i = 0; i < houses.size(); i++) {
			if (houses.get(i).getResponse() == myResponse) {
				h.addHouse(houses.get(i));
			}
		}

		return h;
	}

	public HouseList filterDate(Date myDate) {
		HouseList h = new HouseList();

		for (int i = 0; i < houses.size(); i++) {
			if (houses.get(i).getDate().equals(myDate)) {
				h.addHouse(houses.get(i));
			}
		}

		return h;
	}

	public HouseList filterComment(String myComment) {
		HouseList h = new HouseList();

		for (int i = 0; i < houses.size(); i++) {
			if (houses.get(i).getComment().toLowerCase().contains(myComment.toLowerCase())) {
				h.addHouse(houses.get(i));
			}
		}

		return h;
	}

	//This is a nested class!
	public class nameComparator implements Comparator<House> {
    @Override
		public int compare(House h1, House h2) {
			return h1.getName().compareTo(h2.getName());
		}
	}
	
	//This is a nested class!
	public class responseComparator implements Comparator<House> {
    @Override
		public int compare(House h1, House h2) {
			return Integer.compare(h1.getResponse(), h2.getResponse());
		}
	}

	//This is a nested class!
	public class dateComparator implements Comparator<House> {
    @Override
		public int compare(House h1, House h2) {
			return h1.getDate().compareTo(h2.getDate());
		}
	}	

	//This is a nested class!
	public class addressComparator implements Comparator<House> {
    @Override
		public int compare(House h1, House h2) {
			if (h1.getAddress().getStreetName() != h2.getAddress().getStreetName()) {
				return h1.getAddress().getStreetName().compareTo(h2.getAddress().getStreetName());
			}
			else {
				return Integer.compare(h1.getAddress().getHouseNumber(), h2.getAddress().getHouseNumber());
			}
		}
	}
}