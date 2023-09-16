// Desafio 001 - Crie um programa que leia um número e mostre o seu dobro, 
// seu triplo e sua raiz quadrada.

public class Desafio01 extends BaseDesafio
{

    public Desafio01(){}

    @Override

    public void Executar()
    {
        int num;

        System.out.println("Informe um número: ");
        num = this.sc.nextInt();

        int dobro = num * 2;
        int triplo = num * 3; 
        double raiz = Math.sqrt(num); 

        this.sc.close();

        System.out.println("\nO dobro de "+num+ " é: " + dobro);
        System.out.println("O triplo de "+num+ " é: "+ triplo);
        System.out.print("A raiz quadrada de "+num+ " é: "+ raiz);

    }
    
}
