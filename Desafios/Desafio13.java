// Desafio 013 – o mesmo professor quer sortear um dos seus alunos para apagar o quadro. Faça um
// programa que ajude ele, lendo o nome deles e escrevendo o nome do escolhido.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Desafio13 extends BaseDesafio {

  public Desafio13() {}

  @Override

  public void Executar() {

    List<String> lista = new ArrayList<>();
    this.sc = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Informe a quantidade de alunos");
    int qtdA = this.sc.nextInt();

    for (int i = 1; i <= qtdA; i++) {
      System.out.println("Informe o nome do aluno: ");
      String Nome = this.sc.next();
      lista.add(Nome);
    }

    int indiceSorteado = random.nextInt(lista.size());
    String alunoEscolhido = lista.get(indiceSorteado);

    System.out.println("O aluno escolhido para apagar o quadro : " + alunoEscolhido);

  }

}