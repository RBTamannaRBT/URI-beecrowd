import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    for(int i=0; i<1; i++){
      int n=rbt.nextInt();
      if(n==1){
        System.out.println("January");
      }
      if(n==2){
        System.out.println("February");
      }
      if(n==3){
        System.out.println("March");
      }
      if(n==4){
        System.out.println("April");
      }
      if(n==5){
        System.out.println("May");
      }
      if(n==6){
        System.out.println("June");
      }
      if(n==7){
        System.out.println("July");
      }
      if(n==8){
        System.out.println("August");
      }
      if(n==9){
        System.out.println("September");
      }
      if(n==10){
        System.out.println("October");
      }
      if(n==11){
        System.out.println("November");
      }
      if(n==12){
        System.out.println("December");
      }
      if(n<0 || n>12){
        i--;
      }
    }
  }
}
