// Desafio 008 – Faça um programa que leia o salário de um funcionário, e mostre seu novo salário,
// com 15% de aumento.

public class Desafio08 extends BaseDesafio
{

    public Desafio08(){}

    @Override

    public void Executar()
    {
        Double sal, salf;

        System.out.println("Informe o preço o salário: ");
        sal = this.sc.nextDouble();
        this.sc.close();
    
        salf = sal * 1.15;
        System.out.println("\nSalário com 15% de aumento: " + salf);

    }
    
}