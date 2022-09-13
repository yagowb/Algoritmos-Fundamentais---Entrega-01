import java.util.Scanner;

public class Contagem {
    

  public static void main(String[] args) {
    Scanner prompt = new Scanner(System.in);
    int n, nota, cont = 0, i = 0;
    
    
      System.out.println("Quantidade de alunos: ");
      n = prompt.nextInt();

      while(i < n){
        i = i + 1;
        System.out.println("Digite a " + i + "ª nota: ");
        nota = prompt.nextInt();
        if(nota < 7){
          cont = cont + 0;
        }else {
          cont = cont + 1;
        }
      }

      System.out.println("Existem " + n + " alunos matriculados");
      System.out.println("Foram aprovados " + cont + " aprovados");
    
  }
    
}
