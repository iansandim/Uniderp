// Desafio 005 - Crie um programa que leia o quanto uma pessoa tem na carteira e mostre quantos
// dólares ela pode comprar.
// Considere US$ 1,00 = R$ 5,00

public class Desafio05 extends BaseDesafio 
{

  public Desafio05() {}

    @Override

  public void Executar()
   {
    double num, res;

    System.out.println("Informe o valor em reais:");
    num = this.sc.nextInt();
    this.sc.close();

    res = num / 5;
    System.out.println("\n O valor em dolar: "+ "$" + res);

  }
}