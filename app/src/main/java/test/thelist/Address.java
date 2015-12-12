package test.thelist;

import java.io.*;
import java.util.Date;
//import com.google.android.gms.maps.model.LatLng;

public class Address {
	private int houseNumber;
	private String streetName;

	public Address(String myAddress) {
		String[] part = myAddress.split("(?<=\\d)(?=\\D)");
		houseNumber = Integer.parseInt(part[0]);
		streetName = part[1];
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