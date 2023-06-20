import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    boolean stop=false;
    while(!stop){
      int m=rbt.nextInt();
      int  n=rbt.nextInt();
      int sum=0;
      if(m<=0 || n<=0){
        stop=true;
      }
      else if(m>n){
        for(int i=n; i<=m; i++){
          System.out.print(i+" ");
          sum+=i;
        }
        System.out.print("Sum="+sum);
      }
      else if(n>m){
        for(int i=m; i<=n; i++){
          System.out.print(i+" ");
          sum+=i;
        }
        System.out.print("Sum="+sum);
      }
      if(stop==false){
        System.out.println();
      }
    }
  }
}