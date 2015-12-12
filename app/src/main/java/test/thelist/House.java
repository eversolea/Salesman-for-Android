package test.thelist;//package com.example.john.door_smart;

import java.io.*;
import java.util.Date;
//import com.google.android.gms.maps.model.LatLng;

public class House {
	 // private double xCoord;
	 // private double yCoord;
	 //private LatLng coord;
	 private String name;
	 private int response;
	 private String comment;
	 private Address address;
	 private Date date;

     // public House(double x, double y, int myResponse, String myComment, String myAddress, Date myDate)
     // public House(LatLng myCoord, int myResponse, String myComment, String myAddress, Date myDate)
	 public House(String myName, int myResponse, String myComment, String myAddress, Date myDate) {
	 	// xCoord = x;
	 	// yCoord = y;
	 	//coord = myCoord;
	 	name = myName;
	 	response = myResponse;
	 	comment = myComment;
	 	address = new Address(myAddress);
	 	date = myDate;
	 }

	 // public double getXCoord() {
	 // 	return xCoord;
	 // }

	 // public void setXCoord(float x) {
	 // 	xCoord = x;
	 // }

	 // public double getYCoord() {
	 // 	return yCoord;
	 // }

	 // public void setYCoord(float x) {
	 // 	yCoord = x;
	 // }

	 // public LatLng getCoord() {
	 // 	return coord;
	 // }

	 // public void setCoord(LatLng x) {
	 // 	coord = x;
	 // }

	 public String getName() {
	 	return name;
	 }

	 public void setName(String x) {
	 	name = x;
	 }

	 public int getResponse() {
	 	return response;
	 }

	 public void setResponse(int x) {
	 	response = x;
	 }

	 public String getComment() {
	 	return comment;
	 }

	 public void setComment(String x) {
	 	comment = x;
	 }

	 public Address getAddress() {
	 	return address;
	 }

	 public void setAddress(Address x) {
	 	address = x;
	 }

	 public Date getDate() {
	 	return date;
	 }

	 public void setDate(Date x) {
	 	date = x;
	 }

	 public void display() {
	 	// System.out.println("X Coordinate: " + xCoord);
	 	// System.out.println("Y Coordinate: " + yCoord);
	 	//System.out.println("Coordinate: " + coord.toString());

	 	System.out.println("Name: " + name);

	 	switch (response) {
	 		case 1:
	 			System.out.println("Response: Green");
	 			break;
	 		case 2:
	 			System.out.println("Response: Yellow");
	 			break;
	 		case 3:
	 			System.out.println("Response: Red");
	 			break;
	 	}

	 	System.out.println("Address: " + address.getHouseNumber() + " " + address.getStreetName().trim());
	 	System.out.println("Date added: " + date);
	 	System.out.println("Comment: " + comment);
	 }
}