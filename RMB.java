import java.util.Scanner;

public class RMB 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("please enter a string:");
			
		String rmb = scan.next();
		String[] hanArr ={"Áã","Ò¼","·¡","Èş","ËÁ","Îé","Â½","Æâ","°Æ","¾Á"};
		String[] unitArr ={"Ê°", "°Û", "Úä", "Íò", "Ê°", "°Û", "Úä", "ÒÚ"};
		String result ="";
		int numLen = rmb.length();

		if(numLen < 10)
		{
			for(int i =0; i <numLen; i++)
			{
				int num = rmb.charAt(i) - 48;
				if(i != numLen -1 && num != 0)
				{
					result += hanArr[num] + unitArr[numLen - 2 -i];
				}
				else
				{
					result += hanArr[num];
				}
			}
			System.out.println(result);
		}
		else
		{
			System.out.println("error");
		}
	}
}
