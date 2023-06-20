import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    long []Fib=new long[61];
    Fib[0]=0;
    Fib[1]=1;
    for(int i=2; i<Fib.length; i++){
      Fib[i]=Fib[i-1]+Fib[i-2];
    }
    int n=rbt.nextInt();
    for(int i=1; i<=n; i++){
      int x=rbt.nextInt();
      System.out.println("Fib("+x+") = "+Fib[x]);
    }
  }
}