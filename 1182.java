import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    double [][]m=new double[12][12];
    int c=rbt.nextInt();
    String t=rbt.next();
    double sum=0;
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
      m[i][j]=rbt.nextDouble();
      }
    }
    for(int i=0; i<12; i++){
      sum+=m[i][c];
    }
    if(t.equals("S")){
      System.out.printf("%.1f\n",sum);
    }
    else if(t.equals("M")){
      System.out.printf("%.1f\n",sum/12);
    }
  }
}