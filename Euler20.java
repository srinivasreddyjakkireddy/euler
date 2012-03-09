import java.math.BigInteger;
class  Euler20
{
	public static void main(String[] args) 
	{
		BigInteger f=BigInteger.valueOf(1);
		for(int i=1;i<101;i++)
		{
			 f=f.multiply(BigInteger.valueOf(i));
		}
		String s=f.toString();
		BigInteger rem,sum=BigInteger.valueOf(0);
		int len=s.length();
		//System.out.println(len);
		do{
			rem=f.mod(BigInteger.valueOf(10));
			f=f.divide(BigInteger.valueOf(10));
			sum=sum.add(rem);
			len--;
		}while(len>0);

		System.out.println(sum);
	}
}
