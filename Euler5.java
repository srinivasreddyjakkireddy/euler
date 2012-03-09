class Euler5 
{
	static int lcm(int a,int b)
		{
			int n;
			for(n=1;;n++)
			{
				if(n%a==0&&n%b==0)
					return n;
				
			}

		}
		
			public static void main(String[] args) 
	{
				int a=1,b=2;
				while(b<21)
	        	{
		        	a=lcm(a,b);
					b=b+1;
				}
			
			System.out.println(a);
		}
}
