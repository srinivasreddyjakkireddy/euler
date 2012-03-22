import java.math.BigInteger;
class Euler28
 {
    public static void main(String []args)
     {
            int n=1001*1001+1;      
      int arr[]=new int[n];  
         int m=1;
     BigInteger sum=BigInteger.valueOf(1);
    for(int i=1;i<n;i++)
            {
              arr[i]=i;      
  //System.out.print(arr[i]);     
            }
     for(int k=1;k<n-2;k++)
        {
            for(int j=0;j<4;j++)
              {
                   k=k+m*2;
                  sum=sum.add(BigInteger.valueOf(arr[k]));
                     
               }
                 m=m+1;
                 k=k-1;
         }
System.out.print("the sum of the numbers on the diagonals in a 1001 by 1001 spiral is "+sum);
      }
}