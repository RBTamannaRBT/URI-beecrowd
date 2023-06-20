import java.util.Scanner;
public class Main
{
  public static void main(String[] args) 
  {
    Scanner rbt = new Scanner(System.in);
   int t=rbt.nextInt();
   int c=0;
   for(int i=1; i<=5; i++)
   {
   int a=rbt.nextInt();
   if(t==a)
   {
   c++;
   }
   }
   System.out.println(c);
  }
}