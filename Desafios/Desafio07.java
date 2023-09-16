// Desafio 007 - Faça um programa que leia o preço de um produto, e 
// mostre seu novo preço, com 5% de desconto.

public class Desafio07 extends BaseDesafio
{

    public Desafio07(){}

    @Override

    public void Executar()
    {
        Double pro, disc;

        System.out.println("Informe o preço do produto:");
        pro = this.sc.nextDouble();
    
        disc = pro * 0.95;
        this.sc.close();
    
        System.out.println("\n Preço com 5% de desconto :" + disc);

    }
    
}
