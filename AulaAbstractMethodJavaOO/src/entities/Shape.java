package entities;

import entities.enums.Color;

public abstract class Shape {
	
	private Color color;
	
	public Shape() {}
	
	public Shape(Color color) {
		this.color = color;
	}
	
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	//método abstrato - sua presença exige que a classe seja abstrata
	public abstract double area();
	
	
}
