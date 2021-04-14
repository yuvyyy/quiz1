package CarSetGetScanner;
import java.util.*;

public class Car {
	String model;
	String enginetype;
	String colour;
	double maxspeed;
	double weight;
	double price;

        Scanner s = new Scanner(System.in); 	
        
        
		void setModel() {
			System.out.println("Enter car model");
			this.model = s.nextLine();
		}
		
		void setEngineType() {
			System.out.println("Enter engine type");
			this.enginetype = s.nextLine();
		}
		
		void setColour() {
			System.out.println("Enter colour");
			this.colour = s.nextLine();
		}
		
		void setMaxSpeed() {
			System.out.println("Enter Max Speed");
			this.maxspeed = s.nextDouble();
		}
		
		void setWeight() {
			System.out.println("Enter weight");
			this.weight = s.nextDouble();
		}
		
		
		void setPrice() {
			System.out.println("Enter price");
			this.price = s.nextDouble();
		}
		//Create Getter Method
		public String getModel() {
			return this.model;
		}
		
		public String getEngineType() {
			return this.enginetype;
		}
		
		public String getColour() {
			return this.colour;
		}

		public double getMaxSpeed() {
			return this.maxspeed;
		}
		
		public double getWeight() {
			return this.weight;
		}

		public double getPrice() {
			return this.price;
		}
}

