import java.util.Scanner;

public class SubString 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("������һ���ַ���:");
		String string = scan.next();

		while(scan.hasNextLine())
		{
			System.out.print("����������Ҫ��ȡ���ַ���:(quit�˳�)");
			String substring = scan.next();
			
			if(substring.equals("quit"))
			{
				return;
			}

			int index = string.indexOf(substring);
			if(substring.length() == 1)
			{
				System.out.println("��ȡ���ַ���:" + string.substring(index, index + 1));
			}
			else if(substring.length() == 2)
			{
				System.out.println("��ȡ���ַ���:" + string.substring(index, index + 2));
			}
		}
	}
}
