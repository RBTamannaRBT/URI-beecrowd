import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int a=rbt.nextInt();
    int sum=0;
    boolean stop=false;
    int n=0;
    while(!stop){
       n=rbt.nextInt();
      if(n>0){
        stop=true;
      }
    }
    for(int i=1; i<=n; i++){
      sum+=a;
      a++;
    }
    System.out.println(sum);
  }
}