import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    int []x=new int[n];
    
    for(int i=0; i<n; i++){
      x[i]=rbt.nextInt();
    }
    int min=x[0], loc=0;
    for(int i=1; i<n; i++){
      if(x[i]<min){
        min=x[i];
        loc=i;
      }
    }
    
    System.out.println("Menor valor: "+min);
    System.out.println("Posicao: "+loc);
    
  }
}
