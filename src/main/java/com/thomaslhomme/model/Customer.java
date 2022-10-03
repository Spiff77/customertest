package com.thomaslhomme.model;

public class Customer {

	private final String nickName;
	private int age;
	private int moneyToConvert;
	private int points;
	private String address;
	
	public Customer(String nickName, int age) {
		this.nickName = nickName;
		this.age = age;		
		if(age <= 25) this.points = 100;
	}
	
	public Customer(String nickName, int age, int moneyToConvert, int points) {
		this(nickName, age);
		this.points += points;
		this.moneyToConvert = moneyToConvert;
	}
	
	public void convert() {
		points += moneyToConvert * 15;
		moneyToConvert = 0;
	}
	
	public void addPoints(int points) {
		this.points += points;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [nickName=").append(nickName).append(", age=").append(age).append(", moneyToConvert=")
				.append(moneyToConvert).append(", points=").append(points).append(", address=").append(address)
				.append("]");
		return builder.toString();
	}

	



}
