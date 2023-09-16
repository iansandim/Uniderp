// Desafio 002 - Desenvolva um programa que leia as duas notas de um aluno, 
// calcule e mostre a sua média.


public class Desafio02 extends BaseDesafio
{

    public Desafio02(){}

    @Override

    public void Executar () 
    {
        double nota1, nota2, media;

        System.out.println("Informe a primeira nota: ");
        nota1 = this.sc.nextDouble();

        System.out.println("\nInforme a segunda nota: ");
        nota2 = this.sc.nextDouble();
        media = (nota1 + nota2) / 2;

        this.sc.close();

        System.out.println("\nA média das notas é: " + media);
        

    }

}