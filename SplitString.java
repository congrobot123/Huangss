public class SplitString 
{
	public static void main(String[] args) 
	{
		String string = "A1B2C3D4E5F6G7H8";
		char[] cha = string.toCharArray();

		int[] integer = new int[8];
		String[] substring = new String[8];

		for(int i =0; i <cha.length; i++)
		{
			if(i % 2 == 0)
			{
				substring[i/2] = cha[i] + "";
			}
			else
			{
				integer[i/2] = cha[i] - '0';
			}
		}

		for(int inte : integer)
		{
			System.out.print(inte + " ");
		}
		System.out.print("\n");
		for(String sub : substring)
		{
			System.out.print(sub + " ");
		}
	}
}
