package program;

public class CarPart implements Functional {

	public int condition;
	
	public CarPart() {}
	public CarPart(int num)
	{
		if(num >= 0 && num <= 100)
		{
			this.condition = num;
		}
		else
		{
			System.out.println("This number does not fall within the acceptable 0-100 range!");
		}
	}
	
	public void status()
	{
		System.out.println("On a scale of 100 to 0, where 0 is broken, this part is at condition " + this.condition);
	}
	
	public void function() {
		
		
	}
	
}
