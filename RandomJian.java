import java.util.Random;

public class RandomJian 
{
	public static void main(String[] args) 
	{
		String[] string ={"һ�Ƚ�",  "���Ƚ�", "���Ƚ�", "лл�ݹ�"};
		Random rand = new Random();

		int i = rand.nextInt(4);
		System.out.print(string[i]);
	}
}
