import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    for(int i=1; i<=n; i++){
      int sum=0;
      int x=rbt.nextInt();
      int y=rbt.nextInt();
      for(int j=1,k=x; j<=y; k++){
        if(k%2!=0){
          sum+=k;
          j++;
        }
      }
      System.out.println(sum);
    }
  }
}