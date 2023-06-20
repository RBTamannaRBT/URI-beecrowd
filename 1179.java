import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int []par=new int[5];
    int []impar=new int[5];
    int p=0, o=0;
    for(int i=1; i<=15; i++){
      int x=rbt.nextInt();
      if(x%2==0){
        par[p]=x;
        p++;
          if(p>=5){
          for(int j=0; j<par.length; j++){
            System.out.println("par["+j+"] = "+par[j]);
            p=0;
          }
        }
      }
      else{
        impar[o]=x;
        o++;
        if(o>=5){
          for(int k=0; k<impar.length; k++){
            System.out.println("impar["+k+"] = "+impar[k]);
            o=0;
          }
        }
      }
    }
    for(int k=0; k<o; k++){
      System.out.println("impar["+k+"] = "+impar[k]);
    }
    for(int j=0; j<p; j++){
      System.out.println("par["+j+"] = "+par[j]);
    }  
  }
}
