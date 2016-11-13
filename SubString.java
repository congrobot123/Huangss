import java.util.Scanner;

public class SubString 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("请输入一个字符串:");
		String string = scan.next();

		while(scan.hasNextLine())
		{
			System.out.print("请输入你需要截取的字符串:(quit退出)");
			String substring = scan.next();
			
			if(substring.equals("quit"))
			{
				return;
			}

			int index = string.indexOf(substring);
			if(substring.length() == 1)
			{
				System.out.println("截取的字符串:" + string.substring(index, index + 1));
			}
			else if(substring.length() == 2)
			{
				System.out.println("截取的字符串:" + string.substring(index, index + 2));
			}
		}
	}
}
