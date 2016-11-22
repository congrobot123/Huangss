import java.util.Scanner;
import java.util.TreeSet;
import java.util.Random;
import java.util.Iterator; 

public class GetAverage 
{
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
		System.out.print("������һ������:");
		int m = scan.nextInt();

		Random r = new Random(m);
		for(int i =0; i <m; i++)
		{
			randnum =r.nextInt(100);
			randnums.add(randnum);
		}

		System.out.print("��������Ľ��:");
		Iterator it = randnums.iterator();
		while(it.hasNext())
		{
			int rand = (int)it.next();
			sum += rand;
			System.out.print(rand + " ");
		}
		System.out.println();
		System.out.print( m + "������ƽ����:" + sum/m);
	}
}
