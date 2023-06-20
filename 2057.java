import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int s=rbt.nextInt();
    int t=rbt.nextInt();
    int f=rbt.nextInt();
    int sum=s+t+f;
    if(sum>24) System.out.println(sum-24);
    else if(sum<0) System.out.println(sum+24);
    else System.out.println(sum);
  }
}