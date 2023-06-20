import java.util.Scanner;
public class Main 
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int c=rbt.nextInt();
    for(int i=1; i<=c; i++)
    {
      int sum=0;
      int n=rbt.nextInt();
      for(int j=1; j<=n; j++)
      {
        if(j%2==0) sum-=1;
        else sum+=1;
      }
      System.out.println(sum);
    }
  }
}