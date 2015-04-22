
public class RandomNumber {

	
	private int computerNum;
	
	public int Get_A_Number(int high)
	{
		computerNum = 1 + (int) (Math.random() * high);
		
		return computerNum;
	}
	
}
