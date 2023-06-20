import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt(); 
    for(int i=1; i<=n; i++){
      int x=rbt.nextInt();
      int sum=0;
      for(int j=1; j<x; j++){
        if(x%j==0){
          sum+=j;
        }
      }
      if(sum==x){
        System.out.println(x+" eh perfeito");
      }
      else{
        System.out.println(x+" nao eh perfeito");
      }
    }
  }
}