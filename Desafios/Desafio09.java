// Desafio 009 – escreva um programa que converta uma temperatura digitada em graus celsius
// para fahrenheit.

public class Desafio09 extends BaseDesafio
{

    public Desafio09(){}

    @Override

    public void Executar()
    {
        Double c, f;

        System.out.println("Informe a temperatura em Celcius:");
        c = sc.nextDouble();
        this.sc.close();

        f = (c * 1.8) + 32;
        System.out.println("\nTemperatura em Fahrenheit: " + f);

    }
    
}