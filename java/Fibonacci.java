import java.util.Scanner;

public class Fibonacci {
  Scanner prompt = new Scanner(System.in);
  int termos, a = 0, b = 1, i = 2;

  public void sequenciafibonacci(){

    System.out.println("Digite o número de termos: ");
    int termos = prompt.nextInt();

    while(i < termos){
      System.out.println(a + ", " + b + ", ");
      a+=b;
      b+=a;
      i+=2;
    }
    if(i == termos){
      System.out.println(a + ", " + b);
    }else{
      System.out.println(a);
    }
  }
}