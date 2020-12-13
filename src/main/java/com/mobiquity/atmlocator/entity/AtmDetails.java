package com.mobiquity.atmlocator.entity;

import java.util.List;

/**
 * @author Himanshu Gupta
 *
 */
public class AtmDetails {
	private Address address;
	private int distance;
	private String[] functionality;
	private String type;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String[] getFunctionality() {
		return functionality;
	}

	public void setFunctionality(String[] functionality) {
		this.functionality = functionality;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "LocatorApiResponse [address=" + address + ", distance=" + distance + ", functionality=" + functionality
				+ ", type=" + type + "]";
	}

}
