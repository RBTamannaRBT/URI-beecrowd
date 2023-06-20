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
        int l=1;
        for(int i=0; i<n; i++)
        {
          int k=l;
          for(int j=0; j<n; j++)
          {
            arr[i][j]=k;
            k*=2;
          }
          l*=2;
        }
        for(int i=0; i<n; i++)
        {
          for(int j=0; j<n; j++)
          {
            if(n==1 )
            {
              System.out.print(arr[i][j]);
            }
            else if(n==2)
            {
              if(j==n-1)
              {
                System.out.print(arr[i][j]);
              }
              else
              {
                System.out.print(arr[i][j]+" ");
              }
            }
            else if(n==3 || n==4)
            {
              if(j==n-1)
              {
                System.out.print(String.format("%1$2s",""+arr[i][j]));
              }
              else
              {
                System.out.print(String.format("%1$2s",""+arr[i][j])+" ");
              }
            }
            else if(n==5)
            {
              if(j==n-1)
              {
                System.out.print(String.format("%1$3s",""+arr[i][j]));
              }
              else
              {
                System.out.print(String.format("%1$3s",""+arr[i][j])+" ");
              }
            }
            else if(n==6 || n==7)
            {
              if(j==n-1)
              {
                System.out.print(String.format("%1$4s",""+arr[i][j]));
              }
              else
              {
                System.out.print(String.format("%1$4s",""+arr[i][j])+" ");
              }
            }
            else if(n==8 || n==9)
            {
              if(j==n-1)
              {
                System.out.print(String.format("%1$5s",""+arr[i][j]));
              }
              else
              {
                System.out.print(String.format("%1$5s",""+arr[i][j])+" ");
              }
            }
            else if(n==10)
            {
              if(j==n-1)
              {
                System.out.print(String.format("%1$6s",""+arr[i][j]));
              }
              else
              {
                System.out.print(String.format("%1$6s",""+arr[i][j])+" ");
              }
            }
            else if(n==11 || n==12)
            {
              if(j==n-1)
              {
                System.out.print(String.format("%1$7s",""+arr[i][j]));
              }
              else
              {
                System.out.print(String.format("%1$7s",""+arr[i][j])+" ");
              }
            }
            else if(n==13 || n==14)
            {
              if(j==n-1)
              {
                System.out.print(String.format("%1$8s",""+arr[i][j]));
              }
              else
              {
                System.out.print(String.format("%1$8s",""+arr[i][j])+" ");
              }
            }
            else if(n==15)
            {
              if(j==n-1)
              {
                System.out.print(String.format("%1$9s",""+arr[i][j]));
              }
              else
              {
                System.out.print(String.format("%1$9s",""+arr[i][j])+" ");
              }
            }
          }
          System.out.println();
        }
        System.out.println();
      }
    }
  }
}
