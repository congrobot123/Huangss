import java.util.Scanner;

public class TestByte 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个字符串str和字节数m:");

		String str = scan.next();
		int len = scan.nextInt();


		if (str == null) 
		{
           System.out.println("请输入字符串!");
           return;
        }

        int byteNum = str.length();
        byte bt[] = str.getBytes(); // 将String转换成byte字节数组

        if (len > byteNum) 
		{
           len = byteNum;
        }

        // 判断是否出现了截半，截半的话字节对于的ASIC码是小于0的值
        if (bt[len] < 0) 
		{
           String subStrx = str.substring(0, (--len) -1);
           System.out.println(subStrx);
        } 
		else
		{
           String subStrx = str.substring(0, len-1);
           System.out.println(subStrx);
        }
	}
}
