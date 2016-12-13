import java.util.Date;
import java.text.SimpleDateFormat;
public class TestData 
{
	public static void main(String[] args) 
	{
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date d = new Date();
		String datestr = sd.format(d);
		//System.out.println(datestr);
		String[] date = datestr.split("-");
		//System.out.println(date[1]);

		if(date[1].equals("1") || date[1].equals("3") || date[1].equals("5") || date[1].equals("7") || date[1].equals("8") || date[1].equals("10") || date[1].equals("12"))
		{
			System.out.println("31");
		}
		else if(date[1].equals("2"))
		{
			int year = Integer.parseInt(date[0]);
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				System.out.println("29");
			}
			else
			{
				System.out.println("28");
			}
		}
		else
		{
			System.out.println("30");
		}
	}
}
