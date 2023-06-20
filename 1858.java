import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    int a[]=new int[n];
   for(int i=0; i<n; i++)
    {
      a[i]=rbt.nextInt();
      
    }
    int min=0;
    for(int j=1; j<n; j++)
    {
      if(a[j]<a[min]) min=j;
    }
    System.out.println(min+1);
  }
}