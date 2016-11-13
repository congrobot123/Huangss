import java.util.Random;

public class RandomJian 
{
	public static void main(String[] args) 
	{
		String[] string ={"一等奖",  "二等奖", "三等奖", "谢谢惠顾"};
		Random rand = new Random();

		int i = rand.nextInt(4);
		System.out.print(string[i]);
	}
}
