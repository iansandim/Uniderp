// Desafio 003 - Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros.

public class Desafio03 extends BaseDesafio 
{

    public Desafio03(){}

    @Override

    public void Executar()
    {
        double num, cm, mm;

        System.out.println("Informe a medida me metros :");
        num = this.sc.nextDouble();

    
        cm = num * 100;
        mm = num * 1000;

        this.sc.close();
    
        System.out.println("\nA medida em centimetros é: " + cm);
        System.out.println("\nA medida em milimetros é: " +mm);
    }

}
