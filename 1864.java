import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    String s="LIFE IS NOT A PROBLEM TO BE SOLVED";
    char []a=s.toCharArray();
    int n=rbt.nextInt();
    for(int i=0; i<n; i++)
    {
      System.out.print(a[i]);
    }
    System.out.println();
  }
}
