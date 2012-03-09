class Primen 
{
	public static void main(String[] args) 
	{
		int i,count=0;
		
	     while(count<10002)

{		  for(i=1;i>0;i++)
		   {
			  int j;
			  for( j=2;j<i;j++)
			   { 
			     if(i%j==0)
			      {
				    break;
			      }
			   }
			
			  if(i==j)
			  {   
				 count=count+1;
				 if(count==10001)
				  {
				   System.out.println(i);
				   break;
			      }
			  } 

		    }
       }

	}
	
}
