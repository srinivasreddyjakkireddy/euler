import java.math.BigInteger;
class Euler48
{
public static void main(String []args)
{
BigInteger sum=BigInteger.valueOf(0);

for(int i=1;i<=1000;i++)
 { 
   BigInteger mul=BigInteger.valueOf(1);
   for(int j=1;j<=i;j++)
    {
       mul=mul.multiply(BigInteger.valueOf(i));
    }
      sum=sum.add(mul);
 }
String s=sum.toString();
    for(int k=s.length()-10;k<s.length();k++)
     {
      System.out.print(s.charAt(k));
     }

}
}