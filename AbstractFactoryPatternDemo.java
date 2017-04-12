
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		AbstractFactory shapefactory = FactoryProducer.getFactory("shape");//complete creation of shapefactory object
		Shape shape1 = shapefactory.getShape("circle");//complete creation of circle object with the usage of Shape interface
		shape1.draw();//using of draw() using shape1 , a shape object
		
		Shape shape2 = shapefactory.getShape("square");//complete creation of square object with the usage of Shape interface
		shape2.draw();//using of draw() using shape1 , a shape object
		
		Shape shape3 = shapefactory.getShape("rectangle");//complete creation of rectangle object with the usage of Shape interface
		shape3.draw();//using of draw() using shape1 , a shape object
		

		AbstractFactory colorfactory = FactoryProducer.getFactory("color");//complete creation of colorfactory object
		
		Color color1 = colorfactory.getColor("red");
		color1.fill();
		
		Color color2 = colorfactory.getColor("blue");
		color2.fill();
		
		Color color3 = colorfactory.getColor("green");
		color3.fill();
	}

}
