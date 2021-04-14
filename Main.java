package CarSetGetScanner;

public class Main {

	public static void main(String[] args) {
		Car X = new Car();
		
		System.out.println("----------------- Car X------------------");
		System.out.println();
		X.setModel();
		X.setEngineType();
		X.setColour();
		X.setMaxSpeed();
		X.setWeight();
		X.setPrice();
		
		System.out.println("Model " + X.getModel());
		System.out.println("Colour  " + X.getColour());
		System.out.println("EngineType " + X.getEngineType());
		System.out.println("MaxSpeed  " + X.getMaxSpeed() + " mPH ");
		System.out.println("Weight  " + X.getWeight() + " KG  " );
		System.out.println("Price  RM " + X.getPrice());
		

		System.out.println();

		System.out.println("----------------- Car Y------------------");
		System.out.println();
		Car Y = new Car();
		Y.setModel();
		Y.setEngineType();
		Y.setColour();
		Y.setMaxSpeed();
		Y.setWeight();
		Y.setPrice();
		
		System.out.println("Model " + Y.getModel());
		System.out.println("Colour  " + Y.getColour());
		System.out.println("Engine Type " + Y.getEngineType());
		System.out.println("Max Speed  " + Y.getMaxSpeed() + " mPH");
		System.out.println("Weight  " + Y.getWeight() + " KG" );
		System.out.println("Price  RM " + Y.getPrice() + " Million");
		
	}

}