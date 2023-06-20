import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    boolean tham=false;
    int [][]m;
    while(!tham)
    {
      int  n=rbt.nextInt();
      if(n==0)
      {
        tham=true;
        break;
      }
      else
      {
        m=new int[n][n];
        int s=0,e=n-1;
        int k=n/2;
        if(n%2!=0) k++;
        for(int p=1; p<=k; p++){
          for(int i=s; i<=e; i++)
          {
            for(int j=s; j<=e; j++)
            {
              m[i][j]=p;
            }
          }
          s++;
          e--;
        }
      }
      for(int i=0; i<n; i++)
      {
        for(int j=0; j<n; j++)
        {
          if(j==n-1 )
          {
            System.out.print(String.format("%1$3s",""+m[i][j]));
          }
          else 
          {
             System.out.print(String.format("%1$3s",""+m[i][j])+" ");
          }
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
