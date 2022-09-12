import java.util.Scanner;

public class Contagem {

    Scanner prompt = new Scanner(System.in);
    int n, nota, cont = 0, i = 0;
    
    public void contagemdenumeros(){
      System.out.println("Quantidade de alunos: ");
      int n = prompt.nextInt();

      while(i < n){
        i = i + 1;
        System.out.println("Nota do aluno: " + i);
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
