import java.util.Scanner;
import java.util.TreeSet;
import java.util.Random;
import java.util.Iterator; 

public class GetAverage 
{
	//没必要使用成员变量就不要使用成员变量，成员变量它是这个类的属性，只有是这个类属性才使用成员变量
	static int  randnum;

	public static void main(String[] args) 
	{
		int sum =0;

		TreeSet<Integer> randnums = new TreeSet<>((o1, o2) ->
			{
				return o1 > o2 ? -1
					: o1 < o2 ? 1 : 0;
			});
		
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int m = scan.nextInt();

		Random r = new Random(m);
		for(int i =0; i <m; i++)
		{
			randnum =r.nextInt(100);
			randnums.add(randnum);
		}

		System.out.print("定制排序的结果:");
		Iterator it = randnums.iterator();
		while(it.hasNext())
		{
			int rand = (int)it.next();
			sum += rand;
			System.out.print(rand + " ");
		}
		System.out.println();
		System.out.print( m + "个数的平均数:" + sum/m);
	}
}
