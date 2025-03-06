public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int lettersToFive (String line, char let)
	{
	int inst=0;
	int i;
	for (i =0; i<line.length(); i++)
	{
		if (line.charAt(i)==let)
		{
			inst++;
			if (inst==5)
			{
				return ++i;
			}
		}
	}
		return -1;
	}




	public static int countLetter(String line, char let)
	{
		int inst=0;

		for (int i=0; i<line.length(); i++)
		{
			if (line.charAt(i)==let)
			{	
				inst++;
			}
		}
		return inst;
	}






	public static int oddSum(int num1, int num2)
	{
		int sum=0;
		int start=Math.min(num1, num2);
		if (start%2==0)
		{
			start++;
		}
		for (int i=start; i<=Math.max(num1,num2); i+=2)
		{
			sum+=i;
		}
		return sum;


	}
	}



