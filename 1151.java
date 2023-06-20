import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    if(0<n && n<46){
      int f=0, s=1;
      System.out.print(f+" "+s);
      for(int i=3; i<=n; i++){
        int t=f+s;
        System.out.print(" "+t);
        f=s;
        s=t;
      }
    }
    System.out.println();
  }
}