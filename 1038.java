import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int x=rbt.nextInt();
    int y=rbt.nextInt();
    double ans=1;
    if(x==1){
      ans=y*4.00;
    }
    else if(x==2){
     ans=y*4.50;
    }
    else if(x==3){
      ans=y*5.00;
    }
    else if(x==4){
     ans=y*2.00;
    }
    else if(x==5){
     ans=y*1.50;
    }
    System.out.printf("Total: R$ %.2f\n", ans);
  }
}