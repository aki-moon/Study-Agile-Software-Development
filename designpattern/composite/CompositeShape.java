package agilesoftwaredevelopment.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape implements Shape {
	private List<Shape> itsShape = new ArrayList<Shape>();

	public void add(Shape shape) {
		itsShape.add(shape);
	}

	@Override
	public void draw() {
		for (Shape shape : itsShape) {
			shape.draw();
		}
	}

}
