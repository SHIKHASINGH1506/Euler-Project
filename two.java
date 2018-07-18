public class two
{
public static void main(String args[])
  {
   long x=0,y=1,z=x+y,sum=0;
      while(c<=4000000)
       { 
         z=x+y;
         x=y;
         y=z;
         
         if(z%2==0)
           sum=sum+z;
       } 
     System.out.println(sum);
  }
}