import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int []n=new int[1000];
    int t=rbt.nextInt();
    int j=0;
    for(int i=0; i<n.length; i++){
     n[i]=j;
     j++;
     if(j==t){
     j=0;
     }
     }
      for(int i=0; i<n.length; i++){
      System.out.println("N["+i+"] = "+n[i]);
    }
  }
}