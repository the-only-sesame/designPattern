package com.factory;

public class FactoryPatterDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		//获取circle的对象并且调用它的draw方法
		Shape shape1= shapeFactory.getShape("CIRCLE");
		//调用circle的draw方法
		shape1.draw();
		
		//rectangle
		Shape shape2=shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		//square
		Shape shape3= shapeFactory.getShape("SQUARE");
		shape3.draw();
	}

}
