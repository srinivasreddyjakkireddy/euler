import java.math.BigInteger;
class Fibanacci 
{
	public static void main(String[] args) 
	{
		
             BigInteger f1=BigInteger.valueOf(0);
             BigInteger f2=BigInteger.valueOf(1);
              BigInteger f;
                   f=f1.add(f2);
		int n,count=3;//let us f1,f2,f already 1st, 2nd, 3rd terns so count will be start from 3
		for(int i=0;i<5000;i++)
		{
		 f1=f2;
		 f2=f;
		  f=f1.add(f2);
           //converting BigInteger to String 
               String s=f.toString();
                  n=s.length();

                      if(n==1000)
                     {
                         //System.out.print(n); 
                    
                        break;
                     }
          //converting String to BigInteger
            BigInteger b=new BigInteger(s);
                 f=b;
                   count++;
              }
          System.out.println("the 1000 digit term will be  "+count);

	}
}