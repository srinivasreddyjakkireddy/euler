class Fibanacci 
{
	public static void main(String[] args) 
	{
		int f1=0,f2=1;
     int f=f1+f2;
		//System.out.println(f1);
		//System.out.println(f2);
		int sum=0;
		
		for (int i=0;i<=50;i++ )
		{
			while(f<=4000000)
		{
		 f1=f2;
		 f2=f;
		  f=f1+f2;
		  
			  if(f%2==0)
			{
			  sum+=f;
			}
			  
			}
		  
             
		}
		System.out.println(sum);
	}
}
