import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    for(int i=1; i<=n; i++){
      int x=rbt.nextInt();
      int y=rbt.nextInt();
       int sum=0;
      if(x>y){
        for(int j=y+1; j<x; j++){
          if(j%2!=0){
            sum+=j;
          }
        }
        System.out.println(sum);
      }
      else if(y>x){
        for(int j=x+1; j<y; j++){
          if(j%2!=0){
            sum+=j;
          }
        }
        System.out.println(sum);
      }
      else if(x==y){
       System.out.println(sum);
      }
    }
  }
}