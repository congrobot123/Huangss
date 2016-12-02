import java.util.Scanner;
import java.io.File;
import java.util.HashMap;

public class FileRead
{
	public static void main(String[] args)
		throws Exception
	{
		Scanner scan = new Scanner(new File("name.txt"));

		HashMap<String,Integer> namemap = new HashMap<>();
		String name =null;
		//String score =null;
		int count = 0;

		while(scan.hasNextLine())
		{
			String string = scan.nextLine();
			//System.out.println(string);
			name = string.substring( (string.indexOf(",") + 1), (string.lastIndexOf(",")) );
			//System.out.println(name);
			if(namemap.containsKey(name))
			{
				count = namemap.get(name);
				count++;
				namemap.put(name, count);
			}
			else
			{
				namemap.put(name, 1);
			}
		}

		for(String key : namemap.keySet())
		{
			if( namemap.get(key) != 1)
			{
				System.out.println(key);
			}
		}
	}
}


