import java.io.File;
import java.io.IOException;

public class TestException 
{
	public static void checked() throws IOException
	{
		File f = new File("a.txt");
	}


	public static void runtime()
	{
		int a =4;
		int b =0;
		try
		{
			int c = a/b;
		}
		catch (Exception e)
		{
			System.out.println("����������Ϊ��");
		}
	}
	public static void main(String[] args) throws Exception
	{
		runtime();
		checked();
	}
}