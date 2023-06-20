import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int []n=new int[20];
    for(int i=0; i<n.length; i++){
      n[i]=rbt.nextInt();
    }
    for(int i=0, j=n.length-1; i<n.length/2; i++, j--){
      int temp=n[j];
      n[j]=n[i];
      n[i]=temp;
    }
    for(int i=0; i<n.length; i++){
      {
        System.out.println("N["+i+"]"+" = "+n[i]);
      }
    }
  }
}