package program;

public class Engine extends CarPart{

	public boolean running = true;
	public Engine() {}
	public Engine(int num) {
		this.condition = num;
	}
	
	public void function()
	{
		if(running = true)
		{
			System.out.println("The engine is running!");
		}
		else
		{
			System.out.println("The engine is not running!");
		}
	}
}
