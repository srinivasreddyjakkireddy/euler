class Euler30
 {
        int totsum=0;
    public static void main(String []args)
      {
             Euler30 e=new Euler30();    
             for(int i=100;i<=9999999;i++)
               {
                int sum=0,j;
                //Converting integer value to String

                 String s=String.valueOf(i);

           
                  for(int k=0;k<s.length();k++)
                      {
                       Character c=new Character(s.charAt(k));
                        
                      //converting character to String

                     String s1=c.toString();

                     //converting String to integer

                  int m=Integer.parseInt(s1);
                      j=1;
                       for(int l=1;l<=5;l++)
                        {
                           j=j*m;
                       
                        }
                      sum=sum+j;
        
                }
                   if(sum==i)
                     {
                    //System.out.println(sum);
                       e.totsum=e.totsum+sum;                    
                   
                    }    
               
           } 
            System.out.print(e.totsum);
    }
}