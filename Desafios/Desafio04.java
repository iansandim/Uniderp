// Desafio 004 - Faça um programa que leia um número inteiro e mostre na sua tela a sua tabuada.

public class Desafio04 extends BaseDesafio 
{

    public Desafio04(){}

    @Override

    public void Executar()
    {
        int num, res;

        
        System.out.println("Informe um número: ");
        num = this.sc.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            res = num * 1;

            this.sc.close();
            
            System.out.println(num +" x "+ i +" = "+ res);
            
        }
    }

}
