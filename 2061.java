import java.util.Scanner;
public class Main
{
  public static void main(String[] args) 
  {
    Scanner rbt = new Scanner(System.in);
    int n=rbt.nextInt();
    int m=rbt.nextInt(); 
    int c=n;
    for(int i=1; i<=m; i++)
    {
      String s=rbt.next();
      if(s.equals("fechou"))
        c++;
      else c--;
    }
    System.out.println(c);
  }
}