import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    double [][]m=new double[12][12];
    char o=rbt.next().charAt(0);
    double sum=0;
    int c=0;
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
        m[i][j]=rbt.nextDouble();
      }
    }
    for(int i=1; i<12; i++){
      for(int j=0; j<i; j++){
        sum+=m[i][j];
        c++;
      }
    }
    if(o=='S'){
      System.out.printf("%.1f\n",sum);
    }
    else if(o=='M'){
      System.out.printf("%.1f\n",sum/c);
    }
  }
}