package test.thelist;

import java.io.*;
import java.util.Date;
//import com.google.android.gms.maps.model.LatLng;

public class Address {
	private int houseNumber;
	private String streetName;

	public Address(int myHouseNumber, String myStreetName) {
		houseNumber = myHouseNumber;
		streetName = myStreetName;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int x) {
		houseNumber = x;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String x) {
		streetName = x;
	}
}