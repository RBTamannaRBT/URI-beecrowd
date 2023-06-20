import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int p=rbt.nextInt();
    int n=rbt.nextInt();
    int []a=new int[n];
    int c=0, d=0;
    for(int i=0; i<n; i++)
    {
    a[i]=rbt.nextInt();
    if(i>0)
    {
    d=Math.abs(a[i]-a[i-1]); 
    if(d<=p) c++;
    }
    }
    if(c==n-1) System.out.println("YOU WIN");
    else System.out.println("GAME OVER");
  }
}