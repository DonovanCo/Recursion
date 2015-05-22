public class Factorial
	{

	public static void main(String[] args)
		{
		System.out.println(factorial(3));
		}
	
	public static int factorial(int n)
		{
		if(n == 2)
			{
			return 3;
			}
		else
			{
			return n + factorial(n - 1);
			}
		}
	}