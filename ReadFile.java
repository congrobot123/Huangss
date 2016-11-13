import java.util.Scanner;
import java.io.File;

public class ReadFile 
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(new File("def.txt"));
		//scan.useDelimiter(" ");
		
		int flag = 0;
		int temp1 = 0;
		int temp2 = 0;

		while(scan.hasNext())
		{
			temp1 = scan.nextInt();
			if( flag ==0 )
			{
				System.out.print(temp1 + "+");
				temp2 = temp1;
				flag =1;
			}
			else
			{
				System.out.print(temp1 + "=");
				System.out.println(temp1 + temp2);
				flag =0;
			}
		}
	}
}
