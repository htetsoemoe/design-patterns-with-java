package com.ninja.factory;

public class ShapeFactory {
	public static Shape getShape(String shapeType) {
		if (shapeType.equals("circle")) {
			return new Circle();
		} else if (shapeType.equals("rectangle")) {
			return new Rectangle();
		} else if (shapeType.equals("triangle")) {
			return new Triangle();
		} else {
			throw new IllegalArgumentException("Invalid shape type");
		}
	}
}
