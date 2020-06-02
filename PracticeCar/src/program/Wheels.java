package program;

public class Wheels extends CarPart {
	public String treadWear = "Great!";
	public Wheels() {}
	public Wheels(int num) {
		this.condition = num;
	}
	public Wheels(String quality)
	{
		this.treadWear = quality;
	}
	public void function()
	{
		System.out.println("The tread of the wheels are of this quality: " + treadWear);
	}
}
