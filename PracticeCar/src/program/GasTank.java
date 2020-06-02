package program;

public class GasTank extends CarPart {

	public int fuelLevel = 100;
	public GasTank() {}
	public GasTank(int num) {
		this.condition = num;
	}
	public void function()
	{
		System.out.println("The gas tank has this much fuel: " + fuelLevel);
	}
}
