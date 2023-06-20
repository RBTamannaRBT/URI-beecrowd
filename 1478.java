import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    boolean tham=false;
    int [][]arr;
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
        arr=new int[n][n];
        for(int i=0; i<n; i++)
        {
          int d=i+1;
          int l=2;
          for(int j=0; j<=i; j++,d--)
          {
            arr[i][j]=d;
          }
          for(int j=i+1; j<n; j++,l++)
          {
            arr[i][j]=l;
          }
        }
        for(int i=0; i<n; i++)
        {
          for(int j=0; j<n; j++)
          {
            if(j==n-1 )
            {
              System.out.print(String.format("%1$3s",""+arr[i][j]));
            }
            else 
            {
              System.out.print(String.format("%1$3s",""+arr[i][j])+" ");
            }
          }
          System.out.println();
        }
        System.out.println();
      }
    }
  }
}
