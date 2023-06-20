import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    int j=1;
    for(int i=1; i<=n; i++){
    System.out.println(j+" "+(j+1)+" "+(j+2)+" PUM");
    j+=4;
    }
  }
}