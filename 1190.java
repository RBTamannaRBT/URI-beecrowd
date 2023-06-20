import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    double [][]m=new double[12][12];
    String o=rbt.next();
    double sum=0;
    int c=0;
    for(int i=0; i<12; i++)
    {
      for(int j=0; j<12; j++)
      {
        m[i][j]=rbt.nextDouble();
      }
    }
    int n=10;
    for(int i=1; i<11; i++)
    {
      for(int j=11; j>n; j--)
      {
        sum+=m[i][j];
        c++;
      }
      if(i<5)
      {
        n--;
      }
      else if(i>=6)
      {
        n++;
      }
    }
    if(o.equals("S"))
    {
      System.out.printf("%.1f\n",sum);
    }
    else if(o.equals("M"))
    {
      System.out.printf("%.1f\n",sum/c);
    }
  }
}