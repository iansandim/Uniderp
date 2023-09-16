// Desafio 010 – Escreva um programa que pergunte a quantidade de km percorridos por um carro
// alugado, e a quantidade de dias pelos quais ele foi alugado. Calcule o preço a pagar, sabendo
// que o carro custa R$ 60,00 por dia e R$ 0,15 por km rodado.

public class Desafio10 extends BaseDesafio
{

    public Desafio10(){}

    @Override

    public void Executar()
    {
        Double km, d, pre;

        System.out.print("Quantidade de Km percorrido:");
        km = this.sc.nextDouble();

        System.out.print("\nQuantidade de dias alugados:");
        d = this.sc.nextDouble();
        this.sc.close();

        pre = (km * 0.15) + (d * 60);

        System.out.println("\nPreço a pagar: " + "R$" + pre);

    }
    
}