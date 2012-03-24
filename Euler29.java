import java.math.BigInteger;
import java.util.*;
class Euler29
 {
     public static void main(String []args)
      {       
         
         HashSet<BigInteger> hs=new HashSet<BigInteger>();
        for(int i=2;i<=100;i++)
          {
              BigInteger k=BigInteger.valueOf(i);
             for(int m=i;m<=i;m++)           
              {
                for(int j=1;j<=99;j++)
                 {
                  k=k.multiply(BigInteger.valueOf(m));
                     hs.add(k);
                 }
           
               }
           }
             Iterator itr=hs.iterator();
              int count=0;
             while(itr.hasNext())
               { 
                 itr.next();
                   count++;
               }
             System.out.print(count);
       }       

 } 