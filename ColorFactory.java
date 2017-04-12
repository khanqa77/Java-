
public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		if (colorType == null){
			return null;
		}
		else if( colorType.equalsIgnoreCase("Red"))
		{ 
			return new Red();
		}
		else if (colorType.equalsIgnoreCase("blue"))
		{ 
			return new Blue();
		}
		else if (colorType.equalsIgnoreCase("green"))
		{ 
			return new Green();
		}
		return null;
	
	}

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}


}
