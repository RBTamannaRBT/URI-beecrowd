import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt= new Scanner(System.in);
    int v=rbt.nextInt();
    String s=""+v;
    String []c=new String[s.length()];
    int i=0;
    while(v>0)
    {
      int m=v%16;
      v=v/16;
      if(m<=9) c[i]=""+m;
      else if(m==10) c[i]="A";
      else if(m==11) c[i]="B";
      else if(m==12) c[i]="C";
      else if(m==13) c[i]="D";
      else if(m==14) c[i]="E";
      else if(m==15) c[i]="F";
      i++;
    }
    for(int j=i-1; j>=0; j--)
    {
      System.out.print(c[j]);
    }
    System.out.println();
  }
}