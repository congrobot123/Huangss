public class Rhombus 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 3; i++) 
		{ 
			for(int j = i + 1; j < 4; j++) 
			{ 
				System.out.print(" "); 
			} 
			for(int k = 0; k < (i + 1) * 2 - 1; k++) 
			{ 
				System.out.print("*"); 
			} 
			System.out.println(); 
		} 
		for(int i = 0; i < 4; i++) 
		{ 
			for(int j = 0; j < i; j++) 
			{ 
				System.out.print(" "); 
			} 
			for(int k = i; k< 8 - i - 1; k++) 
			{ 
				System.out.print("*"); 
			} 
			System.out.println(); 
		} 
	}
}
