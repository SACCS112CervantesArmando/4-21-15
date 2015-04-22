
public class RandomNumber {

	
	private int computerNum;
	
	public int Get_A_Number()
	{
		computerNum = 1 + (int) (Math.random() * 1000);
		
		return computerNum;
	}
	
}
