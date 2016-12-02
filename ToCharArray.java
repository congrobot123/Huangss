import java.util.Scanner;

public class ToCharArray 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a string:");

		char[] ch =null;
		int length = 0;

		ch = scan.next().toCharArray();
		length = ch.length -1;
		for(int i =0; i <ch.length; i++)
		{
			if(ch[i] == ',')
			{
				ch[i] = ch[i+1];
				length = length -1;
			}
			System.out.print(ch[i] + " ");
		}
	}
}
