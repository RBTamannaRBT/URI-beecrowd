import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    double sum=0;
    for(int i=1; i<=n; i++)
    {
      sum+=2;
      sum=1/sum;
    }
    System.out.printf("%.10f\n",(sum+1));
  }
}