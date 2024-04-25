package com.app.geometry;

public class Point2D {
	int x;
	int y;
	
	public Point2D() {
		this(0,0);
	}

	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void getDetails()
	{
		String x_str = String.valueOf(x);
		String y_str = String.valueOf(y);
		System.out.println("("+x_str+","+y_str+")");
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isEqual(int x1,int y1)
	{
		if(x==x1 && y==y1)
		{
			return true; 
		}
		else
		{
			return false;
		}
	}
	
	public void calcDistance(int x1, int y1)
	{
		double distance = Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-y),2));
		System.out.println("Distance between points: "+distance);
	}
	
}
