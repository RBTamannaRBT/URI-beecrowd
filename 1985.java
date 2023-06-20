import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int p=rbt.nextInt();
    double a=0;
    for(int i=1; i<=p; i++)
    {
      int c=rbt.nextInt();
      int q=rbt.nextInt();
      if(c==1001) a+=q*1.50;
      else if(c==1002) a+=q*2.50;
      else if(c==1003) a+=q*3.50;
      else if(c==1004) a+=q*4.50;
      else if(c==1005) a+=q*5.50;
    }
    System.out.printf("%.2f\n",a);
  }
}