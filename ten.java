import java.util.LinkedList;
import java.util.Queue;
public class ten
{
public static void main(String args[])
{
  Queue<Long> q=new LinkedList<>();
  long p=2, sum=2;
c1: for(long i=3;i<2000000;i=i+2)
       {
         for(long a:q)
          {
            if(i%a==0)
              continue c1;
           }
           q.add(i);
            sum=sum+i;
        }
  System.out.println(sum);
 }
}

