package program;

public class Car {

	public CarPart parts[] = new CarPart[3];
	
	
	Wheels myWheels = new Wheels(68);
	GasTank myGas = new GasTank(25);
	Engine myEngine = new Engine(42);
	
	
	
	public Car () {
		parts[0] = myWheels;
		parts[1] = myGas;
		parts[2] = myEngine; 
		
	}
	
	
	public void run()
	{
		for(int i = 0; i < parts.length; i++)
		{
			parts[i].function();
		}
		
		//myWheels.function(); 
		//myGas.function();
		//myEngine.function();
	}
}
