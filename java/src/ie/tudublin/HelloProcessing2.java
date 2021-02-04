package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing2 extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
	}
	
	
	public void draw()
	{	
		background(255, 0, 0); //black
		stroke(0, 255, 0); // pen colour
		

		noStroke();
		ellipse(250, 300, 330, 345);// cx, cy, w, h
		fill(153, 1);

		triangle(270, 270, 250, 320, 300, 350);
		fill(88);

		ellipse(50, 70, 90, 100);// cx, cy, w, h
		fill(0);
	}
}
