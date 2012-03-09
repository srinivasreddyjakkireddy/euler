class Euler4Palindrome
{
	public static void main(String[] args) 
	{
		int n=0;
		for(int i=100;i<1000;i++)
		{
			for(int j=i;j<1000;j++)
			{
				int k=i*j;
                 StringBuilder sb1=new StringBuilder(""+k);
				 String sb2=""+k;
				 sb1.reverse();
				 if(sb2.equals(sb1.toString())&&n<k)
					{
                   		n=k;
					}
			}
					
				
		}
       System.out.println(n);
	}
}
