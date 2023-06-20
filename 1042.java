import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int []a=new int[3];
    int []b=new int[3];
    for(int i=0; i<a.length; i++){
      a[i]=rbt.nextInt();
      b[i]=a[i];
    }
    for(int i=0; i<a.length; i++){
      int min_ind=i;
      for(int j=i+1; j<a.length; j++){
        if(a[j]<a[min_ind]){
          min_ind=j;
        }
      }
      int temp=a[i];
      a[i]=a[min_ind];
      a[min_ind]=temp;
    }
    for(int i=0; i<a.length; i++){
      System.out.println(a[i]);
    }
    System.out.println();
    for(int i=0; i<a.length; i++){
      System.out.println(b[i]);
    }
  }
}