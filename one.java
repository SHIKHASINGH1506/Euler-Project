class one
{
	public static void main(String args[])
	{
		int i, sum=0, mul_tr, mul_fv, exc, diff=0;
		mul_tr =1000/3;
		mul_fv = 1000/5;
		exc = 1000/15;
	   for(i=1; i<=mul_tr; i++)
		{
			sum = sum+3*i;
			if(5*i<1000)
				sum = sum+ 5*i;
		}
		for(i=1; i<=exc; i++)
		{
			diff = diff + 15*i;
		}
		
		System.out.println("The sum of all multiples of 3 and 5 less than 1000 is= " +(sum-diff));
	}
}