import java.util.*;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    int []o1=new int[n];
    double []o2=new double[n];
    int max=0;
    for(int i=0; i<n; i++)
    {
    o1[i]=rbt.nextInt();
    o2[i]=rbt.nextDouble();
    if(i>0 && o2[i]>o2[max]) max=i;
    }
   if(o2[max]>=8) System.out.println(o1[max]);
   else System.out.println("Minimum note not reached");
  }
}