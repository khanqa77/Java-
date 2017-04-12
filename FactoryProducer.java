
public class FactoryProducer {

	public static AbstractFactory getFactory(String choice){
	
		if (choice.equalsIgnoreCase("shape")){
			return new ShapeFactory();//vreation of a Shaape Factory class object
		}
		else if (choice.equalsIgnoreCase("color")){
			return new ColorFactory();
		}
		return null;
	}
}
