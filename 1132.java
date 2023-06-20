import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int x=rbt.nextInt();
    int y=rbt.nextInt();
    int sum=0;
    if(x>y){
      for(int i=y; i<=x; i++){
        if(i%13!=0){
          sum+=i;
        }
      }
    }
    else {
      for(int i=x; i<=y; i++){
        if(i%13!=0){
          sum+=i;
        }
      }
    }
    System.out.println(sum);
  }
}