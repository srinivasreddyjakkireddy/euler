class Euler6Sumsq
{
	public static void main(String[] args) 
	{
	int sum1=0,sum2=0,sub,j,m;
	for(int i=1;i<=100;i++)
	{
	   j=i*i;
	sum1=sum1+j;
	}
for(int k=1;k<=100;k++)
		{
	  sum2=sum2+k;
	}
m=sum2*sum2;
sub=m-sum1;
	System.out.println(sub);
}
}