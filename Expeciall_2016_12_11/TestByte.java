import java.util.Scanner;

public class TestByte 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("������һ���ַ���str���ֽ���m:");

		String str = scan.next();
		int len = scan.nextInt();


		if (str == null) 
		{
           System.out.println("�������ַ���!");
           return;
        }

        int byteNum = str.length();
        byte bt[] = str.getBytes(); // ��Stringת����byte�ֽ�����

        if (len > byteNum) 
		{
           len = byteNum;
        }

        // �ж��Ƿ�����˽ذ룬�ذ�Ļ��ֽڶ��ڵ�ASIC����С��0��ֵ
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