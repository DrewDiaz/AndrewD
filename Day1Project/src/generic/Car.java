package generic;

import java.util.List;

public class Car {

	private String make;
	private String model; 
	private int durability; 
	List<String> cargo;
	
	public Car()
	{
		
	}

	public Car(String make, String model, int durability, List<String> cargo) {
		super();
		this.make = make;
		this.model = model;
		this.durability = durability;
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", durability=" + durability + ", cargo=" + cargo + "]";
	}
	
	public void drive (int time)
	{
		int i = time;
		
		try {
			int x = 0;
			x = durability / i;
			setDurability(x);
		}
		catch(ArithmeticException e){
			
		        System.out.println("Warning: ArithmeticException");
		     
		}
		
		
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	public List<String> getCargo() {
		return cargo;
	}

	public void setCargo(List<String> cargo) {
		this.cargo = cargo;
	}
	
}
