class six{
public static void main(String args [])
{
int k = 100, sum1=0, sum2=0, diff=0;
sum1 = (k*(k+1)*(2*k+1))/6;
sum2 = (k * (k+1))/2;
diff = (sum2*sum2)-sum1;
System.out.println(diff);
}
}