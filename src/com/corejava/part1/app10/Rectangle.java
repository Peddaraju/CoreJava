package com.corejava.part1.app10;

 class Rectangle 
{
	int width = 0;
    int height = 0;
    Point origin;
    Rectangle() 
    {
    	origin = new Point(0, 0);
    }
    Rectangle(Point p) 
    {
    	origin = p;
    }
    Rectangle(int w, int h) 
    {
		origin = new Point(0, 0);
		width = w;
		height = h;
    }
    Rectangle(Point p, int w, int h) 
    {
		origin = p;
		width = w;
		height = h;
    }
    void move(int x, int y) 
    {
		origin.x = x;
		origin.y = y;
    }
    int getArea() 
    {
    	return width * height;
    }
}
