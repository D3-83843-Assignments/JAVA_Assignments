package com.app.geometry;
import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Point2D p1 = new Point2D();
		System.out.println("Enter co-ordinates for point 1: ");
		p1.setX(sc.nextInt());
		p1.setY(sc.nextInt());
		p1.getDetails();
		
		Point2D p2 = new Point2D();
		System.out.println("Enter co-ordinates for point 2: ");
		p2.setX(sc.nextInt());
		p2.setY(sc.nextInt());
		p2.getDetails();
		
		boolean eq = p1.isEqual(p2.getX(), p2.getY());
		if(eq == true)
		{
			System.out.println("Points are same..");
			System.out.println("Distance = 0");
		}
		else
		{
			System.out.println("Points are different..");
			p1.calcDistance(p2.getX(), p2.getY());
		}

	}

}
