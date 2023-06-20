import java.util.Scanner;
public class Main
{
  public static void main(String[] args) 
  {
    Scanner rbt = new Scanner(System.in);
    int c=rbt.nextInt();
    for(int i=1; i<=c; i++)
    {
      int n=rbt.nextInt();
      int m=rbt.nextInt();
      if(n%m==0)
        System.out.println(n/m);
      else  System.out.println((n/m)+1);
    }
  }
}