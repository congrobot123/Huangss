import java.util.Scanner;

public class ReversalArray  
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int[] array = new int[10];
		System.out.println("please enter 10 digit:");
		for(int i =0; i <array.length; i++)
		{
			array[i] = scan.nextInt();
		}

		for(int j =0; j <(array.length/2); j++)
		{
			int temp = array[j];
			array[j] = array[array.length-j-1];
			array[array.length-j-1] = temp;
		}

		for(int temp : array)
		{
			System.out.print(temp + " ");
		}
	}
}
