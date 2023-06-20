import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int [][]arr;
    while(rbt.hasNext())
    {
      int  n=rbt.nextInt();
      arr=new int[n][n];
      for(int i=0; i<n; i++)
      {
        int p=n-1-i;
        for(int j=0; j<n; j++)
        {
          if(i==j)  arr[i][j]=1;
          else arr[i][j]=3;
          if (j==p) arr[i][j]=2;
        }
      }
      for(int i=0; i<n; i++)
      {
        for(int j=0; j<n; j++)
        {
          System.out.print(arr[i][j]);
        }
        System.out.println();
      }
    }
  }
}
