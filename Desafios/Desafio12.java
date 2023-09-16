// Desafio 012 – o mesmo professor quer agora, além de exibir, ordenar a lista. Faça um programa
// que ajude ele, lendo o nome deles e escrevendo todos os nomes armazenados, de forma
// ordenada.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio12 extends BaseDesafio

  public Desafio12() {}

  @Override

  public void Executar() {
    int qtdA;
    List<String> lista = new ArrayList();
    String Nome;

    this.sc = new Scanner(System.in);

    System.out.println("Informe a quantidade de alunos");
    qtdA = this.sc.nextInt();

    for (int i = 1; i <= qtdA; i++) {
      System.out.println("Informe o nome do aluno:");
      Nome = this.sc.next();
      lista.add(Nome);
    }

    Collections.sort(lista);// Ordena a lista
    System.out.println(lista);

  }

}