import java.math.BigInteger;
class Prime2m 
{
	
	public static void main(String[] args) 
	{
int i,j;
		BigInteger sum=new BigInteger("0");
		for(i=2;i<2000000;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
		   }
		   if(i==j)
			{
			 sum=sum.add(BigInteger.valueOf(i));

			}
		}
	 System.out.println(sum);
	}
}
