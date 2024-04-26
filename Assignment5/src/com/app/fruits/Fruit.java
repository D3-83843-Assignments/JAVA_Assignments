package com.app.fruits;

import java.util.Scanner;

public class Fruit {

	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruit(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public Fruit()
	{
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String taste()
	{
		return "no specific taste";
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", is fresh=" + isFresh+"]";
	}
	
	public void accept(Scanner sc)
	{
		System.out.println("Enter name: ");
		name=sc.next();
		System.out.println("Enter weight: ");
		weight=sc.nextDouble();
		System.out.println("Enter color: ");
		color = sc.next();
		System.out.println("Is fresh: ");
		isFresh = sc.nextBoolean();
	}
	
}
