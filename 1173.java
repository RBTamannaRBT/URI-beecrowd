import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int []n=new int[10];
    int v=rbt.nextInt();
    n[0]=v;
    int j=v*2;
    for(int i=1; i<n.length; i++){
      n[i]=j;
      j=j*2;
    }
    for(int i=0; i<n.length; i++){
      System.out.println("N["+i+"]"+" = "+n[i]);
    }
  }
}