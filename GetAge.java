public class GetAge 
{
	public static void main(String[] args) 
	{
		int[] age = new int[8];
		age[0] =10;

		for(int i =1; i <age.length; i++)
		{
			age[i] = age[i-1] + 2;
		}
		System.out.print(age[7]);
	}
}
