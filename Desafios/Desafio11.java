// Desafio 011 – um professor quer armazenas o nome dos seus alunos para realizar algumas tarefas.
// Faça um programa que ajude ele, lendo o nome deles e escrevendo todos os nomes
// armazenados.

public class Desafio11 extends BaseDesafio
{

    public Desafio11(){}

    @Override

    public void Executar()
    {
        int qtdA;
        List lista = new ArrayList();
        String Nome;

        System.out.println("Informe a quantidade de alunos");
        qtdA = this.sc.nextInt();
    
        for (int i = 1; i <= qtdA; i++) {
          System.out.println("Informe o nome do aluno:");
          Nome = this.sc.next();
          lista.add(Nome);
        }
    
        System.out.println(lista);
    }

}
    
