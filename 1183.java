import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    double [][]m=new double[12][12];
    String o=rbt.next();
    double sum=0, c=0;
    int p=1;
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
      m[i][j]=rbt.nextDouble();
      }
    }
    for(int i=0; i<12; i++){
      for(int j=p; j<12; j++){
      sum+=m[i][j];
      c++;
      }
      p++;
    }
    if(o.equals("S")){
      System.out.printf("%.1f\n",sum);
    }
    else if(o.equals("M")){
       System.out.printf("%.1f\n",sum/c);
    }
  }
}