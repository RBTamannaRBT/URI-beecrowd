import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int []a=new int[100];
    for(int i=0; i<a.length; i++){
      a[i]=rbt.nextInt();
    }
    int max=a[0];
    int p=0;
    for(int i=1; i<a.length; i++){
      if(a[i]>max){
        max=a[i];
        p=i;
      }
    }
    System.out.println(max);
    System.out.println(p+1);
  }
}