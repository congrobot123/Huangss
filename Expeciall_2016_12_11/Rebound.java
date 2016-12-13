public class Rebound 
{
	private static double recu(int count)
	{
		if(count == 1)
		{
			return 100.0;
		}
		else
		{
			 return (1.0/2.0)*recu(count-1);
		}
	}
	public static void main(String[] args) 
	{
		double sum =0.0;
		for(int i =1; i <=11; i++)
		{
			sum += 2*recu(i);
		}

		System.out.println(recu(11));
		System.out.println("sum =" + (sum-100));
	}
?
/