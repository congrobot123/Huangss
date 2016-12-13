import java.util.Scanner;

public class LikeException
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("请输入一个字符串:");

		String[] st = new String[3];
		
		for(int i =0; i < st.length; i++)
		{
			st[i] = scan.next();
		}
		if(st[0].equalsIgnoreCase("I") && st[1].equalsIgnoreCase("am") && st[2].equalsIgnoreCase("007"))
		{
			System.out.println("亲爱的007");
		}
		else
		{
			throw new Exception("对不起，请下次进入");
		}
	}
}
