//import java.math.BigInteger;
class Euler3 
{
	public static void main(String[] args) 
	{
		long  val=600851475143L;
		int j;
		for(int i=2;i<10000;i++)
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
				while(val%i==0)
				{
					System.out.print(" "+i);
					break;
				}
			}


		}
	}
}
