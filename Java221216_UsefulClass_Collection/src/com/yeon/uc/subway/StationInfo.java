package com.yeon.uc.subway;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StationInfo {
	private Date when;
	private String no;
	private String name;
	private double ride;
	private double alight;

	public StationInfo() {
	}

	public StationInfo(String line) throws ParseException {

		String[] s = line.split(",");
		String w = s[0] + s[1] + s[2];
		when = new SimpleDateFormat("yyyyMMdd").parse(w);
		no = s[3];
		name = s[4];
		ride = Double.parseDouble(s[5]);
		alight = Double.parseDouble(s[6]);

	}

	public StationInfo(Date when, String no, String stationName, double ride, double alight) {
		super();
		this.when = when;
		this.no = no;
		this.name = stationName;
		this.ride = ride;
		this.alight = alight;
	}

	public Date getWhen() {
		return when;
	}

	public void setWhen(Date when) {
		this.when = when;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getStationName() {
		return name;
	}

	public void setStationName(String stationName) {
		this.name = stationName;
	}

	public double getRide() {
		return ride;
	}

	public void setRide(double ride) {
		this.ride = ride;
	}

	public double getAlight() {
		return alight;
	}

	public void setAlight(double alight) {
		this.alight = alight;
	}

	public void printInfo() {
		String w = new SimpleDateFormat("yyyy/MM/dd(E)").format(when);
		System.out.println(w);
		System.out.println(no);
		System.out.println(name);
		System.out.println(ride);
		System.out.println(alight);
	}

}
